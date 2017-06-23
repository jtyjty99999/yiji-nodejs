/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午7:17:43 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author wkeduo
 *
 */
@OpenApiMessage(service = "deductDeposit.apply", type = ApiMessageType.Request)
public class DeductDepositApplyRequest extends ApiRequest {

	@NotBlank
	@OpenApiField(desc = "充值账户ID", demo = "20140720222222222222")
	private String userId;

	@OpenApiField(desc = "支付渠道", demo = "xxx")
	private String payChannelApi;

	@OpenApiField(desc = "渠道所属来源", demo = "Default")
	private String owner;

	@OpenApiField(desc = "产品子集", demo = "mnsc")
	private String subOwner;

	@OpenApiField(desc = "代扣类型", constraint = "{\"data\":[\"sync:同步\",\"async:异步\"],\"name\":\"代扣类型\"}", demo = "sync")
	private String deductType;

	@OpenApiField(desc = "手续费", demo = "1.11")
	private Money charge = Money.zero();

	@OpenApiField(desc = "收费模型", demo = "default")
	private String chargeRule;

	@OpenApiField(desc = "冻结码", demo = "SYSTEM_FREEZE")
	private String freezeType;

	@NotBlank
	@OpenApiField(desc = "银行简码", demo = "CCB")
	private String bankCode;

	@OpenApiField(desc = "银行名称", demo = "中国建设银行")
	private String bankName;

	@NotBlank
	@OpenApiField(desc = "银行账户开户名", demo = "张卫国")
	private String bankAccountName;

	@NotBlank
	@OpenApiField(desc = "银行卡卡号", demo = "622208880000******0")
	private String bankAccountNo;

	@OpenApiField(desc = "开户行省名", demo = "河北省")
	private String provName;

	@OpenApiField(desc = "开户行市名", demo = "石家庄市")
	private String cityName;

	@OpenApiField(desc = "证件类型",
			constraint = "{\"data\":[\"ID:身份证\",\"ARMY_ID:军官证\",\"PASSPORT:护照\",\"HOME_RETURN:回乡证\",\"TAIWAN:台胞证\",\"OFFICERS_CARD:警官证\",\"SOLDIER_CARD:士兵证\",\"BUSINESS_LICENSE:营业执照\",\"HOUSEHOLD_REGISTER:户口簿\",\"HK_MACAO_PASS:港澳通行证\",\"HK_LOCAL_IDENTITY_CARD:香港本地身份证\",\"MACAO_LOCAL_IDENTITY_CARD:澳门本地身份证\",\"TAIWAN_LOCAL_IDENTITY_CARD:台湾本地身份证\",\"Other:其它证件\"],\"name\":\"证件类型\"}",
			demo = "ARMY_ID")
	private String certType = "ID";

	@NotBlank
	@OpenApiField(desc = "证件号", demo = "50023319880130335X")
	private String certNo;

	@OpenApiField(desc = "对公对私标记", constraint = "{\"data\":[\"N:对私\",\"Y:对公\"],\"name\":\"对公对私标记\"}", demo = "Y")
	private String publicTag;

	@NotNull
	@OpenApiField(desc = "代扣充值金额", demo = "1.11")
	private Money amount;

	@OpenApiField(desc = "货币类型", demo = "CNY")
	private String currency;

	@NotBlank
	@OpenApiField(desc = "外部订单号", demo = "20140711000000000000")
	private String outBizNo;

	@OpenApiField(desc = "参与者ID", demo = "20140720222222222222")
	private String tradePartnerId;

	@OpenApiField(desc = "平台商户ID", demo = "20140720888888888888")
	private String tradeMerchantId;

	@OpenApiField(desc = "充值账户名", demo = "estate_buyer_20160125000005382900")
	private String accountName;

	@OpenApiField(desc = "手机号", demo = "13888888888")
	private String mobileNo;

	@NotBlank
	@OpenApiField(desc = "业务请求者身份标识",
			constraint = "{\"data\":[\"100:EASY_PAYMENT:易生活站内转账\",\"110:EASY_PAYMENT:易生活充值\",\"120:EASY_PAYMENT:易生活提现\",\"130:EASY_PAYMENT:易生活充退\",\"140:EASY_PAYMENT:易生活退票\",\"160:EASY_PAYMENT:易生活手续费\",\"170:EASY_PAYMENT:易生活错账冲正\",\"200:EASY_TRADE:易交易站内转账\",\"210:EASY_TRADE:易交易充值\",\"220:EASY_TRADE:易交易提现\",\"230:EASY_TRADE:易交易充退\",\"240:EASY_TRADE:易交易退票\",\"260:EASY_TRADE:易交易手续费\",\"270:EASY_TRADE:易交易错账冲正\",\"201:EASY_TRADE_ECOMMERCE:易交易站内转账\",\"211:EASY_TRADE_ECOMMERCE:易交易充值\",\"221:EASY_TRADE_ECOMMERCE:易交易提现\",\"231:EASY_TRADE_ECOMMERCE:易交易充退\",\"241:EASY_TRADE_ECOMMERCE:易交易退票\",\"261:EASY_TRADE_ECOMMERCE:易交易手续费\",\"271:EASY_TRADE_ECOMMERCE:易交易错账冲正\",\"300:EASY_EXCHANGE:易结汇站内转账\",\"310:EASY_EXCHANGE:易结汇充值\",\"320:EASY_EXCHANGE:易结汇提现\",\"330:EASY_EXCHANGE:易结汇充退\",\"340:EASY_EXCHANGE:易结汇退票\",\"360:EASY_EXCHANGE:易结汇手续费\",\"370:EASY_EXCHANGE:易结汇错账冲正\",\"380:EASY_EXCHANGE:易结汇换汇\",\"40C:ESTATE_CQ:易房保站内转账\",\"41C:ESTATE_CQ:易房保充值\",\"42C:ESTATE_CQ:易房保提现\",\"43C:ESTATE_CQ:易房保充退\",\"44C:ESTATE_CQ:易房保退票\",\"46C:ESTATE_CQ:易房保手续费\",\"47C:ESTATE_CQ:易房保错账冲正\",\"500:EASY_TURNOVER:易周转站内转账\",\"510:EASY_TURNOVER:易周转充值\",\"520:EASY_TURNOVER:易周转提现\",\"530:EASY_TURNOVER:易周转充退\",\"540:EASY_TURNOVER:易周转退票\",\"560:EASY_TURNOVER:易周转手续费\",\"570:EASY_TURNOVER:易周转错账冲正\",\"600:EASY_FINANCE:易融通站内转账\",\"610:EASY_FINANCE:易融通充值\",\"620:EASY_FINANCE:易融通提现\",\"630:EASY_FINANCE:易融通充退\",\"640:EASY_FINANCE:易融通退票\",\"660:EASY_FINANCE:易融通手续费\",\"670:EASY_FINANCE:易融通错账冲正\",\"700:EASY_LOAN:易贷款(易久)站内转账\",\"710:EASY_LOAN:易贷款(易久)充值\",\"720:EASY_LOAN:易贷款(易久)提现\",\"730:EASY_LOAN:易贷款(易久)充退\",\"740:EASY_LOAN:易贷款(易久)退票\",\"760:EASY_LOAN:易贷款(易久)手续费\",\"770:EASY_LOAN:易贷款(易久)错账冲正\",\"800:EASY_CROSS_BORDER_PAY:易汇通站内转账\",\"810:EASY_CROSS_BORDER_PAY:易汇通充值\",\"820:EASY_CROSS_BORDER_PAY:易汇通提现\",\"830:EASY_CROSS_BORDER_PAY:易汇通充退\",\"840:EASY_CROSS_BORDER_PAY:易汇通退票\",\"860:EASY_CROSS_BORDER_PAY:易汇通手续费\",\"870:EASY_CROSS_BORDER_PAY:易汇通错账冲正\",\"880:EASY_CROSS_BORDER_PAY:易汇通卡收单支付\",\"881:EASY_CROSS_BORDER_PAY:易汇通卡收单拒付\",\"882:EASY_CROSS_BORDER_PAY:易汇通卡收单撤销\",\"883:EASY_CROSS_BORDER_PAY:易汇通卡收单退款\",\"884:EASY_CROSS_BORDER_PAY:易汇通换汇\",\"885:EASY_CROSS_BORDER_PAY:易汇通付汇提现\",\"886:EASY_CROSS_BORDER_PAY:易汇通付汇退票\",\"900:GENERAL_MERCHANT:通用商户(openapi)站内转账\",\"910:GENERAL_MERCHANT:通用商户(openapi)充值\",\"920:GENERAL_MERCHANT:通用商户(openapi)提现\",\"930:GENERAL_MERCHANT:通用商户(openapi)充退\",\"940:GENERAL_MERCHANT:通用商户(openapi)退票\",\"960:GENERAL_MERCHANT:通用商户(openapi)手续费\",\"970:GENERAL_MERCHANT:通用商户(openapi)错账冲正\",\"980:GENERAL_MERCHANT:通用商户(openapi)卡到卡\",\"011:PERSONAL:个人版站内转账\",\"012:PERSONAL:个人版充值\",\"013:PERSONAL:个人版提现\",\"014:PERSONAL:个人版充退\",\"015:PERSONAL:个人版退票\",\"017:PERSONAL:个人版手续费\",\"018:PERSONAL:个人版错账冲正\",\"021:MERCHANT:商户版站内转账\",\"022:MERCHANT:商户版充值\",\"023:MERCHANT:商户版提现\",\"024:MERCHANT:商户版充退\",\"025:MERCHANT:商户版退票\",\"026:MERCHANT:商户版代扣充值\",\"027:MERCHANT:商户版手续费\",\"028:MERCHANT:商户版错账冲正\",\"031:SPECIAL_MERCHANT:特约商户版站内转账\",\"032:SPECIAL_MERCHANT:特约商户版充值\",\"033:SPECIAL_MERCHANT:特约商户版提现\",\"034:SPECIAL_MERCHANT:特约商户版充退\",\"035:SPECIAL_MERCHANT:特约商户版退票\",\"037:SPECIAL_MERCHANT:特约商户版手续费\",\"038:SPECIAL_MERCHANT:特约商户版错账冲正\",\"041:PAY_MOBILE:易手富站内转账\",\"042:PAY_MOBILE:易手富充值\",\"043:PAY_MOBILE:易手富提现\",\"044:PAY_MOBILE:易手富充退\",\"045:PAY_MOBILE:易手富退票\",\"047:PAY_MOBILE:易手富手续费\",\"048:PAY_MOBILE:易手富错账冲正\",\"052:CASHIER:收银台版充值\",\"054:CASHIER:收银台充退\",\"062:NOCARD_PAY:充值\",\"063:NOCARD_PAY:提现\",\"064:NOCARD_PAY:充退\",\"072:EWEALTH_PAY:企富通充值\",\"073:EWEALTH_PAY:企富通提现\",\"074:NOCARD_PAY:企富通充退\",\"082:SIGN_SYSTEM:签约平台充值\",\"083:SIGN_SYSTEM:提现\",\"084:SIGN_SYSTEM:签约平台退\",\"085:SIGN_SYSTEM:签约平台退票\",\"091:OFFLINE:线下站内转账\",\"092:OFFLINE:线下充值\",\"093:OFFLINE:线下提现\",\"094:OFFLINE:线下充退\",\"095:OFFLINE:线下退票\",\"097:OFFLINE:线下手续费\",\"098:OFFLINE:线下错账冲正\",\"F20:FUND_TRANS:充值\",\"F21:FUND_TRANS:基金申购\",\"F30:FUND_TRANS:审核提现\",\"F31:FUND_TRANS:基金赎回\",\"F32:FUND_TRANS:基金撤单\",\"F33:FUND_TRANS:基金分红\",\"YP1:YI_POS:pos充值\",\"YP2:YI_POS:pos提现\",\"YP3:YI_POS:pos充退\",\"YP4:YI_POS:pos退票\",\"YP5:YI_POS:pos消费\",\"YP6:YI_POS:pos消费撤销\",\"YP7:YI_POS:pos消费退货\",\"YP8:YI_POS:pos消费冲正\",\"YP9:YI_POS:pos消费撤销冲正\",\"112:EASY_TICKET:易票通充值\",\"113:EASY_TICKET:易票通提现\",\"122:GOLD_HALL:金满堂充值\",\"133:AGENY_SETTLE:代理清算提现\",\"142:UNIFORM_PRODUCT:通用产品充值\",\"143:UNIFORM_PRODUCT:通用产品提现\",\"144:UNIFORM_PRODUCT:通用产品充退\",\"152:EASY_BANK:易金融充值\",\"153:EASY_BANK:易金融充退\",\"154:EASY_BANK:易金融提现\",\"S20:SETTLE_APP:充值\",\"S30:SETTLE_APP:提现\",\"CP1:CQCB_P2P:重银P2P充值\",\"CP2:CQCB_P2P:重银P2P提现\",\"TS1:TEST:测试充值\",\"TS2:TEST:测试提现\",\"TS3:TEST:测试充退\",\"TS4:TEST:测试退票\",\"TS5:TEST:测试测试卡收单支付\",\"TS6:TEST:测试卡收单拒付\",\"TS7:TEST:测试卡收单撤销\",\"TS8:TEST:测试卡收单退款\",\"TS9:TEST:测试付汇提现\",\"102:CONSUME:充值(消费)\",\"104:SALES_RETURN:充退(退货)\",\"110:EASY_PAYMENT:易缴费充值\",\"150:EASY_PAYMENT:易缴费代扣充值\",\"210:EASY_TRADE:易交易充值\",\"250:EASY_TRADE:易交易代扣充值\",\"310:EASY_EXCHANGE:易结汇充值\",\"350:EASY_EXCHANGE:易结汇代扣充值\",\"012:PERSONAL:个人版充值\",\"016:PERSONAL:个人版代扣充值\",\"022:MERCHANT:商户版充值\",\"032:SPECIAL_MERCHANT:特约商户版充值\",\"036:SPECIAL_MERCHANT:特约商户版代扣充值\",\"042:PAY_MOBILE:易手富充值\",\"046:PAY_MOBILE:易手富代扣充值\",\"096:OFFLINE:线下代扣\"],\"name\":\"业务请求者身份标识\"}",
			demo = "MERCHANT")
	private String bizIdentity = "MERCHANT";

	@NotBlank
	@OpenApiField(desc = "业务号",
			constraint = "{\"data\":[\"100:EASY_PAYMENT:易生活站内转账\",\"110:EASY_PAYMENT:易生活充值\",\"120:EASY_PAYMENT:易生活提现\",\"130:EASY_PAYMENT:易生活充退\",\"140:EASY_PAYMENT:易生活退票\",\"160:EASY_PAYMENT:易生活手续费\",\"170:EASY_PAYMENT:易生活错账冲正\",\"200:EASY_TRADE:易交易站内转账\",\"210:EASY_TRADE:易交易充值\",\"220:EASY_TRADE:易交易提现\",\"230:EASY_TRADE:易交易充退\",\"240:EASY_TRADE:易交易退票\",\"260:EASY_TRADE:易交易手续费\",\"270:EASY_TRADE:易交易错账冲正\",\"201:EASY_TRADE_ECOMMERCE:易交易站内转账\",\"211:EASY_TRADE_ECOMMERCE:易交易充值\",\"221:EASY_TRADE_ECOMMERCE:易交易提现\",\"231:EASY_TRADE_ECOMMERCE:易交易充退\",\"241:EASY_TRADE_ECOMMERCE:易交易退票\",\"261:EASY_TRADE_ECOMMERCE:易交易手续费\",\"271:EASY_TRADE_ECOMMERCE:易交易错账冲正\",\"300:EASY_EXCHANGE:易结汇站内转账\",\"310:EASY_EXCHANGE:易结汇充值\",\"320:EASY_EXCHANGE:易结汇提现\",\"330:EASY_EXCHANGE:易结汇充退\",\"340:EASY_EXCHANGE:易结汇退票\",\"360:EASY_EXCHANGE:易结汇手续费\",\"370:EASY_EXCHANGE:易结汇错账冲正\",\"380:EASY_EXCHANGE:易结汇换汇\",\"40C:ESTATE_CQ:易房保站内转账\",\"41C:ESTATE_CQ:易房保充值\",\"42C:ESTATE_CQ:易房保提现\",\"43C:ESTATE_CQ:易房保充退\",\"44C:ESTATE_CQ:易房保退票\",\"46C:ESTATE_CQ:易房保手续费\",\"47C:ESTATE_CQ:易房保错账冲正\",\"500:EASY_TURNOVER:易周转站内转账\",\"510:EASY_TURNOVER:易周转充值\",\"520:EASY_TURNOVER:易周转提现\",\"530:EASY_TURNOVER:易周转充退\",\"540:EASY_TURNOVER:易周转退票\",\"560:EASY_TURNOVER:易周转手续费\",\"570:EASY_TURNOVER:易周转错账冲正\",\"600:EASY_FINANCE:易融通站内转账\",\"610:EASY_FINANCE:易融通充值\",\"620:EASY_FINANCE:易融通提现\",\"630:EASY_FINANCE:易融通充退\",\"640:EASY_FINANCE:易融通退票\",\"660:EASY_FINANCE:易融通手续费\",\"670:EASY_FINANCE:易融通错账冲正\",\"700:EASY_LOAN:易贷款(易久)站内转账\",\"710:EASY_LOAN:易贷款(易久)充值\",\"720:EASY_LOAN:易贷款(易久)提现\",\"730:EASY_LOAN:易贷款(易久)充退\",\"740:EASY_LOAN:易贷款(易久)退票\",\"760:EASY_LOAN:易贷款(易久)手续费\",\"770:EASY_LOAN:易贷款(易久)错账冲正\",\"800:EASY_CROSS_BORDER_PAY:易汇通站内转账\",\"810:EASY_CROSS_BORDER_PAY:易汇通充值\",\"820:EASY_CROSS_BORDER_PAY:易汇通提现\",\"830:EASY_CROSS_BORDER_PAY:易汇通充退\",\"840:EASY_CROSS_BORDER_PAY:易汇通退票\",\"860:EASY_CROSS_BORDER_PAY:易汇通手续费\",\"870:EASY_CROSS_BORDER_PAY:易汇通错账冲正\",\"880:EASY_CROSS_BORDER_PAY:易汇通卡收单支付\",\"881:EASY_CROSS_BORDER_PAY:易汇通卡收单拒付\",\"882:EASY_CROSS_BORDER_PAY:易汇通卡收单撤销\",\"883:EASY_CROSS_BORDER_PAY:易汇通卡收单退款\",\"884:EASY_CROSS_BORDER_PAY:易汇通换汇\",\"885:EASY_CROSS_BORDER_PAY:易汇通付汇提现\",\"886:EASY_CROSS_BORDER_PAY:易汇通付汇退票\",\"900:GENERAL_MERCHANT:通用商户(openapi)站内转账\",\"910:GENERAL_MERCHANT:通用商户(openapi)充值\",\"920:GENERAL_MERCHANT:通用商户(openapi)提现\",\"930:GENERAL_MERCHANT:通用商户(openapi)充退\",\"940:GENERAL_MERCHANT:通用商户(openapi)退票\",\"960:GENERAL_MERCHANT:通用商户(openapi)手续费\",\"970:GENERAL_MERCHANT:通用商户(openapi)错账冲正\",\"980:GENERAL_MERCHANT:通用商户(openapi)卡到卡\",\"011:PERSONAL:个人版站内转账\",\"012:PERSONAL:个人版充值\",\"013:PERSONAL:个人版提现\",\"014:PERSONAL:个人版充退\",\"015:PERSONAL:个人版退票\",\"017:PERSONAL:个人版手续费\",\"018:PERSONAL:个人版错账冲正\",\"021:MERCHANT:商户版站内转账\",\"022:MERCHANT:商户版充值\",\"023:MERCHANT:商户版提现\",\"024:MERCHANT:商户版充退\",\"025:MERCHANT:商户版退票\",\"026:MERCHANT:商户版代扣充值\",\"027:MERCHANT:商户版手续费\",\"028:MERCHANT:商户版错账冲正\",\"031:SPECIAL_MERCHANT:特约商户版站内转账\",\"032:SPECIAL_MERCHANT:特约商户版充值\",\"033:SPECIAL_MERCHANT:特约商户版提现\",\"034:SPECIAL_MERCHANT:特约商户版充退\",\"035:SPECIAL_MERCHANT:特约商户版退票\",\"037:SPECIAL_MERCHANT:特约商户版手续费\",\"038:SPECIAL_MERCHANT:特约商户版错账冲正\",\"041:PAY_MOBILE:易手富站内转账\",\"042:PAY_MOBILE:易手富充值\",\"043:PAY_MOBILE:易手富提现\",\"044:PAY_MOBILE:易手富充退\",\"045:PAY_MOBILE:易手富退票\",\"047:PAY_MOBILE:易手富手续费\",\"048:PAY_MOBILE:易手富错账冲正\",\"052:CASHIER:收银台版充值\",\"054:CASHIER:收银台充退\",\"062:NOCARD_PAY:充值\",\"063:NOCARD_PAY:提现\",\"064:NOCARD_PAY:充退\",\"072:EWEALTH_PAY:企富通充值\",\"073:EWEALTH_PAY:企富通提现\",\"074:NOCARD_PAY:企富通充退\",\"082:SIGN_SYSTEM:签约平台充值\",\"083:SIGN_SYSTEM:提现\",\"084:SIGN_SYSTEM:签约平台退\",\"085:SIGN_SYSTEM:签约平台退票\",\"091:OFFLINE:线下站内转账\",\"092:OFFLINE:线下充值\",\"093:OFFLINE:线下提现\",\"094:OFFLINE:线下充退\",\"095:OFFLINE:线下退票\",\"097:OFFLINE:线下手续费\",\"098:OFFLINE:线下错账冲正\",\"F20:FUND_TRANS:充值\",\"F21:FUND_TRANS:基金申购\",\"F30:FUND_TRANS:审核提现\",\"F31:FUND_TRANS:基金赎回\",\"F32:FUND_TRANS:基金撤单\",\"F33:FUND_TRANS:基金分红\",\"YP1:YI_POS:pos充值\",\"YP2:YI_POS:pos提现\",\"YP3:YI_POS:pos充退\",\"YP4:YI_POS:pos退票\",\"YP5:YI_POS:pos消费\",\"YP6:YI_POS:pos消费撤销\",\"YP7:YI_POS:pos消费退货\",\"YP8:YI_POS:pos消费冲正\",\"YP9:YI_POS:pos消费撤销冲正\",\"112:EASY_TICKET:易票通充值\",\"113:EASY_TICKET:易票通提现\",\"122:GOLD_HALL:金满堂充值\",\"133:AGENY_SETTLE:代理清算提现\",\"142:UNIFORM_PRODUCT:通用产品充值\",\"143:UNIFORM_PRODUCT:通用产品提现\",\"144:UNIFORM_PRODUCT:通用产品充退\",\"152:EASY_BANK:易金融充值\",\"153:EASY_BANK:易金融充退\",\"154:EASY_BANK:易金融提现\",\"S20:SETTLE_APP:充值\",\"S30:SETTLE_APP:提现\",\"CP1:CQCB_P2P:重银P2P充值\",\"CP2:CQCB_P2P:重银P2P提现\",\"TS1:TEST:测试充值\",\"TS2:TEST:测试提现\",\"TS3:TEST:测试充退\",\"TS4:TEST:测试退票\",\"TS5:TEST:测试测试卡收单支付\",\"TS6:TEST:测试卡收单拒付\",\"TS7:TEST:测试卡收单撤销\",\"TS8:TEST:测试卡收单退款\",\"TS9:TEST:测试付汇提现\",\"102:CONSUME:充值(消费)\",\"104:SALES_RETURN:充退(退货)\",\"110:EASY_PAYMENT:易缴费充值\",\"150:EASY_PAYMENT:易缴费代扣充值\",\"210:EASY_TRADE:易交易充值\",\"250:EASY_TRADE:易交易代扣充值\",\"310:EASY_EXCHANGE:易结汇充值\",\"350:EASY_EXCHANGE:易结汇代扣充值\",\"012:PERSONAL:个人版充值\",\"016:PERSONAL:个人版代扣充值\",\"022:MERCHANT:商户版充值\",\"032:SPECIAL_MERCHANT:特约商户版充值\",\"036:SPECIAL_MERCHANT:特约商户版代扣充值\",\"042:PAY_MOBILE:易手富充值\",\"046:PAY_MOBILE:易手富代扣充值\",\"096:OFFLINE:线下代扣\"],\"name\":\"业务号\"}",
			demo = "026")
	private String bizNo = "026";

	@OpenApiField(desc = "用户客户端IP", demo = "192.168.255.255")
	private String userEndIp;

	@OpenApiField(desc = "用户终端类型", constraint = "{\"data\":[\"01:pc端\",\"02:移动端\"],\"name\":\"用户终端类型\"}", demo = "01")
	private String userTemunalType;

	@OpenApiField(desc = "交易类型", demo = "deductDepoisital")
	private String tradeCategory;

	@OpenApiField(desc = "业务产品编号", demo = "20131018-financingyjDP")
	private String tradeBizProductCode;

	@OpenApiField(desc = "商品类型码", demo = "PRODUCT")
	private String goodsTypeCode;

	@OpenApiField(desc = "商品类型名称", demo = "食品")
	private String goodsTypeName;

	@OpenApiField(desc = "商品名称", demo = "思圆")
	private String goodsName;

	@OpenApiField(desc = "备注", demo = "备注")
	private String memo;

	public String getPayChannelApi() {
		return this.payChannelApi;
	}

	public void setPayChannelApi(String payChannelApi) {
		this.payChannelApi = payChannelApi;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSubOwner() {
		return this.subOwner;
	}

	public void setSubOwner(String subOwner) {
		this.subOwner = subOwner;
	}

	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getPublicTag() {
		return this.publicTag;
	}

	public void setPublicTag(String publicTag) {
		this.publicTag = publicTag;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBankAccountNo() {
		return this.bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getBizNo() {
		return this.bizNo;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getTradePartnerId() {
		return this.tradePartnerId;
	}

	public void setTradePartnerId(String tradePartnerId) {
		this.tradePartnerId = tradePartnerId;
	}

	public String getTradeMerchantId() {
		return this.tradeMerchantId;
	}

	public void setTradeMerchantId(String tradeMerchantId) {
		this.tradeMerchantId = tradeMerchantId;
	}

	public Money getAmount() {
		return this.amount;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	public String getBankAccountName() {
		return this.bankAccountName;
	}

	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getProvName() {
		return this.provName;
	}

	public void setProvName(String provName) {
		this.provName = provName;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getBizIdentity() {
		return this.bizIdentity;
	}

	public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
	}

	public String getCertNo() {
		return this.certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getDeductType() {
		return this.deductType;
	}

	public void setDeductType(String deductType) {
		this.deductType = deductType;
	}

	public Money getCharge() {
		return this.charge;
	}

	public void setCharge(Money charge) {
		this.charge = charge;
	}

	public String getChargeRule() {
		return this.chargeRule;
	}

	public void setChargeRule(String chargeRule) {
		this.chargeRule = chargeRule;
	}

	public String getFreezeType() {
		return this.freezeType;
	}

	public void setFreezeType(String freezeType) {
		this.freezeType = freezeType;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getUserTemunalType() {
		return this.userTemunalType;
	}

	public void setUserTemunalType(String userTemunalType) {
		this.userTemunalType = userTemunalType;
	}

	public String getTradeCategory() {
		return this.tradeCategory;
	}

	public void setTradeCategory(String tradeCategory) {
		this.tradeCategory = tradeCategory;
	}

	public String getGoodsTypeCode() {
		return this.goodsTypeCode;
	}

	public void setGoodsTypeCode(String goodsTypeCode) {
		this.goodsTypeCode = goodsTypeCode;
	}

	public String getGoodsTypeName() {
		return this.goodsTypeName;
	}

	public void setGoodsTypeName(String goodsTypeName) {
		this.goodsTypeName = goodsTypeName;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getTradeBizProductCode() {
		return this.tradeBizProductCode;
	}

	public void setTradeBizProductCode(String tradeBizProductCode) {
		this.tradeBizProductCode = tradeBizProductCode;
	}

	public String getUserEndIp() {
		return this.userEndIp;
	}

	public void setUserEndIp(String userEndIp) {
		this.userEndIp = userEndIp;
	}

}
