package com.jlcindia.spring;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class TestBean {
@Autowired
ApplicationContext ctx=null;
void showEnglish()
{
String m1=ctx.getMessage("username.required",null,null);
System.out.println(m1);
String m2=ctx.getMessage("password.required",new Object[] {"password"},null);
System.out.println(m2);
String m3=ctx.getMessage("errors.min",new Object[] {"username","5"},null);
System.out.println(m3);
String m4=ctx.getMessage("errors.max",new Object[] {"username","10"},null);
System.out.println(m4);
String m5=ctx.getMessage("errors.range",new Object[] {"password","6","12"},null);
System.out.println(m5);
String m6=ctx.getMessage("errors.range1",new Object[] {"password","6","12"},"username range is not ok",null);
System.out.println(m6);
}
void showHindi()
{
	Locale local=new Locale("hi");
String m1=ctx.getMessage("username.required",null,local);
System.out.println(m1);
String m2=ctx.getMessage("password.required",new Object[] {"password"},local);
System.out.println(m2);
String m3=ctx.getMessage("errors.min",new Object[] {"username","5"},local);
System.out.println(m3);
String m4=ctx.getMessage("errors.max",new Object[] {"username","10"},local);
System.out.println(m4);
String m5=ctx.getMessage("errors.range",new Object[] {"password","6","12"},local);
System.out.println(m5);
String m6=ctx.getMessage("errors.range1",new Object[] {"password","6","12"},"username range is not ok",local);
System.out.println(m6);
}
	
}
