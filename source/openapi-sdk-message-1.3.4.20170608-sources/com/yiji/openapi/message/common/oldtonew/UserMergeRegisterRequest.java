package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by tyongfu@yiji.com on 2016/2/25.
 */
@OpenApiMessage(service = "userMergeRegister", type = ApiMessageType.Request)
public class UserMergeRegisterRequest extends ApiRequest {

    /**
     * 用户名(登陆名)
     * 如果用户名是手机，可以不用绑定手机，修改手机号，会修改登陆名
     */
    @NotBlank
    @Length(max = 128, min = 1)
    @OpenApiField(desc = "用户名",demo = "xxx@qq.com",constraint = "可以是手机，邮箱等")
    private String userName;

    /**
     * 用户真实姓名(个人姓名/企业名称)
     */
    @NotBlank
    @Length(max = 128, min = 2)
    @OpenApiField(desc = "用户真实姓名",demo = " 张三",constraint = "个人姓名/企业名称")
    private String realName;

    /**
     * 证件类型(企业用户注册的证件请使用营业执照)
     */
    @OpenApiField(
            desc = "证件类型",
            constraint = "{\"name\":\"默认身份证\",\"data\":"
                    + "[\"ID:身份证\","
                    + "\"ARMY_ID:军官证\","
                    + "\"PASSPORT:护照\","
                    + "\"HOME_RETURN:回乡证\","
                    + "\"TAIWAN:台胞证\","
                    + "\"OFFICERS_CARD:警官证\","
                    + "\"SOLDIER_CARD:士兵证\","
                    + "\"BUSINESS_LICENSE:营业执照\","
                    + "\"HOUSEHOLD_REGISTER:户口簿\","
                    + "\"HK_MACAO_PASS:港澳通行证\","
                    + "\"HK_LOCAL_IDENTITY_CARD:香港本地身份证\","
                    + "\"MACAO_LOCAL_IDENTITY_CARD:澳门本地身份证\","
                    + "\"TAIWAN_LOCAL_IDENTITY_CARD:台湾本地身份证\","
                    + "\"Other:其它证件\""
                    + "]}",
            demo = "ID")
    private String certType = "ID";

    /**
     * 证件号
     */
    @NotBlank
    @Length(max = 64, min = 2)
    @OpenApiField(desc = "证件号",demo = "123456***22",constraint = "证件号")
    private String certNo;

    /**
     * 外部用户ID ,传入与当前注册易极付ID进行关联
     */
    @Length(max = 20, min = 1)
    @OpenApiField(desc = "外部用户ID",demo = "13121697",constraint = "外部用户ID")
    private String merchantId;

    /**
     * 证件有效期 //19721212L表示长期
     */
    @NotNull
    @OpenApiField(desc = "有效期",demo = "20280424",constraint = "证件有效期")
    private String certVaildTime;


    @NotBlank(message = "用户地址为空")
    @Length(max = 256, min = 5)
    @OpenApiField(desc = "地址",demo = "北京",constraint = "用户地址")
    private String address;

    /**
     * 电子邮箱
     */
    @Length(max = 128, min = 5)
    @OpenApiField(desc = "邮箱",demo = "aaa@qq.com",constraint = "邮箱")
    private String email;

    /**
     * 手机
     */
    @OpenApiField(desc = "手机",demo = "135244***56",constraint = "手机")
    private String mobileNo;

    //个人......
    /** 国家 */
    @Length(max = 56)
    @NotBlank
    @OpenApiField(demo = "中国",desc = "国家",constraint = "最大56个字符")
    private String country;

    /** 性别 */
    @OpenApiField(
            desc = "性别",
            constraint = "{\"name\":\"性别\",\"data\":"
                    + "[\"M:男性\","
                    + "\"F:女性\","
                    + "\"U:未知\""
                    + "]}",
            demo = "M")
    @NotBlank
    private String gender;

    /** 职业 */
    @Length(max = 30)
    @NotBlank
    @OpenApiField(demo = "学生",desc = "职业",constraint = "最大30个字符")
    private String profession;

    /**
     * 用户状态 默认为未激活[W] 可选激活[T]
     */
    @OpenApiField(desc = "用户状态",demo = "W",constraint = "{\"data\":[\"W:未激活\",\"T:激活\"],\"name\":\"用户状态,默认为W\"}")
    private String userStatus = "W";

    @OpenApiField(desc = "注册来源",demo = "EXT_IMPORT",constraint = "默认外部引入")
    private String registerFrom;

    @OpenApiField(desc = "源注册来源",demo = "EXT_IMPORT",constraint = "默认外部引入")
    private String originRegisterFrom;

    @OpenApiField(desc = "登陆密码",demo = "123465")
    private String loginPassword;

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

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertVaildTime() {
        return certVaildTime;
    }

    public void setCertVaildTime(String certVaildTime) {
        this.certVaildTime = certVaildTime;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getRegisterFrom() {
        return registerFrom;
    }

    public void setRegisterFrom(String registerFrom) {
        this.registerFrom = registerFrom;
    }

    public String getOriginRegisterFrom() {
        return originRegisterFrom;
    }

    public void setOriginRegisterFrom(String originRegisterFrom) {
        this.originRegisterFrom = originRegisterFrom;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }
}
