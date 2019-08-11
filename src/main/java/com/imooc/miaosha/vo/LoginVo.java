package com.imooc.miaosha.vo;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.imooc.miaosha.validator.IsMobile;

public class LoginVo {
	
	@NotNull
	@IsMobile
	private String mobile;
	
	@NotNull
	private String password;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @NotNull

	private int score;
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginVo [mobile=" + mobile + ", password=" + password + ", score=\" + score + \"]";
	}
}
