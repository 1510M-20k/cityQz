package com.bw.vo;

public class City {
	private Integer cid;
	private String cname;
	private String sd;
	private String jd;
	private String hd;
	private String zd;
	private String sdd;
	private String gd;
	private String zf;
	
	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getSd() {
		return sd;
	}

	public void setSd(String sd) {
		this.sd = sd;
	}

	public String getJd() {
		return jd;
	}

	public void setJd(String jd) {
		this.jd = jd;
	}

	public String getHd() {
		return hd;
	}

	public void setHd(String hd) {
		this.hd = hd;
	}

	public String getZd() {
		return zd;
	}

	public void setZd(String zd) {
		this.zd = zd;
	}

	public String getSdd() {
		return sdd;
	}

	public void setSdd(String sdd) {
		this.sdd = sdd;
	}

	public String getGd() {
		return gd;
	}

	public void setGd(String gd) {
		this.gd = gd;
	}

	public String getZf() {
		return zf;
	}

	public void setZf(String zf) {
		this.zf = zf;
	}

	@Override
	public String toString() {
		return "City [cid=" + cid + ", cname=" + cname + ", sd=" + sd + ", jd=" + jd + ", hd=" + hd + ", zd=" + zd
				+ ", sdd=" + sdd + ", gd=" + gd + ", zf=" + zf + "]";
	}
	
}
