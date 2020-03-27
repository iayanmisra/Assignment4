package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.dao.StudentDao;
import com.cognizant.dao.StudentDaoImpl;
import com.cognizant.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	StudentDaoImpl dao=(StudentDaoImpl) ctx.getBean("sdao");
	public String insert(Student s) {
		// TODO Auto-generated method stub
		return dao.insert(s);
	}

	public String update(Student s) {
		// TODO Auto-generated method stub
		return dao.update(s);
	}

	public String delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}
	
}
