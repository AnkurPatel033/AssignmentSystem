package com.xworkz.assignment.dao.searchassign;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.assignment.entities.createAssignment.CreateAssignmentEntity;
import com.xworkz.assignment.exceptions.DAOException;

@Repository
public class SearchAssignmentDAOImp implements SearchAssignmentDAO {

	@Autowired
	private SessionFactory sf;

	public SearchAssignmentDAOImp() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@Override
	public CreateAssignmentEntity searchAssign(String pid) throws DAOException {
		System.out.println("Calling seachAssign() from DAO...");
		Session ss = null;
		try {
			ss = sf.openSession();
		//	String hql = "From CreateAssignmentEntity entity where entity.pin ='" + pid + "'";
			String hql = "From CreateAssignmentEntity entity where entity.pin like '%" + pid + "%'";
			Query query = ss.createQuery(hql);
			CreateAssignmentEntity entity = (CreateAssignmentEntity) query.uniqueResult();
			System.out.println("Entity return From DB in DAO is:" + entity);
			return entity;
		} catch (HibernateException e) {
			System.out.println("Exception From DAO:" + e.getMessage());
			throw new DAOException(e.getMessage());
		} finally {
			ss.close();
		}
	}

}
