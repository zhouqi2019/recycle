package com.qianfeng.po;


public class TbUser {

  private long userId;
  private String userName;
  private String password;
  private String userTel;
  private String pic;
  private long account;
  private long frozen;
  private String eMail;
  private java.sql.Timestamp userTime;
  private long level;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getUserTel() {
    return userTel;
  }

  public void setUserTel(String userTel) {
    this.userTel = userTel;
  }


  public String getPic() {
    return pic;
  }

  public void setPic(String pic) {
    this.pic = pic;
  }


  public long getAccount() {
    return account;
  }

  public void setAccount(long account) {
    this.account = account;
  }


  public long getFrozen() {
    return frozen;
  }

  public void setFrozen(long frozen) {
    this.frozen = frozen;
  }


  public String getEMail() {
    return eMail;
  }

  public void setEMail(String eMail) {
    this.eMail = eMail;
  }


  public java.sql.Timestamp getUserTime() {
    return userTime;
  }

  public void setUserTime(java.sql.Timestamp userTime) {
    this.userTime = userTime;
  }


  public long getLevel() {
    return level;
  }

  public void setLevel(long level) {
    this.level = level;
  }

}
