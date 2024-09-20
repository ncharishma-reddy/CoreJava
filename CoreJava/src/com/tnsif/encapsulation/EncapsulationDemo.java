package com.tnsif.encapsulation;

public class EncapsulationDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation ob= new Encapsulation();//creating an object
			ob.name="Charishma";//calling the variables
			ob.age=21;
			ob.serialNum=22;
		
			ob.show();  //by using ob we can call methods
		
//		System.out.println(ob);//it will only print location of it but not members
//       // if i want to get the contents here go back to Encapsulation file and a method called toString method
	}

}