package com.cheer.mini.pms.service.commodityServiceImpl;





import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;




import org.springframework.stereotype.Service;

import com.cheer.mini.base.Constants;
import com.cheer.mini.pager.Expression;
import com.cheer.mini.pager.PageBean;
import com.cheer.mini.pms.dao.CommodityDao;
import com.cheer.mini.pms.model.Commodity;
import com.cheer.mini.pms.service.CommodityService;
import com.sun.tools.apt.Main;
import com.sun.tools.javah.MainDoclet;
@Service
public class CommodityServiceImpl implements CommodityService {
	
	 @Autowired
	 private CommodityDao commodityDao;
	
	
	//private QueryRunner qr = new TxQueryRunner();
	
	private PageBean<Commodity> findByCriteria(List<Expression> exprList,int pc) {
		/*
		 * 1.得到ps
		 * 2.得到tr
		 * 3.得到beanList
		 * 4.创建PageBean,返回
		 */
		/*
		 * 1.得到ps
		 */
		
		/*
		 * 2.通过exprList来生产where子句
		 */
		StringBuilder whereSql = new StringBuilder("where 1=1");
		List<Object> params = new ArrayList<Object>();
		for(Expression expr : exprList) {
			/*
			 * 添加一个条件，
			 * 1）.以and开头
			 * 2）.条件的名称
			 * 3）.条件的运算符，可以是=、！=、>、<...is null,is null没有值
			 * 4）.如果条件不是is null， 再追加问号，然后在params中添加一个与问号对应的值
			 */
			whereSql.append(" and ").append(expr.getName())
			.append(" ").append(expr.getOperator()).append(" ");
			if(!expr.getOperator().equals("is null")) {
				whereSql.append("?");
				params.add(expr.getValue());
			}
		}
		
		/*
		 * 3).总记录数
		 */
		String sql = "select count(*) from pms_commodity" + whereSql;
		
		
		/*
		 * 4）.得到BeanList,即当前页记录
		 */
		//String sql = "select * from pms_commodity"  + whereSql + " order by orderBy limit ?,?";
		
		return null;
		
		
	}
/*	public static void main(String[] args)  {
		CommodityServiceImpl commodityServiceImpl = new CommodityServiceImpl();
		List<Expression> exprlist = new ArrayList<Expression>();
		exprlist.add(new Expression("bid","=","1"));
		exprlist.add(new Expression("bname","like","%java%"));
		exprlist.add(new Expression("edition","is null",null));
		commodityServiceImpl.findByCriteria(exprlist, 10);
	}*/

	@Override
	public Commodity getcommodityId(String commodityid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Commodity getcommodityName(String commodityname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Commodity> getcommodityPrice(double price1, double price2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Commodity> getcommodityDetail(String commoditydetail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Commodity> getcommodityType(String commoditytype) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Commodity> getcommodityAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
