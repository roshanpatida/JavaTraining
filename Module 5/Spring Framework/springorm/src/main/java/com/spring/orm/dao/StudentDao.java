package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entites.Student;

public class StudentDao {
private HibernateTemplate hibernateTemplate;
	@Transactional // we use transactional in the insert , update , delete 
	public int insert(Student student) {
		//INSERT 
		Integer i = (Integer) this.hibernateTemplate.save(student);// we can cast serializable int so we take rapper class  
		
		return i;
	}

	// we not need to use transactional in get data 
	//GET THE SINGLE DATA(OBJECT)
	public Student getStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class,studentId);
		return student;
		
	}
	
	// GET ALL STUDENTS(ALL ROWS)
 public List<Student> getAllStudent(){
	 List<Student> students =this.hibernateTemplate.loadAll(Student.class);
			 return students; // cast 
 }
 
 //DELTE THE DATA
 // it first load the id and then delete id 
 public void deleteStudent(int studentId) {
	 hibernateTemplate.setCheckWriteOperations(false); // Disable read-only mode

	Student student = this.hibernateTemplate.get(Student.class, studentId);

	this.hibernateTemplate.delete(student);
	hibernateTemplate.setCheckWriteOperations(true); 

 }
 
 //UPDATE DATA
 public void  updateStudent(Student student) {
	 hibernateTemplate.setCheckWriteOperations(false);
	 this.hibernateTemplate.update(student);
	 hibernateTemplate.setCheckWriteOperations(true);
 }
	public HibernateTemplate setHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
		
	}
	
}
