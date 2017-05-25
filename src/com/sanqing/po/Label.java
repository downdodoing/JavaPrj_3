package com.sanqing.po;

/*
 * 学生表,保存学生编号，系统密码
 */
public class Label {
	private int labelID;
	private int labelRightID;
	private String labelName;

	public int getLabelID() {
		return labelID;
	}

	public void setLabelID(int labelID) {
		this.labelID = labelID;
	}

	public int getLabelRightID() {
		return labelRightID;
	}

	public void setLabelRightID(int labelRightID) {
		this.labelRightID = labelRightID;
	}

	public String getLabelName() {
		return labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

}
