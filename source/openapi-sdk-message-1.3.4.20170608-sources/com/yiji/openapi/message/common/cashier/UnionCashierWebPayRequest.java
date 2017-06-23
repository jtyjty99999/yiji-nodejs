package com.yiji.openapi.message.common.cashier;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.message.common.cashier.info.ProdDetailInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

@OpenApiMessage(service = "unionCashierWebPay", type = ApiMessageType.Request)
public class UnionCashierWebPayRequest extends ApiRequest {
	
	@NotNull
	@Size(min = 1, max = 40)
	@OpenApiField(desc = "商品信息列表")
	private List<ProdDetailInfo> prodInfoList;
	
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "买家id",demo = "20140814010000052219")
	private String buyerUserId;
	

	public void check() {
		Set<String> orderSet = new HashSet<String>();
		for (Iterator<ProdDetailInfo> iterator = prodInfoList.iterator(); iterator.hasNext();) {
			ProdDetailInfo detail = iterator.next();
			orderSet.add(detail.getOutOrderNo());
		}
		
		if (orderSet.size() != prodInfoList.size()) {
			throw new IllegalArgumentException("outOrderNo 不允许有重复");
		}
		
	}
	
	public List<ProdDetailInfo> getProdInfoList() {
		return prodInfoList;
	}
	
	public void setProdInfoList(List<ProdDetailInfo> prodInfoList) {
		this.prodInfoList = prodInfoList;
	}
	
	public String getBuyerUserId() {
		return buyerUserId;
	}
	
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	
}