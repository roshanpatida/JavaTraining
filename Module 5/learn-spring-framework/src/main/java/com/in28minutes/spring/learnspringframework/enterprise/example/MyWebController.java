package com.in28minutes.spring.learnspringframework.enterprise.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MyWebController {
	private BusinessService businessService;
public long returnValueFromBusinessServce() {
	return businessService.calculateSum();
}
}

@Component
public class BusinessService{
	@Autowired
	private DataService dataService;
	public long calculateSum() {
	List<Integer> data = dataService.getData();
		return data.stream().reduce(Integer::sum).get();
	}
}
@Component
public class  DataService{
	
	@Autowired
  public List<Integer> getData(){
	  return Arrays.asList(10,20,30,40);
  }
}