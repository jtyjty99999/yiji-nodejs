/**
 * 
 */
package com.yiji.openapi.message.common.certify;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.enums.ApiServiceResultCode;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.exception.ApiServerException;

/**
 * @author JasonKidman
 *
 */
@Deprecated
@OpenApiMessage(service = "realNameCertifySimple", type = ApiMessageType.Request)
public class RealNameCertifySimpleRequest extends ApiRequest {
	
	@NotBlank
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户id", demo = "12345678901234567890")
	private String userId;
	
	@NotBlank
	@Length(max = 16)
	@OpenApiField(desc = "用户真实姓名", demo = "易极付")
	private String realName;
	
	@NotBlank
	@Length(max = 50)
	@OpenApiField(desc = "身份证号码", demo = "123456798012345678")
	private String certNo;
	
	@NotBlank
	@Length(max = 8)
	@OpenApiField(desc = "身份证有效时间", demo = "19721212")
	private String certValidTime;
	
	/**
	 * @param userId
	 * @param realName
	 * @param certNo
	 * @param certValidTime
	 */
	public RealNameCertifySimpleRequest(String userId, String realName, String certNo, String certValidTime) {
		super();
		this.userId = userId;
		this.realName = realName;
		this.certNo = certNo;
		this.certValidTime = certValidTime;
	}
	
	/**
	 * 
	 */
	public RealNameCertifySimpleRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * @return the realName
	 */
	public String getRealName() {
		return realName;
	}
	
	/**
	 * @param realName the realName to set
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	/**
	 * @return the certNo
	 */
	public String getCertNo() {
		return certNo;
	}
	
	/**
	 * @param certNo the certNo to set
	 */
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	/**
	 * @return the certValidTime
	 */
	public String getCertValidTime() {
		return certValidTime;
	}
	
	/**
	 * @param certValidTime the certValidTime to set
	 */
	public void setCertValidTime(String certValidTime) {
		this.certValidTime = certValidTime;
	}
	

	public void check() {
		if (StringUtils.isBlank(userId)) {
			throw new ApiServerException(ApiServiceResultCode.PARAMETER_ERROR.getCode(), "userId 不能为空！");
		}
		if (StringUtils.isBlank(realName)) {
			throw new ApiServerException(ApiServiceResultCode.PARAMETER_ERROR.getCode(), "realName 不能为空！");
		}
		if (StringUtils.isBlank(certNo)) {
			throw new ApiServerException(ApiServiceResultCode.PARAMETER_ERROR.getCode(), "certNo 不能为空！");
		}
		if (StringUtils.isBlank(certValidTime)) {
			throw new ApiServerException(ApiServiceResultCode.PARAMETER_ERROR.getCode(), "certValidTime 不能为空！");
		}
	}
	
}
