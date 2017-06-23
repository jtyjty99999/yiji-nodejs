package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-29<br>
 */
@OpenApiMessage(service = "fastpayRefund", type = ApiMessageType.Request)
public class FastpayRefundRequest extends ApiRequest {

	@OpenApiField(desc = "交易名称", demo = "xxx")
	private String tradeName;

	@NotNull
	@OpenApiField(desc = "业务产品编号", demo = "xxx")
	private String tradeBizProductCode;

	@NotBlank
	@OpenApiField(
			desc = "交易子类型",
			constraint = "{\"name\":\"交易子类型\",\"data\":"
						 + "[\"GOODS_BUY:商品购买\","
						 + "\"SERVICE_BUY:服务购买\","
						 + "\"MAKE_INVEST:投资理财\","
						 + "\"MOBILE_PAY:手机支付\","
						 + "\"REFUND:退款\","
						 + "\"TRANSFER_DAILY:日终转账\","
						 + "\"TRANSFER_NETTING:扎差转账\""
						 + "]}",
			demo = "GOODS_BUY")
	private String gatheringType;

	@OpenApiField(desc = "买家会员号", demo = "213123213123213213")
	private String buyerUserId;

	@NotNull(message = "卖家不能为空")
	@OpenApiField(desc = "卖家会员号", demo = "231232131232132132")
	private String sellerUserId;

	@OpenApiField(
			desc = "币种",
			constraint = "{\"name\":\"币种(默认人民币)\",\"data\":"
						 + "[\"CNY:人民币\","
						 + "\"USD:美元\","
						 + "\"JPY:日元\","
						 + "\"HKD:港币\","
						 + "\"GBP:英镑\","
						 + "\"EUR:欧元\","
						 + "\"AUD:澳元\","
						 + "\"CAD:加元\","
						 + "\"SGD:坡币\","
						 + "\"NZD:新西\","
						 + "\"TWD:台币\","
						 + "\"KRW:韩元\","
						 + "\"DKK:丹朗\","
						 + "\"TRY:土拉\","
						 + "\"MYR:马来\","
						 + "\"THB:泰铢\","
						 + "\"INR:印卢\","
						 + "\"PHP:菲比\","
						 + "\"CHF:瑞士\","
						 + "\"SEK:瑞典\","
						 + "\"ILS:以谢\","
						 + "\"ZAR:南非\","
						 + "\"RUB:俄卢\","
						 + "\"NOK:挪威克朗\","
						 + "\"AED:阿联酋\","
						 + "\"BRL:巴西雷亚尔\","
						 + "\"IDR:印尼卢比\","
						 + "\"SAR:沙特里亚尔\","
						 + "\"MXN:墨西哥比索\","
						 + "\"PLN:波兰兹罗提\","
						 + "\"VND:越南盾\","
						 + "\"CLP:智利比索\","
						 + "\"KZT:哈萨克腾格\","
						 + "\"CZK:捷克克朗\","
						 + "\"EGP:埃及镑\","
						 + "\"VEF:委玻利瓦尔\","
						 + "\"ARS:阿根廷比索\","
						 + "\"MOP:澳门元\","
						 + "\"UAH:乌格里夫纳\","
						 + "\"HUF:匈牙利福林\","
						 + "\"LBP:黎巴嫩镑\","
						 + "\"JOD:约旦第纳尔\","
						 + "\"PEN:秘鲁新索尔\","
						 + "\"PKR:巴基斯坦卢比\","
						 + "\"RON:罗马尼亚列伊\","
						 + "\"QAR:卡塔尔里亚尔\","
						 + "\"KWD:科威特第纳尔\","
						 + "\"NGN:尼日利亚奈拉\","
						 + "\"COP:哥伦比亚比索\""
						 + "]}",
			demo = "CNY")
	private String currency;

	@NotBlank
	@OpenApiField(desc = "交易金额", demo = "120.00")
	private String tradeAmount;

	@OpenApiField(desc = "买家备注", demo = "买家备注信息")
	private String buyerMarkerMemo;

	@OpenApiField(desc = "卖家备注", demo = "卖家备注信息")
	private String sellerMarkerMemo;

	@OpenApiField(desc = "交易备注", demo = "交易备注信息")
	private String tradeMemo;

	@OpenApiField(desc = "字符编码", demo = "utf-8")
	private String inputCharset;

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getTradeBizProductCode() {
		return tradeBizProductCode;
	}

	public void setTradeBizProductCode(String tradeBizProductCode) {
		this.tradeBizProductCode = tradeBizProductCode;
	}

	public String getGatheringType() {
		return gatheringType;
	}

	public void setGatheringType(String gatheringType) {
		this.gatheringType = gatheringType;
	}

	public String getBuyerUserId() {
		return buyerUserId;
	}

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public String getSellerUserId() {
		return sellerUserId;
	}

	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getTradeAmount() {
		return tradeAmount;
	}

	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getBuyerMarkerMemo() {
		return buyerMarkerMemo;
	}

	public void setBuyerMarkerMemo(String buyerMarkerMemo) {
		this.buyerMarkerMemo = buyerMarkerMemo;
	}

	public String getSellerMarkerMemo() {
		return sellerMarkerMemo;
	}

	public void setSellerMarkerMemo(String sellerMarkerMemo) {
		this.sellerMarkerMemo = sellerMarkerMemo;
	}

	public String getTradeMemo() {
		return tradeMemo;
	}

	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}

	public String getInputCharset() {
		return inputCharset;
	}

	public void setInputCharset(String inputCharset) {
		this.inputCharset = inputCharset;
	}

}
