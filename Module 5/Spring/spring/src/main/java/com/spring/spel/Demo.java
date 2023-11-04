package com.spring.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demo")
public class Demo {
	@Value("#{32+34}")
private int x;
	@Value("23")
private int y;
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private int z;
	@Value("#{T(java.lang.Math).PI}")
	private int e;
	
	@Value("#{new java.lang.String('Roshan patidar')}")
private String name;

	@Value("#{8>3}")
	private boolean isActive; // it print false because bydefault primitive have boolean  false 
	
	
public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive + "]";
}

}
