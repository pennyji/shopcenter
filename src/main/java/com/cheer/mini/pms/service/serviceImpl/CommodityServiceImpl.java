package com.cheer.mini.pms.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cheer.mini.pms.dao.CommodityDao;
import com.cheer.mini.pms.model.Commodity;
import com.cheer.mini.pms.service.CommodityService;


/*我已经定义好了方法了，接下来就是在controller层进行接收了。2016年10月26日12:49:57
 * 
 * 
 * */
@Service
public class CommodityServiceImpl implements CommodityService {
	//将DAO层自动装配进来
	@Autowired
	private CommodityDao commodityDao;

	//id查找的方法
	@Override
	public Commodity getcommodityId(String commodityid) {
		Commodity commodity=commodityDao.getcommodityId(commodityid);
		return commodity;
	}

	@Override
	public Commodity getcommodityName(String commodityname) {
		// TODO Auto-generated method stub
		return null;
	}
		
	//价格区间查找的方法
	@Override
	public List<Commodity> getcommodityPrice(double price1, double price2) {
				List<Commodity> list=getcommodityAll();
				List<Commodity> listone=new ArrayList<Commodity>();
				for (int i = 0; i < list.size(); i++) {
					double dou=list.get(i).getCommodityPrice();
					if (price1<dou&&price2>dou) {
						listone.add(list.get(i));
					} 
				}
		return listone;
	}
		
		/*
		 * 
		 * 模糊查询的方法 
		 * */
	@Override
	public List<Commodity> getcommodityDetail(String name) {
		List<Commodity> list=getcommodityAll();
		List<Commodity> listone = new ArrayList<Commodity>();
		for (int i = 0; i < list.size(); i++) {
			Commodity commodity = list.get(i);
			String str = commodity.getCommodityDetail();
			if (!"".equals(str) && str != null && str.contains(name)) {
				listone.add(commodity);
			}
		}
		return listone;
	}
	
	//类型查找的方法
	@Override
	public List<Commodity> getcommodityType(String commoditytype) {
		List<Commodity> list= commodityDao.getcommodityType(commoditytype);
		return list;
	}

	@Override
	public List<Commodity> getcommodityAll() {
		List<Commodity> list=commodityDao.getcommodityAll();
		return list;
	}

}
