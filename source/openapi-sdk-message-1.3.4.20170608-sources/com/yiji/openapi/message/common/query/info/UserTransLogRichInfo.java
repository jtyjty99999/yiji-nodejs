/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-03-10 16:40 创建
 *
 */
package com.yiji.openapi.message.common.query.info;

import java.io.Serializable;
import java.util.List;

/**
 * @author xiyang@yiji.com
 */
public class UserTransLogRichInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private UserTransLogInfo userTransLogInfo;
	
	private List<UserTransLogInfo> userTransInfos;
	
	public UserTransLogInfo getUserTransLogInfo() {
		return userTransLogInfo;
	}
	
	public void setUserTransLogInfo(UserTransLogInfo userTransLogInfo) {
		this.userTransLogInfo = userTransLogInfo;
	}
	
	public List<UserTransLogInfo> getUserTransInfos() {
		return userTransInfos;
	}
	
	public void setUserTransInfos(List<UserTransLogInfo> userTransInfos) {
		this.userTransInfos = userTransInfos;
	}
}
