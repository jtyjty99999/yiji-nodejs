package com.yiji.openapi.message.common.oldtonew.info;

import java.io.Serializable;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

public class AirTicketDetailStringInfo implements Serializable {
	/** Comment for <code>serialVersionUID</code> */
	private static final long serialVersionUID = -2712766420210154233L;

	/** 易极付订单详情编号 */
	@OpenApiField(desc = "易极付订单详情编号",demo = "213616512342145")
	private String easyLifeOrderDetailNo;

	/** 外部订单明细编号(海渝订单明细编号) */
	@OpenApiField(desc = "外部订单明细编号",demo = "321651263532165")
	private String easyLifeOutOrderDetailNo;

	/** 商品价格 */
	@OpenApiField(desc = "商品价格",demo = "88.66")
	private String productAmount;

	/** 诚意金 */
	@OpenApiField(desc = "诚意金",demo = "88.66")
	private String warrantAmount;

	/** 支付金额（跟商品价格一致） */
	@OpenApiField(desc = "支付金额",demo = "88.66")
	private String payAmount;

	/** 支付价格基数 */
	@OpenApiField(desc = "支付价格基数",demo = "88.66")
	private String baseAmount;

	/** 详情(乘机人、承运人、航班号、航程、起降时间) */
	@OpenApiField(desc = "订单详情",demo = "订单详情")
	private String orderDetailDesc;

	public String getEasyLifeOrderDetailNo() {
		return easyLifeOrderDetailNo;
	}

	public void setEasyLifeOrderDetailNo(String easyLifeOrderDetailNo) {
		this.easyLifeOrderDetailNo = easyLifeOrderDetailNo;
	}

	public String getProductAmount() {
		return productAmount;
	}

	public void setProductAmount(String productAmount) {
		this.productAmount = productAmount;
	}

	public String getWarrantAmount() {
		return warrantAmount;
	}

	public void setWarrantAmount(String warrantAmount) {
		this.warrantAmount = warrantAmount;
	}

	public String getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getBaseAmount() {
		return baseAmount;
	}

	public void setBaseAmount(String baseAmount) {
		this.baseAmount = baseAmount;
	}

	public String getOrderDetailDesc() {
		return orderDetailDesc;
	}

	public void setOrderDetailDesc(String orderDetailDesc) {
		this.orderDetailDesc = orderDetailDesc;
	}

	public String getEasyLifeOutOrderDetailNo() {
		return easyLifeOutOrderDetailNo;
	}

	public void setEasyLifeOutOrderDetailNo(String easyLifeOutOrderDetailNo) {
		this.easyLifeOutOrderDetailNo = easyLifeOutOrderDetailNo;
	}


	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AirTicketDetailStringInfo [easyLifeOrderDetailNo=");
		builder.append(easyLifeOrderDetailNo);
		builder.append(", easyLifeOutOrderDetailNo=");
		builder.append(easyLifeOutOrderDetailNo);
		builder.append(", productAmount=");
		builder.append(productAmount);
		builder.append(", warrantAmount=");
		builder.append(warrantAmount);
		builder.append(", payAmount=");
		builder.append(payAmount);
		builder.append(", baseAmount=");
		builder.append(baseAmount);
		builder.append(", orderDetailDesc=");
		builder.append(orderDetailDesc);
		builder.append("]");
		return builder.toString();
	}
	
}
