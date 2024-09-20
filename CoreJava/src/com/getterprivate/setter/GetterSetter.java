package com.getterprivate.setter;

public class GetterSetter {
	//if no access specifier is mentioned then it will be Default
			private int serialNum=10;//data variables
			private String name;
			private int age;
			//by using getter and setter ,I can access private data members
			
			// to display string representation of the object
			@Override
			public String toString() {
				return "GetterSetter [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
			}
			
			public int getSerialNum() {//get is used to read the value
				return serialNum;
			}

			public void setSerialNum(int serialNum) {// set the value
				this.serialNum = serialNum;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

		}

