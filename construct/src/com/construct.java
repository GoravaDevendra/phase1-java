package com;

public class construct {
		private String name;
		public construct(String name) {
			this.name=name;
			System.out.println("this is a parameterized constructor");
			
		}
		public construct() {
			System.out.println("This is a nonparameterized constructor");
		}
		
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		
		public static void main(String[] args) {
			
			construct con=new construct();
			construct con1=new construct("dev");
			con1.setName("dev");
			System.out.println("The passed parameter is "+con1.getName());	

		}

	}


