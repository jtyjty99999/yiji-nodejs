package com.yiji.openapi.message.product.rewardloan;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xinqing@yiji.com
 *
 * @date 2015年7月23日
 */
@OpenApiMessage(service = "rewardloanUserChangeNotify", type = ApiMessageType.Request)
public class RewardloanUserChangeNotifyRequest extends ApiRequest {
	
	/**
	 * 变动前易极付用户ID
	 */
	@NotBlank(message = "更改前的易极付ID不能为空")
	@Size(max = 20, min = 20, message = "易极付ID是只能20位")
	@OpenApiField(desc = "变动前易极付用户ID")
	private String formerYijiUserId;
	
	/**
	 * 变动前易极付用户名
	 */
	@NotBlank(message = "更改前的易极付用户名不能为空")
	@Size(max = 64, message = "更改前的易极付用户名最大只能64位")
	@OpenApiField(desc = "变动前易极付用户名")
	private String formerYijiUsername;
	
	/**
	 * 变动前易极付用户真实姓名
	 */
	@NotBlank(message = "更改前的易极付用户真实姓名不能为空")
	@Size(max = 64, message = "更改前的易极付用户真实姓名最大只能64位")
	@OpenApiField(desc = "变动前易极付用户真实姓名")
	private String formerYijiUserRealName;
	
	/**
	 * 变动后易极付用户ID
	 */
	@NotBlank(message = "更改后的易极付ID不能为空")
	@Size(max = 64, message = "更改后的易极付ID最大只能20位")
	@OpenApiField(desc = "变动后易极付用户ID")
	private String currentYijiUserId;
	
	/**
	 * 变动后易极付用户名
	 */
	@NotBlank(message = "更改后的易极付用户名不能为空")
	@Size(max = 64, message = "更改后的易极付用户名最大只能64位")
	@OpenApiField(desc = "变动后易极付用户名")
	private String currentYijiUsername;
	
	/**
	 * 变动后易极付用户真实姓名
	 */
	@NotBlank(message = "更改后的易极付用户真实姓名不能为空")
	@Size(max = 64, message = "更改后的易极付用户真实姓名最大只能64位")
	@OpenApiField(desc = "变动后易极付用户真实姓名")
	private String currentYijiUserRealName;
	
	/**
	 * 变更类型
	 */
	@NotBlank(message = "变更类型不能为空")
	@OpenApiField(desc = "变更类型")
	private String changeType;
	
	/**
	 * 变动发生时间
	 */
	@NotBlank
	@OpenApiField(desc = "变动发生时间")
	private String changeTime;
	
	/**
	 * 合作伙伴系统用户ID，即猪八戒用户ID
	 */
	@NotBlank(message = "猪八戒ID不能为空")
	@OpenApiField(desc = "合作伙伴用户ID")
	private String partnerUserId;
	
	public String getPartnerUserId() {
		return partnerUserId;
	}
	
	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
	}
	
	public String getFormerYijiUserId() {
		return formerYijiUserId;
	}
	
	public void setFormerYijiUserId(String formerYijiUserId) {
		this.formerYijiUserId = formerYijiUserId;
	}
	
	public String getFormerYijiUsername() {
		return formerYijiUsername;
	}
	
	public void setFormerYijiUsername(String formerYijiUsername) {
		this.formerYijiUsername = formerYijiUsername;
	}
	
	public String getFormerYijiUserRealName() {
		return formerYijiUserRealName;
	}
	
	public void setFormerYijiUserRealName(String formerYijiUserRealName) {
		this.formerYijiUserRealName = formerYijiUserRealName;
	}
	
	public String getCurrentYijiUserId() {
		return currentYijiUserId;
	}
	
	public void setCurrentYijiUserId(String currentYijiUserId) {
		this.currentYijiUserId = currentYijiUserId;
	}
	
	public String getCurrentYijiUsername() {
		return currentYijiUsername;
	}
	
	public void setCurrentYijiUsername(String currentYijiUsername) {
		this.currentYijiUsername = currentYijiUsername;
	}
	
	public String getCurrentYijiUserRealName() {
		return currentYijiUserRealName;
	}
	
	public void setCurrentYijiUserRealName(String currentYijiUserRealName) {
		this.currentYijiUserRealName = currentYijiUserRealName;
	}
	
	public String getChangeType() {
		return changeType;
	}
	
	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}
	
	public String getChangeTime() {
		return changeTime;
	}
	
	public void setChangeTime(String changeTime) {
		this.changeTime = changeTime;
	}
	
}
