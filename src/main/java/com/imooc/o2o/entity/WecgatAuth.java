package com.imooc.o2o.entity;

import java.util.Date;

public class WecgatAuth {
	private Long wechatAuthId;
	private String openId;
	private Date creatdTime;
	private PersonInfo personInfo;

	public Long getWechatAuthId() {
		return wechatAuthId;
	}

	public void setWechatAuthId(Long wechatAuthId) {
		this.wechatAuthId = wechatAuthId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getCreatdTime() {
		return creatdTime;
	}

	public void setCreatdTime(Date creatdTime) {
		this.creatdTime = creatdTime;
	}

	public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

}
