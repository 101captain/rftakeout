package com.bunfly.entity;
/**
 * 男性体检表
 * @author dzm
 *
 */
public class MaleHealthForm extends HealthForm {
	/**
	 * 前列腺
	 */
	private String prostate;

	public String getProstate() {
		return prostate;
	}

	public void setProstate(String prostate) {
		this.prostate = prostate;
	}

	@Override
	public String toString() {
		return " [id=" + getId() + ", sId=" + getsId() + ", heart=" + getHeart() + ", liver=" + getLiver() + ", spleen=" + getSpleen()
		+ ", lung=" + getLung() + ", kidney=" + getKidney() + ", note=" + getNote() + ",prostate" + prostate + "]";
	}

	
	
}
