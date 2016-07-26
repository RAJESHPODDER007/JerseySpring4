package com.eg.jersey.spring.hibernate.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="batchjob")
public class BatchJob {
	@Id
	@Column(name="batchid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	int batchId;
	@Column(name="jobname")
	String jobName;
	@Column(name="jobdate")
	Date jobDate;
	@Column(name="status")
	String status;
	
	public BatchJob(){
		System.out.println("BatchJob");
	}
	
	public BatchJob(int batchId, String jobName, Date jobDate, String status) {
		super();
		this.batchId = batchId;
		this.jobName = jobName;
		this.jobDate = jobDate;
		this.status = status;
	}
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public Date getJobDate() {
		return jobDate;
	}
	public void setJobDate(Date jobDate) {
		this.jobDate = jobDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
