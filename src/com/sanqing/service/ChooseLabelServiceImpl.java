package com.sanqing.service;

import java.util.List;

import com.sanqing.dao.LabelDAO;
import com.sanqing.dao.LabelDAOImpl;
import com.sanqing.po.Label;

public class ChooseLabelServiceImpl implements ChooseLabelService {
	private LabelDAO labelDAO = new LabelDAOImpl();

	@Override
	public List<Label> getAllLabel() {

		return labelDAO.getAllLabel();
	}
}
