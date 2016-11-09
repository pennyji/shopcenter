package com.cheer.mini.base.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.support.json.JSONUtils;
import com.cheer.mini.base.Constants;
import com.cheer.mini.base.model.ResultEntity;
import com.cheer.mini.base.model.ResultEntityHashMapImpl;
import com.cheer.mini.base.util.LogUtil;


public class ExceptionHandler implements HandlerExceptionResolver {

    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mv = new ModelAndView("error/ajaxErrorPage");
        LogUtil.error(this.getClass(), ex.getMessage());
        String outputString = null;
        ResultEntity result = null;
        String message=null;
        if(ex instanceof ServiceException)
        {
            message = ex.getMessage();
            result = new ResultEntityHashMapImpl(ResultEntity.KW_STATUS_FAIL, ex.getMessage());
            
        }else
        {
            message =  Constants.INTERRUPT_EXCEPTION_ERRO_MSG;
            result = new ResultEntityHashMapImpl(ResultEntity.KW_STATUS_FAIL,  Constants.INTERRUPT_EXCEPTION_ERRO_MSG);
        }
        
        outputString = JSONUtils.toJSONString(result);
        mv.addObject("outputString", outputString);
        if(!"XMLHttpRequest".equals(request.getHeader("X-Requested-With")) )
        {
            mv = new ModelAndView("error/errorPage");
            mv.addObject("outputString", message);
        }
        return mv;
    }
    


}
