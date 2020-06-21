package com.myproject.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
//import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reg.entity.Student;
import com.reg.entity.StudentCredential;



@Repository("studentDAO")
public class StudentDAOImpl implements StudentDAO {

//	@Autowired
//	private HibernateTemplate hibernateTemplate;
	@Autowired
	private SessionFactory sessionFactory;
	
/*	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}*/

	@Override
	public boolean saveStudent(Student student) {
	
		Session currentSession = sessionFactory.getCurrentSession();

		int id = (Integer)currentSession.save(student);
		if(id>0)
			return true;
		return false;
	}
	
//	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Student getStudentDetailsByEmailAndPassword(String email,String password){
		System.out.println("In Check login");
		Session currentSession = sessionFactory.getCurrentSession();
		
		
		//create a query
				@SuppressWarnings("unchecked")
				Query<Student> theQuery = currentSession.createQuery("from Student where email=:email and password=:password");
				theQuery.setParameter("email",email);
				theQuery.setParameter("password",password);
				//execute query and get the result list
				System.out.println("query====>"+theQuery);
				List<Student> findByCriteria = theQuery.getResultList();
				System.out.println("customers===>"+findByCriteria);
				//return customers;

		/*String SQL_QUERY =" from student_table as o where o.email=? and o.password=?";
		Query query = currentSession.createQuery(SQL_QUERY);
		query.setParameter(0,email);
		query.setParameter(1,password);
		List<Student> findByCriteria = query.list();
		DetachedCriteria detachedCriteria =  DetachedCriteria.forClass(Student.class);
		detachedCriteria.add(Restrictions.eq("email", email));
		detachedCriteria.add(Restrictions.eq("password", password));
		List<Student> findByCriteria = (List<Student>) hibernateTemplate.findByCriteria(detachedCriteria);*/
		if(findByCriteria !=null && findByCriteria.size()>0)
		return findByCriteria.get(0);
		else
			return null;
	}
}
