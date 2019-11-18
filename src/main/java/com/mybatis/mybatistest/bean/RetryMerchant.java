package com.mybatis.mybatistest.bean;

import java.util.Date;
import javax.persistence.*;

@Table(name = "retry_merchant")
public class RetryMerchant {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 业务主键
     */
    private String bizid;

    /**
     * 商家名称
     */
    @Column(name = "merchant_name")
    private String merchantName;

    /**
     * 二级商户号
     */
    @Column(name = "sub_merchant_code")
    private String subMerchantCode;

    /**
     * 网关商户号
     */
    @Column(name = "gate_merchant_code")
    private String gateMerchantCode;

    /**
     * 操作状态(1有效，0删除)
     */
    @Column(name = "op_status")
    private Integer opStatus;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 操作人
     */
    private String operator;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 修改时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取业务主键
     *
     * @return bizid - 业务主键
     */
    public String getBizid() {
        return bizid;
    }

    /**
     * 设置业务主键
     *
     * @param bizid 业务主键
     */
    public void setBizid(String bizid) {
        this.bizid = bizid == null ? null : bizid.trim();
    }

    /**
     * 获取商家名称
     *
     * @return merchant_name - 商家名称
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * 设置商家名称
     *
     * @param merchantName 商家名称
     */
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    /**
     * 获取二级商户号
     *
     * @return sub_merchant_code - 二级商户号
     */
    public String getSubMerchantCode() {
        return subMerchantCode;
    }

    /**
     * 设置二级商户号
     *
     * @param subMerchantCode 二级商户号
     */
    public void setSubMerchantCode(String subMerchantCode) {
        this.subMerchantCode = subMerchantCode == null ? null : subMerchantCode.trim();
    }

    /**
     * 获取网关商户号
     *
     * @return gate_merchant_code - 网关商户号
     */
    public String getGateMerchantCode() {
        return gateMerchantCode;
    }

    /**
     * 设置网关商户号
     *
     * @param gateMerchantCode 网关商户号
     */
    public void setGateMerchantCode(String gateMerchantCode) {
        this.gateMerchantCode = gateMerchantCode == null ? null : gateMerchantCode.trim();
    }

    /**
     * 获取操作状态(1有效，0删除)
     *
     * @return op_status - 操作状态(1有效，0删除)
     */
    public Integer getOpStatus() {
        return opStatus;
    }

    /**
     * 设置操作状态(1有效，0删除)
     *
     * @param opStatus 操作状态(1有效，0删除)
     */
    public void setOpStatus(Integer opStatus) {
        this.opStatus = opStatus;
    }

    /**
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 获取操作人
     *
     * @return operator - 操作人
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置操作人
     *
     * @param operator 操作人
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取修改时间
     *
     * @return update_date - 修改时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置修改时间
     *
     * @param updateDate 修改时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"bizid\":\"")
                .append(bizid).append('\"');
        sb.append(",\"merchantName\":\"")
                .append(merchantName).append('\"');
        sb.append(",\"subMerchantCode\":\"")
                .append(subMerchantCode).append('\"');
        sb.append(",\"gateMerchantCode\":\"")
                .append(gateMerchantCode).append('\"');
        sb.append(",\"opStatus\":")
                .append(opStatus);
        sb.append(",\"creator\":\"")
                .append(creator).append('\"');
        sb.append(",\"operator\":\"")
                .append(operator).append('\"');
        sb.append(",\"createDate\":\"")
                .append(createDate).append('\"');
        sb.append(",\"updateDate\":\"")
                .append(updateDate).append('\"');
        sb.append('}');
        return sb.toString();
    }
}