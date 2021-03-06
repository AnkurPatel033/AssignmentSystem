package com.xworkz.assignment.dao.assignis;


import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.assignment.entities.assignis.AssignisEntity;
import com.xworkz.assignment.entities.createAssignment.CreateAssignmentEntity;
import com.xworkz.assignment.exceptions.DAOException;

@Repository
public class AssignisDAOImp implements AssignisDAO {

	@Autowired
	private SessionFactory sf;

	public AssignisDAOImp() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@Override
	public CreateAssignmentEntity assigniEmail(Long pid,String[] emails) throws DAOException {
		System.out.println("Calling assignEmail From DAO:" + pid);
		Session ss = null;
		Transaction tx=null;
		try {
			ss = sf.openSession();
			
			String hql = "From CreateAssignmentEntity entity where entity.pin='" + pid + "'";	
			Query query = ss.createQuery(hql);
			CreateAssignmentEntity entity = (CreateAssignmentEntity) query.uniqueResult();
			//going to save data of Assignee
			//AssignisEntity assignisEntity=new AssignisEntity();
			CreateAssignmentEntity createAssignmentEntity = new CreateAssignmentEntity();
			createAssignmentEntity.setPin(pid);
			tx=ss.beginTransaction();
			for(int i=0;i<emails.length;i++)
			{
				AssignisEntity assignisEntity=new AssignisEntity();
				assignisEntity.setAssignmentEntity(createAssignmentEntity);
				assignisEntity.setEmail(emails[i]);
				
				System.out.println("AssigmentEntity Email Data:"+assignisEntity.getEmail());
				System.out.println("AssigmentEntity PIN Data:"+assignisEntity.getAssignmentEntity().getPin());
				
				ss.save(assignisEntity);		
				System.out.println("Data Save in AssigneeDAO:"+emails[i]+" "+"And pin:"+pid);
				
				
			}
			tx.commit();
			
			return entity;
		} catch (HibernateException e) {
			tx.rollback();
			System.out.println("Exception From DAO:" + e);
			throw new DAOException(e.getMessage());
		} finally {
			ss.close();
		}

	}

}
