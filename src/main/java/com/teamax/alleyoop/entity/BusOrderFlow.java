package com.teamax.alleyoop.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class BusOrderFlow implements Serializable {
    private Integer id;

    /**
    * 订单编码
    **/
    private Integer orderCode;

    /**
    * 流程名称
    **/
    private String flowName;

    /**
    * 操作人编码
    **/
    private Integer operator;
    private SysUser optUser;
    private BusAccount optAccount;

    /**
    * 操作人类：0-平台用户；1-注册用户；
    **/
    private String operatorType;

    /**
    * 操作时间
    **/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date flowTime;

    private static final long serialVersionUID = 1L;

    public SysUser getOptUser() {
        return optUser;
    }

    public void setOptUser(SysUser optUser) {
        this.optUser = optUser;
    }

    public BusAccount getOptAccount() {
        return optAccount;
    }

    public void setOptAccount(BusAccount optAccount) {
        this.optAccount = optAccount;
    }

    public Integer getId() {
        return id;
    }

    public BusOrderFlow withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderCode() {
        return orderCode;
    }

    public BusOrderFlow withOrderCode(Integer orderCode) {
        this.setOrderCode(orderCode);
        return this;
    }

    public void setOrderCode(Integer orderCode) {
        this.orderCode = orderCode;
    }

    public String getFlowName() {
        return flowName;
    }

    public BusOrderFlow withFlowName(String flowName) {
        this.setFlowName(flowName);
        return this;
    }

    public void setFlowName(String flowName) {
        this.flowName = flowName == null ? null : flowName.trim();
    }

    public Integer getOperator() {
        return operator;
    }

    public BusOrderFlow withOperator(Integer operator) {
        this.setOperator(operator);
        return this;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public String getOperatorType() {
        return operatorType;
    }

    public BusOrderFlow withOperatorType(String operatorType) {
        this.setOperatorType(operatorType);
        return this;
    }

    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType == null ? null : operatorType.trim();
    }

    public Date getFlowTime() {
        return flowTime;
    }

    public BusOrderFlow withFlowTime(Date flowTime) {
        this.setFlowTime(flowTime);
        return this;
    }

    public void setFlowTime(Date flowTime) {
        this.flowTime = flowTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderCode=").append(orderCode);
        sb.append(", flowName=").append(flowName);
        sb.append(", operator=").append(operator);
        sb.append(", operatorType=").append(operatorType);
        sb.append(", flowTime=").append(flowTime);
        sb.append("]");
        return sb.toString();
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
        BusOrderFlow other = (BusOrderFlow) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderCode() == null ? other.getOrderCode() == null : this.getOrderCode().equals(other.getOrderCode()))
            && (this.getFlowName() == null ? other.getFlowName() == null : this.getFlowName().equals(other.getFlowName()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getOperatorType() == null ? other.getOperatorType() == null : this.getOperatorType().equals(other.getOperatorType()))
            && (this.getFlowTime() == null ? other.getFlowTime() == null : this.getFlowTime().equals(other.getFlowTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderCode() == null) ? 0 : getOrderCode().hashCode());
        result = prime * result + ((getFlowName() == null) ? 0 : getFlowName().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        result = prime * result + ((getOperatorType() == null) ? 0 : getOperatorType().hashCode());
        result = prime * result + ((getFlowTime() == null) ? 0 : getFlowTime().hashCode());
        return result;
    }
}