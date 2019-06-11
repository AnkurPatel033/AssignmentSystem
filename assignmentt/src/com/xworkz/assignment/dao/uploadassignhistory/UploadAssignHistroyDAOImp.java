package com.xworkz.assignment.dao.uploadassignhistory;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.assignment.exceptions.DAOException;

@Repository
public class UploadAssignHistroyDAOImp implements UploadAssignHistoryDAO {

	@Autowired
	private SessionFactory sf;

	public UploadAssignHistroyDAOImp() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public Object[] uploadAssignHistory() throws DAOException {
		System.out.println("invoked from uploadAssignHistory() form DAO");

		Session ss = sf.openSession();
		String hql1 = "Select entity1 From CreateAssignmentEntity entity1";
		String hql2 = "Select entity2 From AssignisEntity entity2";
		Query query1 = ss.createQuery(hql1);
		Query query2 = ss.createQuery(hql2);
		Object obj1 = query1.list();
		Object obj2 = query2.list();;
        System.out.println("Object1 data:"+obj1.toString());
        System.out.println("Object2 data:"+obj2.toString());
		Object obj[] = { obj1, obj2 };
        
        

		return obj;

	}

}
