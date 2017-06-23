package com.yiji.openapi.message.common.installment;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xinqing@yiji.com
 *
 * @date 2015年7月10日
 */
@OpenApiMessage(service = "installmentRemittance", type = ApiMessageType.Request)
public class InstallmentRemittanceRequest extends ApiRequest {
	@NotEmpty
	@Length(max = 45)
	@OpenApiField(desc = "合约号")
	private String contractNo;
	
	@NotNull
	@OpenApiField(desc = "代发金额")
	private Money amount;
	
	@NotEmpty
	@Length(max = 45)
	@OpenApiField(desc = "外部订单号")
	private String externalOrderNo;

	@Length(max = 64)
	@OpenApiField(desc = "放款协议号")
	private String payContractNo;
	
	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getExternalOrderNo() {
		return externalOrderNo;
	}
	
	public void setExternalOrderNo(String externalOrderNo) {
		this.externalOrderNo = externalOrderNo;
	}

    public String getPayContractNo() {
        return payContractNo;
    }

    public void setPayContractNo(String payContractNo) {
        this.payContractNo = payContractNo;
    }
}
