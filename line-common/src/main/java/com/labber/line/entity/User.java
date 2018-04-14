package com.labber.line.entity;

import java.util.Date;

public class User {

    public static final String ACTIVE_STATUS = "active";
    public static final String DEL_STATUS = "del";

    private Long userId;
    private String userAccount;
    private String userAccountPass;
    private String userPhone;
    private String status;
    private String token;
    private Date updateTime;
    private Date createTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserAccountPass() {
        return userAccountPass;
    }

    public void setUserAccountPass(String userAccountPass) {
        this.userAccountPass = userAccountPass == null ? null : userAccountPass.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}