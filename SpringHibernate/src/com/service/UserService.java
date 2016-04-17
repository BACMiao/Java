package com.service;
import com.dao.LogDAO;
import com.dao.UserDAO;
import com.model.Log;
import com.model.User;
import org.springframework.transaction.annotation.Transactional;

public class UserService {
	private UserDAO userDAO;
	private LogDAO logDAO;

	//@Transactional
	public void add(User user) {
		userDAO.save(user);
		Log log = new Log();
		log.setMsg("a user save");
		logDAO.save(log);
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public LogDAO getLogDAO() {
		return logDAO;
	}

	public void setLogDAO(LogDAO logDAO) {
		this.logDAO = logDAO;
	}
}
