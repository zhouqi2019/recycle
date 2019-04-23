package com.qianfeng.po;


public class TbOrder {

  private String orderId;
  private long userId;
  private long orderPrice;
  private String linkMan;
  private String userTel;
  private String address;
  private java.sql.Timestamp pickTime1;
  private java.sql.Timestamp piceTime2;
  private String orderInfo;
  private String pickConpany;
  private String alipayName;
  private String alipay;
  private String baseInfo;
  private String functionInfo;
  private String facaedInfo;


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getOrderPrice() {
    return orderPrice;
  }

  public void setOrderPrice(long orderPrice) {
    this.orderPrice = orderPrice;
  }


  public String getLinkMan() {
    return linkMan;
  }

  public void setLinkMan(String linkMan) {
    this.linkMan = linkMan;
  }


  public String getUserTel() {
    return userTel;
  }

  public void setUserTel(String userTel) {
    this.userTel = userTel;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public java.sql.Timestamp getPickTime1() {
    return pickTime1;
  }

  public void setPickTime1(java.sql.Timestamp pickTime1) {
    this.pickTime1 = pickTime1;
  }


  public java.sql.Timestamp getPiceTime2() {
    return piceTime2;
  }

  public void setPiceTime2(java.sql.Timestamp piceTime2) {
    this.piceTime2 = piceTime2;
  }


  public String getOrderInfo() {
    return orderInfo;
  }

  public void setOrderInfo(String orderInfo) {
    this.orderInfo = orderInfo;
  }


  public String getPickConpany() {
    return pickConpany;
  }

  public void setPickConpany(String pickConpany) {
    this.pickConpany = pickConpany;
  }


  public String getAlipayName() {
    return alipayName;
  }

  public void setAlipayName(String alipayName) {
    this.alipayName = alipayName;
  }


  public String getAlipay() {
    return alipay;
  }

  public void setAlipay(String alipay) {
    this.alipay = alipay;
  }


  public String getBaseInfo() {
    return baseInfo;
  }

  public void setBaseInfo(String baseInfo) {
    this.baseInfo = baseInfo;
  }


  public String getFunctionInfo() {
    return functionInfo;
  }

  public void setFunctionInfo(String functionInfo) {
    this.functionInfo = functionInfo;
  }


  public String getFacaedInfo() {
    return facaedInfo;
  }

  public void setFacaedInfo(String facaedInfo) {
    this.facaedInfo = facaedInfo;
  }

}
