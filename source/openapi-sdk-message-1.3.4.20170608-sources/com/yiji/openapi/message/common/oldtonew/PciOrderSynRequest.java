package com.yiji.openapi.message.common.oldtonew;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.yiji.openapi.message.common.guaranteepay.info.GoodsInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-20<br>
 */
@OpenApiMessage(service = "pci_order_syn", type = ApiMessageType.Request)
public class PciOrderSynRequest extends ApiRequest {

	@NotNull
	@Size(max = 40, message = "交易流水长度不能超过40位！")
	@OpenApiField(desc = "交易流水即商户订单号", constraint = "交易流水长度不能超过40位!", demo = "xxx")
	private String transactionFlow;

	@NotNull
	@OpenApiField(
			desc = "币种",
			constraint = "{\"name\":\"币种\",\"data\":"
						 + "[\"156:人民币\","
						 + "\"840:美元\","
						 + "\"344:港币\","
						 + "\"826:英镑\","
						 + "\"392:日元\","
						 + "\"978:欧元\","
						 + "\"036:澳元\","
						 + "\"124:加元\","
						 + "\"702:坡币\","
						 + "\"554:新西\","
						 + "\"901:台币\","
						 + "\"410:韩元\","
						 + "\"208:丹朗\","
						 + "\"949:土拉\","
						 + "\"458:马来\","
						 + "\"764:泰铢\","
						 + "\"356:印卢\","
						 + "\"608:菲比\","
						 + "\"756:瑞士\","
						 + "\"752:瑞典\","
						 + "\"376:以谢\","
						 + "\"710:南非\","
						 + "\"643:俄卢\","
						 + "\"578:挪威克朗\","
						 + "\"784:阿联酋\","
						 + "\"986:巴西雷亚尔\","
						 + "\"360:印尼卢比\","
						 + "\"682:沙特里亚尔\","
						 + "\"484:墨西哥比索\","
						 + "\"985:波兰兹罗提\","
						 + "\"704:越南盾\","
						 + "\"152:智利比索\","
						 + "\"398:哈萨克腾格\","
						 + "\"203:捷克克朗\","
						 + "\"818:埃及镑\","
						 + "\"937:委玻利瓦尔\","
						 + "\"032:阿根廷比索\","
						 + "\"446:澳门元\","
						 + "\"980:乌格里夫纳\","
						 + "\"348:匈牙利福林\","
						 + "\"422:黎巴嫩镑\","
						 + "\"400:约旦第纳尔\","
						 + "\"604:秘鲁新索尔\","
						 + "\"586:巴基斯坦卢比\","
						 + "\"946:罗马尼亚列伊\","
						 + "\"634:卡塔尔里亚尔\","
						 + "\"414:科威特第纳尔\","
						 + "\"566:尼日利亚奈拉\","
						 + "\"170:哥伦比亚比索\""
						 + "]}",
			demo = "156")
	private String currencyCode;

	@NotNull
	@OpenApiField(
			desc = "订单来源",
			constraint = "{\"name\":\"订单来源\",\"data\":"
						 + "[\"openapi:openapi\","
						 + "\"cashier:cashier\""
						 + "]}",
			demo = "openapi")
	private String source;

	@NotNull
	@OpenApiField(
			desc = "支付类型",
			constraint = "{\"name\":\"支付类型\",\"data\":"
						 + "[\"moto_edc:MOTO人民币结算\","
						 + "\"moto_dcc:MOTO杂币和本币结算\","
						 + "\"moto_mcp:MOTO自选币种结算\","
						 + "\"3d_edc:3D人民币结算\","
						 + "\"3d_dcc:3D杂币和本币结算\","
						 + "\"3d_mcp:3D自选币种结算\""
						 + "]}",
			demo = "moto_edc")
	private String orderType;

	@OpenApiField(desc = "账单地址国家简码", demo = "CN")
	private String billToCountry;

	@OpenApiField(desc = "收货地址国家简码", demo = "CN")
	private String shipToCountry;

	@NotNull
	@OpenApiField(desc = "卡号", demo = "621798763562****")
	private String cardNo;

	@OpenApiField(desc = "卡类型", demo = "Visa")
	private String cardType;

	@NotNull
	@OpenApiField(desc = "cvv", demo = "234")
	private String cvv;

	@Size(max = 20, message = "IP长度不能超过20位")
	@OpenApiField(desc = "交易IP", constraint = "IP长度不能超过20位", demo = "xxx")
	private String transactionIp;

	@NotNull
	@OpenApiField(desc = "持卡人姓氏", demo = "张")
	private String cardHolderFirstName;

	@NotNull
	@OpenApiField(desc = "持卡人名字", demo = "三")
	private String cardHolderLastName;

	@NotNull
	@OpenApiField(desc = "截止日期", demo = "11/20")
	private String expirationDate;

	@NotNull
	@OpenApiField(desc = "xxx", demo = "xxx")
	private String espCashierType;

	@OpenApiField(desc = "备注", demo = "备注信息")
	private String remark;

	@OpenApiField(desc = "商品信息集合", demo = "xxx")
	private List<GoodsInfo> goodsInfos;

	public String getTransactionFlow() {
		return transactionFlow;
	}

	public void setTransactionFlow(String transactionFlow) {
		this.transactionFlow = transactionFlow;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getBillToCountry() {
		return billToCountry;
	}

	public void setBillToCountry(String billToCountry) {
		this.billToCountry = billToCountry;
	}

	public String getShipToCountry() {
		return shipToCountry;
	}

	public void setShipToCountry(String shipToCountry) {
		this.shipToCountry = shipToCountry;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getTransactionIp() {
		return transactionIp;
	}

	public void setTransactionIp(String transactionIp) {
		this.transactionIp = transactionIp;
	}

	public String getCardHolderFirstName() {
		return cardHolderFirstName;
	}

	public void setCardHolderFirstName(String cardHolderFirstName) {
		this.cardHolderFirstName = cardHolderFirstName;
	}

	public String getCardHolderLastName() {
		return cardHolderLastName;
	}

	public void setCardHolderLastName(String cardHolderLastName) {
		this.cardHolderLastName = cardHolderLastName;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getEspCashierType() {
		return espCashierType;
	}

	public void setEspCashierType(String espCashierType) {
		this.espCashierType = espCashierType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<GoodsInfo> getGoodsInfos() {
		return goodsInfos;
	}

	public void setGoodsInfos(List<GoodsInfo> goodsInfos) {
		this.goodsInfos = goodsInfos;
	}
}
