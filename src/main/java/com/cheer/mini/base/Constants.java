package com.cheer.mini.base;

public class Constants {

    public class Gender
    {
        /**
         * 男
         */
        public static final short GENDER_MALE = 1;
        
        /**
         * 女
         */
        public static final short GENDER_FEMALE = 2;
    }
    
    public class AccountType{
        /**
         * 客户账号
         */
        public static final int ACCOUNT_TYPE_CUSTOMER = 100;
        
        /**
         * 管理员账号
         */
        public static final int ACCOUNT_TYPE_ADMIN = 200;
        
    }
    
    /**
     * 当前用户
     */
    public static final String CURRENT_USER = "LOGIN_USER";
    
    /**
     * 中断异常提示
     */
    public final static String INTERRUPT_EXCEPTION_ERRO_MSG = "Internal Server Error!";

    public class ProductHot{
        /**
         * r热门商品
         */
        public static final int Hot = 1;
        
        /**
         * 普通商品
         */
        public static final int NoHot = 0;
        
    }
    
    public static final int Hot = 1;
    

    public static final String LATEST_PRODUCT="LATEST_PRODUCT";
    
    public static final String PRODUCTS = "PRODUCTS";

    public class ItemStatus{
    	
    	/**
    	 * 未付款
    	 */
    	public static final int ITEM_STATUS_NOTPAY = 0;
    	
    	/**
    	 * 已付款
    	 */
    	public static final int ITEM_STATUS_PAY = 1;
    	
    }
    

}
