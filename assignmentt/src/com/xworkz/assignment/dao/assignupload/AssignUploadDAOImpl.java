package com.xworkz.assignment.dao.assignupload;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xworkz.assignment.entities.assignupload.AssignUploadEntity;
import com.xworkz.assignment.exceptions.DAOException;

@Repository
public class AssignUploadDAOImpl implements AssignUploadDAO {

	@Autowired
	private SessionFactory sf;
	
	public AssignUploadDAOImpl() {
		System.out.println("Created:"+this.getClass().getSimpleName());
	}
	
	@Override
	public void saveAssignUpload(AssignUploadEntity entity) throws DAOException {
		System.out.println("invoked saveAssignmentUpload() from DAO.. ");
		System.out.println("Data in DAO:"+entity);
		Session ss=null;
		Transaction tx=null;
		try {
			
			ss=sf.openSession();
			tx=ss.beginTransaction();
			ss.save(entity);
			tx.commit();
			
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
		
	}

}
