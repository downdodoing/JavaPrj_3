package com.sanqing.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sanqing.po.Label;
import com.sanqing.po.Subject;
import com.sanqing.service.ChooseLabelService;
import com.sanqing.service.ChooseLabelServiceImpl;
import com.sanqing.service.SubjectService;
import com.sanqing.service.SubjectServiceImpl;

/*
 * 查看试题详细信息
 */
public class ChooseLabelAction extends ActionSupport {
	private int subjectID;
	private ChooseLabelService chooseLabelService = new ChooseLabelServiceImpl();

	public int getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}

	public void setChooseLabelService(ChooseLabelService chooseLabelService) {
		this.chooseLabelService = chooseLabelService;
	}

	public String execute() throws Exception {
		List<Label> labelList = chooseLabelService.getAllLabel();
		ServletActionContext.getRequest().setAttribute("labelList", labelList);
		return SUCCESS;
	}
}
