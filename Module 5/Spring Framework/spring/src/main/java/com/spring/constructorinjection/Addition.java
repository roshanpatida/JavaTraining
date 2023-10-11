package com.spring.constructorinjection;

public class Addition {
private int a;
private int b;
public Addition(int a,int b) {
	this.a=a;
	this.b=b;
	System.out.println("Constuctor: int int ");
}

public Addition(double a, double b) {
	this.a=(int) a;
	this.b=(int) b;
	
	System.out.println("Constructot : int int");
}

public void doSum() {
	System.out.println("Sum  = " + (this.a+this.b));
}
}
