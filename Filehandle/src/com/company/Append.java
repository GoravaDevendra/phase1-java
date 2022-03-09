package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Append {
	public static void main(String[] args){
		 // Append text to Existing File.
		 String path = "C:\\Users\\DELL\\Desktop\\File Handling\\Demo.txt";
		 String text = " Currently doing training at Simplilearn";
		 try
		 {
		 FileWriter f = new FileWriter(path,true);
		 f.write(text);
		 f.close();
		 System.out.println("Append done Successfully..");
		 }
		 catch(IOException e){
		 System.out.println(e);
		 }
		 }
		}


