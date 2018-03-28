package com.test.vo;

import java.io.Serializable;

/**
 * @author ：qixuewei@jinlianchu.com
 * @Description ：
 * @ClassName ：UserVo
 * @date ：2018/2/26 18:11
 */
public class UserVo implements Serializable{

	public int id;

	public String userName;

	public String password;

	public String phone;

	public int isLimit;

	public String remark;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getIsLimit() {
		return isLimit;
	}

	public void setIsLimit(int isLimit) {
		this.isLimit = isLimit;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
