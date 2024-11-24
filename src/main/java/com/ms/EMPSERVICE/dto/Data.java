package com.ms.EMPSERVICE.dto;

import java.io.Serializable;
import java.util.Date;

import com.ms.EMPSERVICE.pojo.Acct;
import com.ms.EMPSERVICE.pojo.Address;
import com.ms.EMPSERVICE.pojo.Emp;
import com.ms.EMPSERVICE.pojo.Project;

public class Data implements Serializable{
	
	/**
	 * long serialVersionUID = -651850053639753605L;
	 */
	private static final long serialVersionUID = -651850053639753605L;
	private Integer empid;
	private String name;
	private Integer acctId;
	private String ctc;
	private String salary;
	private Date date;
	private Integer addressId;
	private String state;
	private String city;
	private Integer projectId;
	private String pName;
	private String pDuration;
	private Date pTo;
	private Date pFrom;
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAcctId() {
		return acctId;
	}
	public void setAcctId(Integer acctId) {
		this.acctId = acctId;
	}
	public String getCtc() {
		return ctc;
	}
	public void setCtc(String ctc) {
		this.ctc = ctc;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpDuration() {
		return pDuration;
	}
	public void setpDuration(String pDuration) {
		this.pDuration = pDuration;
	}
	public Date getpTo() {
		return pTo;
	}
	public void setpTo(Date pTo) {
		this.pTo = pTo;
	}
	public Date getpFrom() {
		return pFrom;
	}
	public void setpFrom(Date pFrom) {
		this.pFrom = pFrom;
	}
	public Data(Integer empid, String name, Integer acctId, String ctc, String salary, Date date, Integer addressId,
			String state, String city, Integer projectId, String pName, String pDuration, Date pTo, Date pFrom) {
		super();
		this.empid = empid;
		this.name = name;
		this.acctId = acctId;
		this.ctc = ctc;
		this.salary = salary;
		this.date = date;
		this.addressId = addressId;
		this.state = state;
		this.city = city;
		this.projectId = projectId;
		this.pName = pName;
		this.pDuration = pDuration;
		this.pTo = pTo;
		this.pFrom = pFrom;
	}
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Data [empid=" + empid + ", name=" + name + ", acctId=" + acctId + ", ctc=" + ctc + ", salary=" + salary
				+ ", date=" + date + ", addressId=" + addressId + ", state=" + state + ", city=" + city + ", projectId="
				+ projectId + ", pName=" + pName + ", pDuration=" + pDuration + ", pTo=" + pTo + ", pFrom=" + pFrom
				+ "]";
	}
		
		
	
	
	
}
