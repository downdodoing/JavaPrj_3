package com.sanqing.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.sanqing.hibernate.HibernateSessionFactory;
import com.sanqing.po.Label;

public class LabelDAOImpl implements LabelDAO {
	@Override
	public List<Label> getAllLabel() {
		Session session = HibernateSessionFactory.getSession();// 获得Session对象
		Query query = session.createQuery("from Label as lab");
		List list = query.list(); // 查询结果保存到list中
		HibernateSessionFactory.closeSession(); // 关闭Session对象
		return list;
	}
}
