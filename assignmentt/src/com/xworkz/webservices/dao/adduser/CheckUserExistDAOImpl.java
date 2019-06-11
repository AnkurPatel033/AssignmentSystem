package com.xworkz.webservices.dao.adduser;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.assignment.exceptions.DAOException;

@Repository
public class CheckUserExistDAOImpl implements CheckUserExistDAO {

	@Autowired
	private SessionFactory sf;
	
	
	public CheckUserExistDAOImpl() {
		System.out.println("Created:"+this.getClass().getSimpleName());
	}
	
	@Override
	public int checkUserExist(String email) throws DAOException {
		System.out.println("Calling checkUserExist() from DAO...");
		Session ss=null;
		Transaction tx=null;
		try {			
			ss=sf.openSession();
			tx=ss.beginTransaction();
			String hql = "select count(email) from SignUpEntity entity  where entity.email = :email";
			Query query = ss.createQuery(hql);
			query.setParameter("email", email);
			System.out.println("Foun Email:" + email);
			Long i=(Long) query.uniqueResult();
			System.out.println("Status:"+i.intValue()+"long:"+i);
			return i.intValue();
		}catch (HibernateException e) {
			tx.rollback();
			System.out.println("Exception From DAO:"+e.getMessage());
			throw new DAOException(e.getMessage());
		}finally {
			ss.close();
		}
		
	}

}
