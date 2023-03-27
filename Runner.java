package com.factorydesignpattern;


interface Person{
	void work();
}

class Doctor implements Person{
	int id=101;
	@Override
	public void work() {
		System.out.println("Doctor is working");
	}


}
class Engineer implements Person{
	String name="Tom";
	@Override
	public void work() {
		System.out.println("Enginner is working");

	}

}

public class Runner {

	//   1.Person obj=new Doctor(); and 2.Person obj=new Engineer();
	static void display(Person obj) {
		if(obj instanceof Doctor) {
			Doctor d1=   (Doctor) obj;
			System.out.println(d1.id);
			d1.work();
		}
		else if(obj instanceof Engineer) {
			Engineer e1=   (Engineer) obj;
			System.out.println(e1.name);
			e1.work();
		}
	}
	public static void main(String[] args) {
		display(new Doctor());//1
		display(new Engineer());//2

	}
}