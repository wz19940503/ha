package com.company.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Employee implements Serializable{

	private int eid;
	private String eName;
	private String ePass;
	private char sex;
	private int eAge;
	private String eTel;
	private String eAddr;
	private Timestamp eInputDate;
	private String eFlag;
	private String eAdmin;
	private int dId;

	public Employee() {
		super();
	}

	public Employee(String eName, String ePass, char sex, int eAge, String eTel, String eAddr) {
		super();
		this.eName = eName;
		this.ePass = ePass;
		this.sex = sex;
		this.eAge = eAge;
		this.eTel = eTel;
		this.eAddr = eAddr;
	}

	public Employee(int eid, String eName, String ePass, char sex, int eAge, String eTel, String eAddr,
			Timestamp eInputDate, String eFlag, String eAdmin, int dId) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.ePass = ePass;
		this.sex = sex;
		this.eAge = eAge;
		this.eTel = eTel;
		this.eAddr = eAddr;
		this.eInputDate = eInputDate;
		this.eFlag = eFlag;
		this.eAdmin = eAdmin;
		this.dId = dId;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getePass() {
		return ePass;
	}

	public void setePass(String ePass) {
		this.ePass = ePass;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int geteAge() {
		return eAge;
	}

	public void seteAge(int eAge) {
		this.eAge = eAge;
	}

	public String geteTel() {
		return eTel;
	}

	public void seteTel(String eTel) {
		this.eTel = eTel;
	}

	public String geteAddr() {
		return eAddr;
	}

	public void seteAddr(String eAddr) {
		this.eAddr = eAddr;
	}

	public Timestamp geteInputDate() {
		return eInputDate;
	}

	public void seteInputDate(Timestamp eInputDate) {
		this.eInputDate = eInputDate;
	}

	public String geteFlag() {
		return eFlag;
	}

	public void seteFlag(String eFlag) {
		this.eFlag = eFlag;
	}

	public String geteAdmin() {
		return eAdmin;
	}

	public void seteAdmin(String eAdmin) {
		this.eAdmin = eAdmin;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

}
