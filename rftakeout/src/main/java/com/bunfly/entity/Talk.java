package com.bunfly.entity;
/**
 * 
 * 用户商家讨论实体类
 *
 */
public class Talk {
	private Integer id;
	private Integer pid;
	private Integer uid;
	private String utalk;
	private String ptalk;
	private String utime;
	private String ptime;
	private String upic;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUtalk() {
		return utalk;
	}
	public void setUtalk(String utalk) {
		this.utalk = utalk;
	}
	public String getPtalk() {
		return ptalk;
	}
	public void setPtalk(String ptalk) {
		this.ptalk = ptalk;
	}
	public String getUtime() {
		return utime;
	}
	public void setUtime(String utime) {
		this.utime = utime;
	}
	public String getPtime() {
		return ptime;
	}
	public void setPtime(String ptime) {
		this.ptime = ptime;
	}
	public String getUpic() {
		return upic;
	}
	public void setUpic(String upic) {
		this.upic = upic;
	}
	
}
