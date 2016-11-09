package com.cheer.mini.pms.dao;

import java.util.List;

import com.cheer.mini.pms.model.Commodity;

/*这里面对应的是mapper中对应的方法，要与mapper相对应，
自动装配后我在service里面可以随意调用这个方法。取出数据库内相应的东西

*/

public interface CommodityDao {

    public Commodity getcommodityId(String account);
    //在数据库进行判断，返回list
    public List<Commodity> getcommodityPrice(double price1, double price2);
    
    public Commodity getcommodityName(String id);
    
    public Commodity getcommodityDetail(String id);
    
    public List<Commodity> getcommodityType(String id);
    
    public List<Commodity> getcommodityAll();

}
