package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args){
		 //Writing in the file

		 try
		 {
		FileWriter f = new FileWriter("C:\\Users\\DELL\\Desktop\\FileHandling\\Demo.txt");
		 try
		 {
		 f.write("Sumit is the employee of Mphasis limited..!!");
		 }
		 finally
		 {
		 f.close();
		 }
		 System.out.println("Successfully Written..!! ");
		 }
		 catch(IOException i)
		 {
		 System.out.println(i);
		 }

		 }
		}


