package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * Created by tyongfu@yiji.com on 2016/1/27.
 */
@OpenApiMessage(service = "ccpEasySpeedLoanApply", type = ApiMessageType.Request)
public class CcpEasySpeedLoanApplyRequest extends ApiRequest {

    @OpenApiField(desc = "业务流水号",constraint = "业务流水号",demo = "20160127001111111111")
    private String bizNo;

    @OpenApiField(desc = "易房保房屋ID",constraint = "易房保房屋ID",demo = "")
    private String houseId;

    @OpenApiField(desc = " 所有者ID ",constraint = " 所有者ID ",demo = "")
    private String ownerId;

    @OpenApiField(desc = "所有者名称",constraint = "所有者名称",demo = "")
    private String ownerRealName;

    @OpenApiField(desc = "产权证号",constraint = "产权证号",demo = "")
    private String estateRightNo;

    @OpenApiField(desc = "房屋地址",constraint = "房屋地址",demo = "")
    private String estateAddress;

    @OpenApiField(desc = "融资产品id",constraint = "融资产品id",demo = "")
    private String financingProductId;

    @OpenApiField(desc = "土地使用权面积",constraint = "土地使用权面积",demo = "")
    private String housingBuildArea;

    @OpenApiField(desc = "套内建筑面积",constraint = "套内建筑面积",demo = "")
    private String insideBuildArea;

    @OpenApiField(desc = "土地使用权终止日期",constraint = "土地使用权终止日期",demo = "")
    private String landUseRightEndDate;

    @OpenApiField(desc = "物理层",constraint = "物理层",demo = "")
    private String physicalLayer;

    @OpenApiField(desc = "名义层",constraint = "名义层",demo = "")
    private String nominalLayer;

    @OpenApiField(desc = "房屋用途",constraint = "房屋用途",demo = "")
    private String houseUse;

    @OpenApiField(desc = "房产抵押状况",constraint = "房产抵押状况",demo = "")
    private String houseMortgageState;

    @OpenApiField(desc = "证件信息 证件类型跟证件号组成的字符串",constraint = "证件信息 证件类型跟证件号组成的字符串",demo = "")
    private String ownerCertInfo;

    @OpenApiField(desc = "房屋贷款年限",constraint = "房屋贷款年限",demo = "")
    private String houseLoanDeadline;

    @OpenApiField(desc = "交易流水号",constraint = "交易流水号",demo = "")
    private String tradeId;

    @OpenApiField(desc = "贷款人Id",constraint = "贷款人Id",demo = "")
    private String financingUserId;

    @OpenApiField(desc = "贷款申请金额",constraint = "贷款申请金额",demo = "")
    private Money applyMoney;

    @OpenApiField(desc = "赎楼银行名称",constraint = "赎楼银行名称",demo = "")
    private String redeemBank;

    @OpenApiField(desc = "中介",constraint = "中介",demo = "")
    private String intermediary;

    @OpenApiField(desc = "json",constraint = "json",demo = "")
    private String attachmentInfos;

    @OpenApiField(desc = "房屋金额",constraint = "房屋金额",demo = "")
    private Money houseAmount;

    @OpenApiField(desc = "扩展信息",constraint = "扩展信息",demo = "")
    private String extendInfo;

    @OpenApiField(desc = "会员id",constraint = "会员id",demo = "20160127001111111111")
    private String userId;

    @OpenApiField(desc = "用户名",constraint = "用户名",demo = "xxx@136.com")
    private String userName;

    @OpenApiField(desc = "真实姓名",constraint = "真实姓名",demo = "张三")
    private String realName;

    @OpenApiField(desc = "手机号",constraint = "手机号",demo = "1363xxxx156")
    private String mobile;

    @OpenApiField(desc = "邮箱",constraint = "邮箱",demo = "xxx@126.com")
    private String email;

    @OpenApiField(desc = "普通结算账户",constraint = "普通结算账户",demo = "20160127001111111111")
    private String accountNo;

    @OpenApiField(desc = "证件类型",constraint = "ID, 身份证 ARMY_ID, 军官证，PASSPORT, 护照，HOME_RETURN, 回乡证，TAIWAN, 台胞证，OFFICERS_CARD, 警官证，SOLDIER_CARD, 士兵证，BUSINESS_LICENSE, 营业执照，HOUSEHOLD_REGISTER, 户口簿，HK_MACAO_PASS, 港澳通行证，HK_LOCAL_IDENTITY_CARD, 香港本地身份证，MACAO_LOCAL_IDENTITY_CARD, 澳门本地身份证，TAIWAN_LOCAL_IDENTITY_CARD, 台湾本地身份证，Other：其它证件 ",demo = "ID")
    @NotBlank
    private String certType;

    @OpenApiField(desc = "证件号码",constraint = "证件号码",demo = "50022819xxxxxxxxxx")
    private String certNo;

    @OpenApiField(desc = "备注",constraint = "备注",demo = "备注")
    private String remark;

    @OpenApiField(desc = "平台id",constraint = "平台id",demo = "备注")
    private String platformId;

    @OpenApiField(desc = "外部订单号",constraint = "外部订单号",demo = "20160127001111111111")
    private String outBizNo;

    @OpenApiField(desc = "易融通融资订单号",constraint = "易融通融资订单号",demo = "20160127001111111111")
    private String financeBizNo;

    @OpenApiField(desc = "申请提交类型",constraint = "申请提交类型",demo = "20160127001111111111")
    private String actionType;

    @OpenApiField(desc = "受理时间时间",constraint = "yyyy-MM-dd",demo = "2016-01-22")
    private String loanDate;

    //买家信息
    @OpenApiField(desc = "买方会员ID",constraint = "买方会员ID",demo = "20160127001111111111")
    private String buyerId;

    @OpenApiField(desc = "买方会员姓名",constraint = "买方会员姓名",demo = "张三")
    private String buyerName;

    @OpenApiField(desc = "买方身份类型",constraint = "买方身份类型",demo = "Identity_Card")
    private String buyerCertType;

    @OpenApiField(desc = "买方证件号",constraint = "买方证件号",demo = "")
    private String buyerCertNo;

    @OpenApiField(desc = "买方联系电话",constraint = "买方联系电话",demo = "")
    private String buyerPhone;

    @OpenApiField(desc = "买方类型 (个人/其他)",constraint = "买方类型 (个人/其他)",demo = "")
    private String buyerGenre;

    @OpenApiField(desc = "买房绑定银行",constraint = "买房绑定银行",demo = "")
    private String buyerBindBank;

    @OpenApiField(desc = "买方绑定银行位置及支行",constraint = "买方绑定银行位置及支行",demo = "")
    private String buyerBindBankLoc;

    @OpenApiField(desc = "买方绑定银行户名",constraint = "买方绑定银行户名",demo = "")
    private String buyerBindBankAccName;

    @OpenApiField(desc = "买方绑定银行卡号",constraint = "买方绑定银行卡号",demo = "")
    private String buyerBindBankCardNo;

    @OpenApiField(desc = "买方性质",constraint = "买方性质",demo = "")
    private String buyerNature;

    //卖家信息
    @OpenApiField(desc = "卖方会员ID",constraint = "卖方会员ID",demo = "20160127001111111111")
    private String sellerId;

    @OpenApiField(desc = "卖方会员姓名",constraint = "卖方会员姓名",demo = "李四")
    private String sellerName;

    @OpenApiField(desc = "卖方身份类型",constraint = "卖方身份类型",demo = "Identity_Card")
    private String sellerCertType;

    @OpenApiField(desc = "卖方证件号",constraint = "卖方证件号",demo = "")
    private String sellerCertNo;

    @OpenApiField(desc = "卖方联系电话",constraint = "卖方联系电话",demo = "136XXX24156")
    private String sellerPhone;

    @OpenApiField(desc = "卖方类型",constraint = "卖方类型",demo = "")
    private String sellerGenre;

    @OpenApiField(desc = "卖方性质",constraint = "卖方性质",demo = "")
    private String sellerNature;

    @OpenApiField(desc = "卖方绑定银行",constraint = "卖方绑定银行",demo = "")
    private String sellerBindBank;

    @OpenApiField(desc = "卖方绑定银行位置及支行",constraint = "卖方绑定银行位置及支行",demo = "")
    private String sellerBindBankLoc;

    @OpenApiField(desc = "卖方绑定银行户名",constraint = "卖方绑定银行户名",demo = "")
    private String sellerBindBankAccName;

    @OpenApiField(desc = "卖方绑定银行卡号",constraint = "卖方绑定银行卡号",demo = "")
    private String sellerBindBankCardNo;


    @OpenApiField(desc = "经纪人所属公司",constraint = "经纪人所属公司",demo = "")
    private String brokerCompanyName;

    @OpenApiField(desc = "经纪人姓名",constraint = "经纪人姓名",demo = "")
    private String brokerName;

    @OpenApiField(desc = "经纪人证件类型",constraint = "经纪人证件类型",demo = "")
    private String brokerCertType;

    @OpenApiField(desc = "经纪人证件号",constraint = "经纪人证件号",demo = "")
    private String brokerCertNo;

    @OpenApiField(desc = "经纪人联系电话",constraint = "经纪人联系电话",demo = "1367XXXX123")
    private String brokerPhone;


    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerRealName() {
        return ownerRealName;
    }

    public void setOwnerRealName(String ownerRealName) {
        this.ownerRealName = ownerRealName;
    }

    public String getEstateRightNo() {
        return estateRightNo;
    }

    public void setEstateRightNo(String estateRightNo) {
        this.estateRightNo = estateRightNo;
    }

    public String getEstateAddress() {
        return estateAddress;
    }

    public void setEstateAddress(String estateAddress) {
        this.estateAddress = estateAddress;
    }

    public String getHousingBuildArea() {
        return housingBuildArea;
    }

    public void setHousingBuildArea(String housingBuildArea) {
        this.housingBuildArea = housingBuildArea;
    }

    public String getInsideBuildArea() {
        return insideBuildArea;
    }

    public void setInsideBuildArea(String insideBuildArea) {
        this.insideBuildArea = insideBuildArea;
    }

    public String getLandUseRightEndDate() {
        return landUseRightEndDate;
    }

    public void setLandUseRightEndDate(String landUseRightEndDate) {
        this.landUseRightEndDate = landUseRightEndDate;
    }

    public String getPhysicalLayer() {
        return physicalLayer;
    }

    public void setPhysicalLayer(String physicalLayer) {
        this.physicalLayer = physicalLayer;
    }

    public String getNominalLayer() {
        return nominalLayer;
    }

    public void setNominalLayer(String nominalLayer) {
        this.nominalLayer = nominalLayer;
    }

    public String getHouseUse() {
        return houseUse;
    }

    public void setHouseUse(String houseUse) {
        this.houseUse = houseUse;
    }

    public String getHouseMortgageState() {
        return houseMortgageState;
    }

    public void setHouseMortgageState(String houseMortgageState) {
        this.houseMortgageState = houseMortgageState;
    }

    public String getOwnerCertInfo() {
        return ownerCertInfo;
    }

    public void setOwnerCertInfo(String ownerCertInfo) {
        this.ownerCertInfo = ownerCertInfo;
    }

    public String getHouseLoanDeadline() {
        return houseLoanDeadline;
    }

    public void setHouseLoanDeadline(String houseLoanDeadline) {
        this.houseLoanDeadline = houseLoanDeadline;
    }

    public String getBuyerCertType() {
        return buyerCertType;
    }

    public void setBuyerCertType(String buyerCertType) {
        this.buyerCertType = buyerCertType;
    }

    public String getSellerCertType() {
        return sellerCertType;
    }

    public void setSellerCertType(String sellerCertType) {
        this.sellerCertType = sellerCertType;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getFinancingUserId() {
        return financingUserId;
    }

    public void setFinancingUserId(String financingUserId) {
        this.financingUserId = financingUserId;
    }

    public Money getApplyMoney() {
        return applyMoney;
    }

    public void setApplyMoney(Money applyMoney) {
        this.applyMoney = applyMoney;
    }

    public String getRedeemBank() {
        return redeemBank;
    }

    public void setRedeemBank(String redeemBank) {
        this.redeemBank = redeemBank;
    }

    public String getIntermediary() {
        return intermediary;
    }

    public void setIntermediary(String intermediary) {
        this.intermediary = intermediary;
    }

    public String getAttachmentInfos() {
        return attachmentInfos;
    }

    public void setAttachmentInfos(String attachmentInfos) {
        this.attachmentInfos = attachmentInfos;
    }

    public Money getHouseAmount() {
        return houseAmount;
    }

    public void setHouseAmount(Money houseAmount) {
        this.houseAmount = houseAmount;
    }

    public String getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getFinancingProductId() {
        return financingProductId;
    }

    public void setFinancingProductId(String financingProductId) {
        this.financingProductId = financingProductId;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getOutBizNo() {
        return outBizNo;
    }

    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
    }

    public String getFinanceBizNo() {
        return financeBizNo;
    }

    public void setFinanceBizNo(String financeBizNo) {
        this.financeBizNo = financeBizNo;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerCertNo() {
        return buyerCertNo;
    }

    public void setBuyerCertNo(String buyerCertNo) {
        this.buyerCertNo = buyerCertNo;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getBuyerGenre() {
        return buyerGenre;
    }

    public void setBuyerGenre(String buyerGenre) {
        this.buyerGenre = buyerGenre;
    }

    public String getBuyerBindBank() {
        return buyerBindBank;
    }

    public void setBuyerBindBank(String buyerBindBank) {
        this.buyerBindBank = buyerBindBank;
    }

    public String getBuyerBindBankLoc() {
        return buyerBindBankLoc;
    }

    public void setBuyerBindBankLoc(String buyerBindBankLoc) {
        this.buyerBindBankLoc = buyerBindBankLoc;
    }

    public String getBuyerBindBankAccName() {
        return buyerBindBankAccName;
    }

    public void setBuyerBindBankAccName(String buyerBindBankAccName) {
        this.buyerBindBankAccName = buyerBindBankAccName;
    }

    public String getBuyerBindBankCardNo() {
        return buyerBindBankCardNo;
    }

    public void setBuyerBindBankCardNo(String buyerBindBankCardNo) {
        this.buyerBindBankCardNo = buyerBindBankCardNo;
    }

    public String getBuyerNature() {
        return buyerNature;
    }

    public void setBuyerNature(String buyerNature) {
        this.buyerNature = buyerNature;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerCertNo() {
        return sellerCertNo;
    }

    public void setSellerCertNo(String sellerCertNo) {
        this.sellerCertNo = sellerCertNo;
    }

    public String getSellerPhone() {
        return sellerPhone;
    }

    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone;
    }

    public String getSellerGenre() {
        return sellerGenre;
    }

    public void setSellerGenre(String sellerGenre) {
        this.sellerGenre = sellerGenre;
    }

    public String getSellerNature() {
        return sellerNature;
    }

    public void setSellerNature(String sellerNature) {
        this.sellerNature = sellerNature;
    }

    public String getSellerBindBank() {
        return sellerBindBank;
    }

    public void setSellerBindBank(String sellerBindBank) {
        this.sellerBindBank = sellerBindBank;
    }

    public String getSellerBindBankLoc() {
        return sellerBindBankLoc;
    }

    public void setSellerBindBankLoc(String sellerBindBankLoc) {
        this.sellerBindBankLoc = sellerBindBankLoc;
    }

    public String getSellerBindBankAccName() {
        return sellerBindBankAccName;
    }

    public void setSellerBindBankAccName(String sellerBindBankAccName) {
        this.sellerBindBankAccName = sellerBindBankAccName;
    }

    public String getSellerBindBankCardNo() {
        return sellerBindBankCardNo;
    }

    public void setSellerBindBankCardNo(String sellerBindBankCardNo) {
        this.sellerBindBankCardNo = sellerBindBankCardNo;
    }

    public String getBrokerCompanyName() {
        return brokerCompanyName;
    }

    public void setBrokerCompanyName(String brokerCompanyName) {
        this.brokerCompanyName = brokerCompanyName;
    }

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public String getBrokerCertType() {
        return brokerCertType;
    }

    public void setBrokerCertType(String brokerCertType) {
        this.brokerCertType = brokerCertType;
    }

    public String getBrokerCertNo() {
        return brokerCertNo;
    }

    public void setBrokerCertNo(String brokerCertNo) {
        this.brokerCertNo = brokerCertNo;
    }

    public String getBrokerPhone() {
        return brokerPhone;
    }

    public void setBrokerPhone(String brokerPhone) {
        this.brokerPhone = brokerPhone;
    }
}
