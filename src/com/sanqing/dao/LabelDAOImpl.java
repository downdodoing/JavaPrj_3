package com.sanqing.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.sanqing.hibernate.HibernateSessionFactory;
import com.sanqing.po.Label;

public class LabelDAOImpl implements LabelDAO {
	@Override
	public List<Label> getAllLabel() {
		Session session = HibernateSessionFactory.getSession();// ���Session����
		Query query = session.createQuery("from Label as lab");
		List list = query.list(); // ��ѯ������浽list��
		HibernateSessionFactory.closeSession(); // �ر�Session����
		return list;
	}
}
