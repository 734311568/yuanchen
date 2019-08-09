/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springbootjapdome.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author 73431
 */
@Entity
public class Userinfo {

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false)
	private String userName;

	@Column(nullable = false)
	private Integer passWord;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getPassword() {
		return passWord;
	}

	public void setPassword(Integer password) {
		this.passWord = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User{" + "id=" + id + ", userName=" + userName + ", password=" + passWord + '}';
	}

}
