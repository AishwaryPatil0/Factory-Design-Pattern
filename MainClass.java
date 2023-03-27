package com.factorydesignpattern;

import java.util.Scanner;

interface Beverages{
	   
   }
   
   class Coffee implements Beverages{
	   
   }
   class Tea implements Beverages{
	   
   }
   
   class Company{
	   
	   Beverages vendingMachine(int choice){
		   
		   if(choice==1) {
			   Coffee c1=new Coffee();
			   return c1;
		   }
		   else if (choice==2) {
			   Tea t1=new Tea();
			   return t1;
		   }
		   else {
			   return null;
		   }
		   
	   }
   }

public class MainClass {
	
	public static void main(String[] args) {
		Company c1=new Company();
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the choice");
		int choice=ip.nextInt();
	     Beverages obj=c1.vendingMachine(choice);
	     
	     if(obj instanceof Coffee) {
	    	 System.out.println("ordering coffee");
	     }
	     else if(obj instanceof Tea) {
	    	 System.out.println("Ordering tea");
	     }
	     else {
	    	 System.out.println("invalid choice");
	     }
		
	}	

}