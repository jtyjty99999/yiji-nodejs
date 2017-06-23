/**
 * www.yiji.com Inc.
 * Copyright (c) 2012 All Rights Reserved.
 */
package com.yiji.openapi.message.common.oldtonew.info;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 二级错误信息
 *
 * @Version 1.0
 *
 * @Author karott
 *
 * @Email chenlin@yiji.com
 * 
 * @History <li>Author: karott</li> <li>Date: 2012-11-8</li> <li>Version: 1.0</li>
 * <li>Content: create</li>
 *
 */
public class ErrCodeContext implements Serializable {
	
	/** Comment for <code>serialVersionUID</code> */
	private static final long serialVersionUID = 8518169205779966484L;
	
	/** 二级错误码 */
	private String code = "";
	
	/** 二级错误码描述 */
	private String memo = "";
	
	/** 二级错误信息详细描述 */
	private String message = "";
	
	public ErrCodeContext() {
		
		super();
	}
	
	public static ErrCodeContext newInstance() {
		
		return new ErrCodeContext();
	}
	
	public static ErrCodeContext newInstance(String code, String memo, String message) {
		
		return new ErrCodeContext(code, memo, message);
	}
	
	public ErrCodeContext(String code, String memo, String message) {
		super();
		this.code = code;
		this.memo = memo;
		this.message = message;
	}
	
	public String getCode() {
		return code;
	}
	
	public ErrCodeContext setCode(String code) {
		this.code = code;
		
		return this;
	}
	
	public String getMessage() {
		return message;
	}
	
	public ErrCodeContext setMessage(String message) {
		this.message = message;
		
		return this;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public ErrCodeContext setMemo(String memo) {
		this.memo = memo;
		
		return this;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
}
