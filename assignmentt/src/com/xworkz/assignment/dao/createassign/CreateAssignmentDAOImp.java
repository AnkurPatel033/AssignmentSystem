package com.xworkz.assignment.dao.createassign;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
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

	@Override
	public List<Object[]> courseLoad() throws DAOException {
		System.out.println("Calling courseLoad() from CreateAssigmnetDAO...");
		Session ss = null;
		try {

			ss = sf.openSession();
			String hql = "Select entity.courseId, entity.courseName From LoadCourseEntity entity ";
			Query query = ss.createQuery(hql);
			@SuppressWarnings("unchecked")
			List<Object[]> courses=query.list();

			System.out.println("Sucessfully return CourseLoad() from CreateAssignmentservices()..."+courses.toString());
			return courses;

		} catch (HibernateException e) {
			System.out.println("Exception From DAO:" + e.getMessage());
			throw new DAOException(e.getMessage());
		} finally {
			ss.close();
		}
		
	}
	@Override
	public List<Object> topicLoad(int id) throws DAOException {
		System.out.println("Calling topicLoad() from CreateAssigmnetDAO...:"+id);
		Session ss = null;
		try {

			ss = sf.openSession();
	       String hql = "Select entity.topicName From AddTopicEntity entity where entity.CourseId='"+id+"' ";
			Query query = ss.createQuery(hql);
			@SuppressWarnings("unchecked")
			List<Object> topics=(List<Object>)query.list();

			System.out.println("Sucessfully return topicLoad() from CreateAssignmentservices()..."+topics.toString());
			return topics;

		} catch (HibernateException e) {
			System.out.println("Exception From DAO:" + e.getMessage());
			throw new DAOException(e.getMessage());
		} finally {
			ss.close();
		}
		
		
	}
}