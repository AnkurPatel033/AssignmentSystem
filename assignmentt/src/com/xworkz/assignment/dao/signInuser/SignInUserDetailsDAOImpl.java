package com.xworkz.assignment.dao.signInuser;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.assignment.entities.signup.SignUpEntity;
import com.xworkz.assignment.exceptions.DAOException;

@Repository
public class SignInUserDetailsDAOImpl implements SignInUserDetailsDAO {

	@Autowired
	private SessionFactory sf;

	public SignInUserDetailsDAOImpl() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}
	@Override
	public SignUpEntity signInUserDetailsCheck(String email, String pwd) throws DAOException {
		System.out.println("Calling signInUserDetailsCheck() from DAO...");
		Session ss = null;
		try {
			ss = sf.openSession();
			String hql = "From SignUpEntity entity where entity.email='" + email + "' and entity.pass='" + pwd + "' ";
			Query query = ss.createQuery(hql);
			SignUpEntity entity = (SignUpEntity) query.uniqueResult();
			System.out.println("Sucessfully return entity from services()...");
			return entity;
		} catch (HibernateException e) {
			System.out.println("Exception From DAO:" + e.getMessage());
			throw new DAOException(e.getMessage());
		} finally {
			ss.close();
		}
	}

	@Override
	public List<Object[]> pinLoad() throws DAOException {
		System.out.println("Calling from DAO Webapp...");
		Session ss = null;
		try {

			ss = sf.openSession();
			String hql = "Select entity.aId, entity.pin From CreateAssignmentEntity entity ";
			Query query = ss.createQuery(hql);
			@SuppressWarnings("unchecked")
			List<Object[]> pin=query.list();

			System.out.println("Sucessfully return pinList from services()..."+pin.toString());
			return pin;

		} catch (HibernateException e) {
			System.out.println("Exception From DAO:" + e.getMessage());
			throw new DAOException(e.getMessage());
		} finally {
			ss.close();
		}
		
	}

}
