package com.model;

import java.math.BigDecimal;
import java.util.Date;

public class User {
    private Long trCustomerAcountId;

    private String accountName;

    private Long cuCustomerInfoId;

    private BigDecimal availbleAmount;

    private BigDecimal freezeAmount;

    private Integer paymentAccountType;

    private String paymentAccountNo;

    private String status;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private Integer versionNo;

    private String remark;

    private String autoFlag;

    public Long getTrCustomerAcountId() {
        return trCustomerAcountId;
    }

    public void setTrCustomerAcountId(Long trCustomerAcountId) {
        this.trCustomerAcountId = trCustomerAcountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Long getCuCustomerInfoId() {
        return cuCustomerInfoId;
    }

    public void setCuCustomerInfoId(Long cuCustomerInfoId) {
        this.cuCustomerInfoId = cuCustomerInfoId;
    }

    public BigDecimal getAvailbleAmount() {
        return availbleAmount;
    }

    public void setAvailbleAmount(BigDecimal availbleAmount) {
        this.availbleAmount = availbleAmount;
    }

    public BigDecimal getFreezeAmount() {
        return freezeAmount;
    }

    public void setFreezeAmount(BigDecimal freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    public Integer getPaymentAccountType() {
        return paymentAccountType;
    }

    public void setPaymentAccountType(Integer paymentAccountType) {
        this.paymentAccountType = paymentAccountType;
    }

    public String getPaymentAccountNo() {
        return paymentAccountNo;
    }

    public void setPaymentAccountNo(String paymentAccountNo) {
        this.paymentAccountNo = paymentAccountNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(Integer versionNo) {
        this.versionNo = versionNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAutoFlag() {
        return autoFlag;
    }

    public void setAutoFlag(String autoFlag) {
        this.autoFlag = autoFlag;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getTrCustomerAcountId() == null ? other.getTrCustomerAcountId() == null : this.getTrCustomerAcountId().equals(other.getTrCustomerAcountId()))
            && (this.getAccountName() == null ? other.getAccountName() == null : this.getAccountName().equals(other.getAccountName()))
            && (this.getCuCustomerInfoId() == null ? other.getCuCustomerInfoId() == null : this.getCuCustomerInfoId().equals(other.getCuCustomerInfoId()))
            && (this.getAvailbleAmount() == null ? other.getAvailbleAmount() == null : this.getAvailbleAmount().equals(other.getAvailbleAmount()))
            && (this.getFreezeAmount() == null ? other.getFreezeAmount() == null : this.getFreezeAmount().equals(other.getFreezeAmount()))
            && (this.getPaymentAccountType() == null ? other.getPaymentAccountType() == null : this.getPaymentAccountType().equals(other.getPaymentAccountType()))
            && (this.getPaymentAccountNo() == null ? other.getPaymentAccountNo() == null : this.getPaymentAccountNo().equals(other.getPaymentAccountNo()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getVersionNo() == null ? other.getVersionNo() == null : this.getVersionNo().equals(other.getVersionNo()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getAutoFlag() == null ? other.getAutoFlag() == null : this.getAutoFlag().equals(other.getAutoFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTrCustomerAcountId() == null) ? 0 : getTrCustomerAcountId().hashCode());
        result = prime * result + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        result = prime * result + ((getCuCustomerInfoId() == null) ? 0 : getCuCustomerInfoId().hashCode());
        result = prime * result + ((getAvailbleAmount() == null) ? 0 : getAvailbleAmount().hashCode());
        result = prime * result + ((getFreezeAmount() == null) ? 0 : getFreezeAmount().hashCode());
        result = prime * result + ((getPaymentAccountType() == null) ? 0 : getPaymentAccountType().hashCode());
        result = prime * result + ((getPaymentAccountNo() == null) ? 0 : getPaymentAccountNo().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getVersionNo() == null) ? 0 : getVersionNo().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getAutoFlag() == null) ? 0 : getAutoFlag().hashCode());
        return result;
    }
}