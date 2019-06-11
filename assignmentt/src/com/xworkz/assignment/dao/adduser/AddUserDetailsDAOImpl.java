package com.xworkz.assignment.dao.adduser;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.assignment.entities.signup.SignUpEntity;
import com.xworkz.assignment.exceptions.DAOException;

@Repository
public class AddUserDetailsDAOImpl implements AddUserDetailsDAO {

	@Autowired
	private SessionFactory sf;
	
	
	public AddUserDetailsDAOImpl() {
		System.out.println("Created:"+this.getClass().getSimpleName());
	}
	
	@Override
	public void addUserDetailsSave(SignUpEntity entity) throws DAOException {
		System.out.println("Calling AddUserDetailsSave() from DAO..."+entity);
		Session ss=null;
		Transaction tx=null;
		try {			
			ss=sf.openSession();
			tx=ss.beginTransaction();
			System.out.println("Going to save entity:"+entity);
			ss.save(entity);
			System.out.println("save entity:"+entity);
			tx.commit();
		}catch (HibernateException e) {
			tx.rollback();
			System.out.println("Exception From DAO:"+e);
			throw new DAOException(e.getMessage());
		}finally {
			ss.close();
		}
	}

}
