package com.getterprivate.setter;


public class EncapsulationPrivate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetterSetter ob= new GetterSetter();

		ob.setAge(22);
		ob.setName("ramya");
		ob.setSerialNum(50);
		
		System.out.println(ob);//it will only print location of it but not members
	       // if i want to get the contents here go back to Encapsulation file and a method called toString method
	}

}