package com.xworkz.assignment.dao.createassign;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.assignment.entities.createAssignment.CreateAssignmentEntity;
import com.xworkz.assignment.exceptions.DAOException;

@Repository
public class CreateAssignmentDAOImp implements CreateAssignmentDAO {

	@Autowired
	private SessionFactory sf;

	public CreateAssignmentDAOImp() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@Override
	public void createAssignment(CreateAssignmentEntity entity) throws DAOException {
		
		System.out.println("Calling CreateAssignmentEntity() from DAO..."+entity);
		Session ss=null;
		Transaction tx=null;
		try {			
			ss=sf.openSession();
			tx=ss.beginTransaction();
			ss.save(entity);
			tx.commit();
		}catch (HibernateException e) {
			tx.rollback();
			System.out.println("Exception From DAO:"+e.getMessage());
			throw new DAOException(e.getMessage());
		}finally {
			ss.close();
		}

	}
}