package Annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Employee1{

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		GetSalary va = new GetSalary();
		Method m = va.getSalary().getMethod("checkValue");
		CheckSalary ca = m.getAnnotation(CheckSalary.class);
		System.out.println("data supplied using annotation = " + ca.data());
		System.out.println("data supplied using annotation = " + ca.message());
		Annotation[] all = va.getSalary().getAnnotations();
		System.out.println(all.toString());
		GetSalary1 va1 = new GetSalary1();
		Method m1 = va1.getClass().getMethod("checkValue1");
		CheckSalary ca1 = m1.getAnnotation(CheckSalary.class);
		System.out.println("data supplied using annotation = " + ca1.data());
		System.out.println("data supplied using annotation = " + ca1.message());
	}

}