package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;
@Component("studentDao")
public class StudentDaoImpl implements StudentDao{
	@Autowired
private JdbcTemplate jdbcTemplate;

public int insert(Student student) {
	// TODO Auto-generated method stub
	// inset data in to table to insert query is here
	String query = "insert into student(id,name,city) values(?,?,?)";
	int r= this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
	return r;
}

public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

@Override
public int change(Student student) {
	
	String query = "update student set name=?,city=? where id=?";
	int s = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
	return s;
}

@Override
public int delete(int studentId){
	String  query = "delete from student where id=?";
	int t = this.jdbcTemplate.update(query,studentId);
	
	
	return t;
}

@Override
public Student getStudent(int studentId) {
  String  query = "select * from student where id=?";
  
  //FIRST WAY OF WRITTEN
  RowMapper<Student> rowMapper = new RowMapperImpl();// create the object of rowMapper and put the implementation class of rowMapper
  Student student = this.jdbcTemplate.queryForObject(query,rowMapper,studentId );// we also implement RowMapper using annonimous class and put all the code of RowMapperImpl in this block.
  return student;
  
  
  //ON MORE WAY OF WRITTEN THIS STATEMENT 
//  Student student = this.jdbcTemplate.queryForObject(query,RowMapper(){
//	  public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//			 Student student = new Student();
//			 student.setId(rs.getInt(1));
//			 student.setName(rs.getString(2));
//			 student.setCity(rs.getNString(3));
//			return  student;
//		}
//  } create Parent class as a annonimous class 
//    )
  // rowMapper does convert the resultset into oject then  result the student objct. 
	
}

@Override

//SELECTING MULTIPLE STUDENT
public List<Student> getAllStudents() {
	String query = "select * from student";
	List<Student> students = this.jdbcTemplate.query(query,new RowMapperImpl());//we get RowMapper object which is created in the RowMapperImpl class .
	return students;
}



}
