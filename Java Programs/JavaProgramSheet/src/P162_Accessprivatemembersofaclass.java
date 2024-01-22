
class Test1 {
private String name;
private int age;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}

public class P162_Accessprivatemembersofaclass {
	public static void main(String[] args) {
		
	Test1 s = new Test1();
	s.setAge(23);
	s.setName("hardik");
	
	System.out.println(s.getAge());
	System.out.println(s.getName());
	
}
}

