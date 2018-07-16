package com.niit.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Register {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	int uid;
	@Column
	String uname;
	@Column
	String email;
	@Column
	String pno;
	@Column
	String psw;
	@Column
	String pswr;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getPswr() {
		return pswr;
	}
	public void setPswr(String pswr) {
		this.pswr = pswr;
	}
	
	
	
}

