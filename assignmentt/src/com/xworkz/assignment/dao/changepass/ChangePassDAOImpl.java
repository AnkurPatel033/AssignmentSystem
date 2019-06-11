package com.xworkz.assignment.dao.changepass;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.assignment.entities.signup.SignUpEntity;
import com.xworkz.assignment.exceptions.DAOException;

@Repository
public class ChangePassDAOImpl implements ChangePassDAO {

	@Autowired
	SessionFactory sf;

	public ChangePassDAOImpl() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@Override
	public String changePassDetails(String newPass, String email) throws DAOException {
		System.out.println("invoked ChangePassDetails() from DAO...");
		Session ss = null;
		Transaction tx = null;
		int status = 1;
		try {
			ss = sf.openSession();
			tx = ss.beginTransaction();
//			String hql = "update SignUpEntity entity set  entity.pass='" + newPass + "'  where entity.email='" + email + "' ";
			String hql = "update SignUpEntity entity set entity.pass = :password , entity.status = :st where entity.email = :email";
//		    Query query = ss.createQuery(hql);
			Query query = ss.createQuery(hql);
			query.setParameter("password", newPass);
			query.setParameter("email", email);
			query.setParameter("st", status);
			tx.commit();
			SignUpEntity entity = new SignUpEntity();
			entity.setStatus(1);
			System.out.println("updated entity" + entity);
			int i = (int) query.executeUpdate();

			System.out.println("Updated pass row:" + i);
			System.out.println("Sucessfull return entity from services()...");
			return "System.out.println(\"Sucessfull return entity from services()...\");";

		} catch (HibernateException e) {
			System.out.println("Form DAO:" + e.getMessage());
			throw new DAOException(e.getMessage());
		} finally {

		}
	}

}
