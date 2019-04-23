package com.qianfeng.po;


public class TbDiscount {

  private long discountId;
  private long phoneId;
  private long damageId;
  private double discountRate;


  public long getDiscountId() {
    return discountId;
  }

  public void setDiscountId(long discountId) {
    this.discountId = discountId;
  }


  public long getPhoneId() {
    return phoneId;
  }

  public void setPhoneId(long phoneId) {
    this.phoneId = phoneId;
  }


  public long getDamageId() {
    return damageId;
  }

  public void setDamageId(long damageId) {
    this.damageId = damageId;
  }


  public double getDiscountRate() {
    return discountRate;
  }

  public void setDiscountRate(double discountRate) {
    this.discountRate = discountRate;
  }

}
