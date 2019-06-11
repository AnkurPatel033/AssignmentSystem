package com.xworkz.assignment.dao.changepass;

import com.xworkz.assignment.exceptions.DAOException;

public interface ChangePassDAO {

	public String changePassDetails(String newPass,String email) throws DAOException;
}
