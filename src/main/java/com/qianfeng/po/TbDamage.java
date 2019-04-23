package com.qianfeng.po;


public class TbDamage {

  private long damageId;
  private long typeId;
  private String damageInfo;
  private String infoDescride;


  public long getDamageId() {
    return damageId;
  }

  public void setDamageId(long damageId) {
    this.damageId = damageId;
  }


  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }


  public String getDamageInfo() {
    return damageInfo;
  }

  public void setDamageInfo(String damageInfo) {
    this.damageInfo = damageInfo;
  }


  public String getInfoDescride() {
    return infoDescride;
  }

  public void setInfoDescride(String infoDescride) {
    this.infoDescride = infoDescride;
  }

}
