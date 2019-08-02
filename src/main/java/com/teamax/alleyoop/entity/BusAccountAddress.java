package com.teamax.alleyoop.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class BusAccountAddress implements Serializable {
    /**
    * 地址编码
    **/
    private Integer addressCode;

    /**
    * 地址类型，1-物流地址，2-账单地址
    **/
    private Integer addressType;

    /**
    * 名字
    **/
    private String firstName;

    /**
    * 姓氏
    **/
    private String lastName;

    /**
    * 国家
    **/
    private String country;

    /**
    * 国家代码
    **/
    private Integer contryCode;

    /**
    * 省
    **/
    private String province;

    /**
    * 省代码
    **/
    private Integer provinceCode;

    /**
    * 城市
    **/
    private String city;

    /**
    * 地址1
    **/
    private String address;

    /**
    * 地址2
    **/
    private String address2;

    /**
    * 邮编
    **/
    private String postalCode;

    /**
    * 电话号码
    **/
    private String phoneNumber;

    /**
    * 用户ID
    **/
    private Integer accountCode;

    /**
    * 默认使用：0-未使用；1-默认使用；
    **/
    private Integer defaultUsed;

    private static final long serialVersionUID = 1L;

    public Integer getAddressCode() {
        return addressCode;
    }

    public BusAccountAddress withAddressCode(Integer addressCode) {
        this.setAddressCode(addressCode);
        return this;
    }

    public void setAddressCode(Integer addressCode) {
        this.addressCode = addressCode;
    }

    public Integer getAddressType() {
        return addressType;
    }

    public BusAccountAddress withAddressType(Integer addressType) {
        this.setAddressType(addressType);
        return this;
    }

    public void setAddressType(Integer addressType) {
        this.addressType = addressType;
    }

    public String getFirstName() {
        return firstName;
    }

    public BusAccountAddress withFirstName(String firstName) {
        this.setFirstName(firstName);
        return this;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public String getLastName() {
        return lastName;
    }

    public BusAccountAddress withLastName(String lastName) {
        this.setLastName(lastName);
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    public String getCountry() {
        return country;
    }

    public BusAccountAddress withCountry(String country) {
        this.setCountry(country);
        return this;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public Integer getContryCode() {
        return contryCode;
    }

    public BusAccountAddress withContryCode(Integer contryCode) {
        this.setContryCode(contryCode);
        return this;
    }

    public void setContryCode(Integer contryCode) {
        this.contryCode = contryCode;
    }

    public String getProvince() {
        return province;
    }

    public BusAccountAddress withProvince(String province) {
        this.setProvince(province);
        return this;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public Integer getProvinceCode() {
        return provinceCode;
    }

    public BusAccountAddress withProvinceCode(Integer provinceCode) {
        this.setProvinceCode(provinceCode);
        return this;
    }

    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCity() {
        return city;
    }

    public BusAccountAddress withCity(String city) {
        this.setCity(city);
        return this;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddress() {
        return address;
    }

    public BusAccountAddress withAddress(String address) {
        this.setAddress(address);
        return this;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAddress2() {
        return address2;
    }

    public BusAccountAddress withAddress2(String address2) {
        this.setAddress2(address2);
        return this;
    }

    public void setAddress2(String address2) {
        this.address2 = address2 == null ? null : address2.trim();
    }

    public String getPostalCode() {
        return postalCode;
    }

    public BusAccountAddress withPostalCode(String postalCode) {
        this.setPostalCode(postalCode);
        return this;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode == null ? null : postalCode.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public BusAccountAddress withPhoneNumber(String phoneNumber) {
        this.setPhoneNumber(phoneNumber);
        return this;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public Integer getAccountCode() {
        return accountCode;
    }

    public BusAccountAddress withAccountCode(Integer accountCode) {
        this.setAccountCode(accountCode);
        return this;
    }

    public void setAccountCode(Integer accountCode) {
        this.accountCode = accountCode;
    }

    public Integer getDefaultUsed() {
        return defaultUsed;
    }

    public BusAccountAddress withDefaultUsed(Integer defaultUsed) {
        this.setDefaultUsed(defaultUsed);
        return this;
    }

    public void setDefaultUsed(Integer defaultUsed) {
        this.defaultUsed = defaultUsed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", addressCode=").append(addressCode);
        sb.append(", addressType=").append(addressType);
        sb.append(", firstName=").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append(", country=").append(country);
        sb.append(", contryCode=").append(contryCode);
        sb.append(", province=").append(province);
        sb.append(", provinceCode=").append(provinceCode);
        sb.append(", city=").append(city);
        sb.append(", address=").append(address);
        sb.append(", address2=").append(address2);
        sb.append(", postalCode=").append(postalCode);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", accountCode=").append(accountCode);
        sb.append(", defaultUsed=").append(defaultUsed);
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
        BusAccountAddress other = (BusAccountAddress) that;
        return (this.getFirstName() == null ? other.getFirstName() == null : this.getFirstName().equals(other.getFirstName()))
                && (this.getLastName() == null ? other.getLastName() == null : this.getLastName().equals(other.getLastName()))
                && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
                && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
                && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
                && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
                && (this.getAddress2() == null ? other.getAddress2() == null : this.getAddress2().equals(other.getAddress2()))
                && (this.getPostalCode() == null ? other.getPostalCode() == null : this.getPostalCode().equals(other.getPostalCode()))
                && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
                && (this.getAccountCode() == null ? other.getAccountCode() == null : this.getAccountCode().equals(other.getAccountCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAddressCode() == null) ? 0 : getAddressCode().hashCode());
        result = prime * result + ((getAddressType() == null) ? 0 : getAddressType().hashCode());
        result = prime * result + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        result = prime * result + ((getLastName() == null) ? 0 : getLastName().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getContryCode() == null) ? 0 : getContryCode().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getProvinceCode() == null) ? 0 : getProvinceCode().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getAddress2() == null) ? 0 : getAddress2().hashCode());
        result = prime * result + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getAccountCode() == null) ? 0 : getAccountCode().hashCode());
        result = prime * result + ((getDefaultUsed() == null) ? 0 : getDefaultUsed().hashCode());
        return result;
    }
}