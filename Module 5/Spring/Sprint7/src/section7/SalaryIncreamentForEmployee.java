package section7;

import java.util.ArrayList;
import java.util.function.*;
class Employee{
	String name;
	double sarary;
	Employee(String name, double salary){
		this.name=name;
		this.sarary=salary;
	}
	public String toString() {
		retun name+" : "+ salary;
	}
}
public class SalaryIncreamentForEmployee {
public static void main(String[] args) {
	ArrayList<Employee> l=new ArrayList<Employee>();
	populate(l);
System.out.println(l);
Predicate<Employee> p = e->e.sarary>=4000;
Function<Employee,Employee> f=e->{e.salary=e.salary+447;
return e;
};
System.out.println("After Increment");
ArrayList<Employee> l2=new ArrayList<Employee>();
for(Employee s:l) {
	if(p.test(s)) {
		l2.apply(s);
	}
}
	public static void populate(ArrayList<Employee> l) {
		l.add(new Employee("Sunny",10000));
		l.add(new Employee("Banny",2000));
		l.add(new Employee("Rahul",3000));
		l.add(new Employee("Rohit",4000));
		l.add(new Employee("Solly",5000));
	}
}
}
