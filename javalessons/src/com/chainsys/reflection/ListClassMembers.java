package com.chainsys.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

//import java.lang.reflect.Parameter;

public class ListClassMembers {
	public static void main(String[] args) {
		ListClassMembers t = new ListClassMembers();
//		t.testA();
//		t.lateBinding();
	//	t.queryTypeInfo();
		t.testsetAccessible();
	}

	public void lateBinding() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			System.out.println("Enter Class Name");
			String className = sc.nextLine();
			// load the class -- A a1;
			Class<?> classReference1 = Class.forName(className);
			// create Object a1=new A();
			Object obj = classReference1.getDeclaredConstructor().newInstance();
			System.out.println("Class Name " + obj.getClass().getName());
			System.out.println("Hash Code " + obj.hashCode());
			System.out.println("parent Class:" + classReference1.getSuperclass().getName());
//			System.out.println(classReference1.getCanonicalName());
			int mod = classReference1.getModifiers();
			System.out.println("is public :" + Modifier.isPublic(mod));
			System.out.println("is private :" + Modifier.isPrivate(mod));
			System.out.println("is protected :" + Modifier.isProtected(mod));
			System.out.println("is Abstract :" + Modifier.isAbstract(mod));
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			sc.close();
		}
	}

	public void earlyBinding() {
		Actor actorReference = new Actor();
		actorReference.Name = "prithi";
		actorReference.city = "madurai";
		actorReference.printName();
	}

	public void testB() {
		String classname = "com.chainsys.reflection.Actor";
		Class<?> actorclass = null;
		try {
			actorclass = Class.forName(classname); // Actor actorclass=null;
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		Object obj = null;
		try {
			// obj=actorclass.newInstance(); // new Actor();
			obj = actorclass.getDeclaredConstructor().newInstance();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (ReflectiveOperationException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		printClassInfo(obj);

	}

	public static void printClassInfo(Object ob) {
		Class<?> classreflected = ob.getClass();
		System.out.println(classreflected.getName());
		System.out.println("Constructors:");
		Constructor<?> constructorlist[] = classreflected.getConstructors();
		for (int i = 0; i < constructorlist.length; i++) {
			System.out.println("\t" + constructorlist[i]);
		}
		//
		System.out.println("Methods:");
		Method methodlist[] = classreflected.getMethods();
		for (int i = 0; i < methodlist.length; i++) {
			methodlist[i].setAccessible(true);
			System.out.println("\t Method Name: " + methodlist[i].getName() + " ParameterCount "
					+ methodlist[i].getParameterCount() + " returnType " + methodlist[i].getReturnType());
		}
	}

	public void testA() {
		String s1 = "paithyam";
		printClassInfo(s1);
		Integer i1 = 9999;
		printClassInfo(i1);
		Emp e = new Emp();
		printClassInfo(e);
		Actor a = new Actor();
		printClassInfo(a);

	}

	public void queryTypeInfo() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			System.out.println("Enter Class Name");
			String cname = sc.nextLine();
			Class<?> classReferenace = Class.forName(cname);
			System.out.println("Constructors:");
			Constructor<?> clist[] = classReferenace.getConstructors();
			for (int i = 0; i < clist.length; i++) {
				System.out.println("\t" + clist[i]);
			}
			System.out.println("Fields:");
			Field flist[] = classReferenace.getFields();
			for (int i = 0; i < flist.length; i++) {
				flist[i].setAccessible(false);
				String modifier = ConstantsUtil.getModifierName(flist[i].getModifiers(), 
						Class.forName("java.lang.reflect.Modifier"));
				System.out.println();

				System.out.println("\t" + flist[i].getType() + " " + flist[i].getName() + " Modifier " +modifier );
			}
			System.out.println("Methods:");
			Method mlist[] = classReferenace.getMethods();
			for (int i = 0; i < mlist.length; i++) {
				mlist[i].setAccessible(true);
				System.out.println("\t Method Name: " + mlist[i].getName() + " ParameterCount "
						+ mlist[i].getParameterCount() + " returnType " + mlist[i].getReturnType());
				if (mlist[i].getParameterCount() > 0) {
					Parameter[] param = mlist[i].getParameters();
					for (Parameter p1 : param) {
						System.out.println("\t\t" + p1.getName() + " " + p1.getParameterizedType().getTypeName());
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		finally
		{
			sc.close();
		}
	}
	public void testsetAccessible() {
		try {
			String cname = "com.chainsys.reflection.Actor";
			Class<?> classReference = Class.forName(cname);
			Object objReference = classReference.getDeclaredConstructor().newInstance();
// city is default access modifier
			Field fieldCity = objReference.getClass().getDeclaredField("city");
			fieldCity.setAccessible(true);   //illegal Access
			fieldCity.set(objReference, "chennai");
			Object cityFieldInstance = fieldCity.get(objReference);
			System.out.println(cityFieldInstance);
} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}	
	
	
	
	
}