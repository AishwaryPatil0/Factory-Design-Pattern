package com.factorydesignpattern;


import java.util.Scanner;

interface Food{

}

class Idly implements Food{   /// class to interface ---implements

}

class Poori implements Food{

}

class Dosa implements Food{

}
class Hotel{
	Food OrderFood(int choice){// one method is eligible to return different objects

		if(choice==1) {
			Idly i1=new Idly();
			return i1;// return new Idly();
		}
		else if(choice==2) {
			Poori p1=new Poori();
			return p1;  //return new Poori();
		}
		else if(choice==3) {
			Dosa d1=new Dosa();
			return d1;  //return new Dosa();
		}
		else {
			return null;
		}

	}

	public class Solution {

		public static void main(String[] args) {

			Hotel h1=new Hotel();

			//**Generalisation or upcasting

			//			Food obj=h1.OrderFood(1);-->Food obj=new Idly();
			//			Food obj=h1.OrderFood(2);-->Food obj=new Dosa();
			//			Food obj=h1.OrderFood(3);-->Food obj=new Poori();
			//			Food obj=h1.OrderFood(3);-->Food null;
			//			
			Scanner ip=new Scanner(System.in);
			System.out.println("Entering the choice");
			int choice=ip.nextInt();

			Food obj=h1.OrderFood(choice);
			if(obj instanceof Idly) {
				System.out.println("ordering idly");
			}
			else if(obj instanceof Dosa) {
				System.out.println("ordering dosa");
			}
			else if(obj instanceof Poori) {
				System.out.println("ordering poori");
			}
			else {
				System.out.println("Invalid choice");

			}
		}

	}
}
