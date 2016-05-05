/* 
 * ITxnsOrderinfoDAO.java  
 * 
 * version TODO
 *
 * 2015年8月29日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.trade.dao;

import org.hibernate.Session;

import com.zlebank.zplatform.commons.dao.BaseDAO;
import com.zlebank.zplatform.trade.model.TxnsOrderinfoModel;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2015年8月29日 下午3:39:25
 * @since 
 */
public interface ITxnsOrderinfoDAO extends BaseDAO<TxnsOrderinfoModel>{

    Session getSession();
    public void updateOrderToFail(String orderNo,String merchId);
    public TxnsOrderinfoModel getOrderinfoByOrderNo(String orderNo,String merchId);
    public void updateOrderinfo(TxnsOrderinfoModel orderinfo);
    public TxnsOrderinfoModel getOrderinfoByOrderNoAndMemberId(String orderNo,String merchId);
}
