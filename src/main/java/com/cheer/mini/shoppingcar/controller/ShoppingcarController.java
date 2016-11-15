package com.cheer.mini.shoppingcar.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cheer.mini.base.exception.ServiceException;
import com.cheer.mini.base.model.ResultEntity;
import com.cheer.mini.base.model.ResultEntityHashMapImpl;
import com.cheer.mini.shoppingcar.dto.request.AddOrderlistRequest;
import com.cheer.mini.shoppingcar.service.ShoppingcarService;

@Controller
@RequestMapping("/ums/Shoppingcar")
public class ShoppingcarController {

	private ShoppingcarService shoppingcarservice;

	@RequestMapping(value = "/addproduct")
	public ResponseEntity<ResultEntity> addproduct(
			final HttpServletRequest request,
			@RequestBody AddOrderlistRequest addOrderlist)
			throws ServiceException, Exception {
		System.out.println("addproduct");
		ResultEntity result = null;
		shoppingcarservice.addAddCommodity(addOrderlist.getId(),
				addOrderlist.getPid(), addOrderlist.getNumber());

		System.out.println("dddd");

		result = new ResultEntityHashMapImpl(ResultEntity.KW_STATUS_SUCCESS,
				"成功添加至购物车");

		System.out.println(result);

		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<ResultEntity>(result, headers,
				HttpStatus.CREATED);
	}

}
