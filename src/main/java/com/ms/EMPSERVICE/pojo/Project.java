package com.ms.EMPSERVICE.pojo;
// Generated 23 Nov, 2024 10:52:34 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Project generated by hbm2java
 */
@Entity
@Table(name = "project", catalog = "hrdept")
public class Project implements java.io.Serializable {

	private Integer projectId;
	private String PName;
	private String PDuration;
	private Date PTo;
	private Date PFrom;
	private Integer empId;

	public Project() {
	}

	public Project(String PName, String PDuration, Date PTo, Date PFrom, Integer empId) {
		this.PName = PName;
		this.PDuration = PDuration;
		this.PTo = PTo;
		this.PFrom = PFrom;
		this.empId = empId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "project id", unique = true, nullable = false)
	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	@Column(name = "p_name", length = 45)
	public String getPName() {
		return this.PName;
	}

	public void setPName(String PName) {
		this.PName = PName;
	}

	@Column(name = "p_duration", length = 45)
	public String getPDuration() {
		return this.PDuration;
	}

	public void setPDuration(String PDuration) {
		this.PDuration = PDuration;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "p_to", length = 19)
	public Date getPTo() {
		return this.PTo;
	}

	public void setPTo(Date PTo) {
		this.PTo = PTo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "p_from", length = 19)
	public Date getPFrom() {
		return this.PFrom;
	}

	public void setPFrom(Date PFrom) {
		this.PFrom = PFrom;
	}

	@Column(name = "emp_id")
	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

}
