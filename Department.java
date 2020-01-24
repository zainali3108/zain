package com.exam.encapsulation;

public class Department {

		String deptName;
		String Id;
		String Location;
		
		Department () {		
		}

		Department (String name, String id){

			 deptName=name;
			 Id=id;

		}
	
		public Department (String name, String  id, String location) {			
			 deptName=name;
			 Id=id;
			 Location=location;		
		}
		
		public static void main(String[] args) {

			Department zqz = new Department ();
			Department zaz = new Department("IT","2241" );
			Department zez = new Department ("HR", " 3108", " Virginia ");
			System.out.println("name: " + zaz.deptName);
			System.out.println("Id: " + zaz.Id );
			System.out.println("Location: " + zez.Location);
			System.out.println("DeptName, Id, Location: " + zez.deptName + zez.Id + zez.Location);

		
		}

	}


		