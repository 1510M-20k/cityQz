package com.bw.vo;

public class Qz {
	private Integer qid;
	private String qname;
	private String qz;
	public Integer getQid() {
		return qid;
	}
	public void setQid(Integer qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public String getQz() {
		return qz;
	}
	public void setQz(String qz) {
		this.qz = qz;
	}
	@Override
	public String toString() {
		return "Qz [qid=" + qid + ", qname=" + qname + ", qz=" + qz + "]";
	}
	
	
}
