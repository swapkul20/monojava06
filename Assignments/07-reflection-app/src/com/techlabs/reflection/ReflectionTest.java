package com.techlabs.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class reflectionString=Class.forName("java.lang.String");
		
		System.out.println(reflectionString.getName());
		System.out.println(reflectionString.getSimpleName());
		System.out.println(reflectionString.getSuperclass());
		
		System.out.println("Constructors of String:");
		Constructor constructurs[]=reflectionString.getDeclaredConstructors();
		
		for(Constructor constructor:constructurs)
		{
			System.out.println(constructor.getName());
		}
		
		System.out.println("Methods of String:");
		
		Method methods[]=reflectionString.getDeclaredMethods();
		
		for(Method method:methods)
		{
			System.out.println(method.getName());
		}
		
		Field fields[]=reflectionString.getDeclaredFields();
		
		System.out.println("Fields of String:");
		for(Field field:fields)
		{
			System.out.println(field.getName());
		}
		
		Class rectangleReflection=Rectangle.class;
		Rectangle rect=(Rectangle)rectangleReflection.newInstance();
		

	}

}
