package com.vec.training.trng;
import java.io.*;
import java.util.Scanner;
public class FileMgmt {
      public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
    	  try {
    		  System.out.println("Enter your source file path: ");
    		  String source = sc.nextLine();
    		  
    		  System.out.println("Enter your destination file path: ");
    		  String destination = sc.nextLine();
    		  
    		  BufferedReader br = new BufferedReader(new FileReader(source));
    		  FileWriter w = new FileWriter(destination);
    		  
    		  String line;
    		  while((line = br.readLine())!= null) {
    			  w.write(line+ "\n");
    	  }
    		  br.close();
    		  w.close();
    		  System.out.println("Copied successfully to "+ destination);
    		  FileInputStream fis = new FileInputStream(destination);
    		  System.out.println("\n Copied files successfully...");
    		  int byteData;
    		  while((byteData = fis.read())!= -1) {
    			  System.out.print((char) byteData);
    		  }
    		 fis.close();
    	     FileOutputStream fos =new FileOutputStream(destination, true);
    	     String more = sc.nextLine();
    	     fos.write(more.getBytes());
    	     fos.close();
      }catch(IOException io) {
    	  System.out.println("Failed---  "+io.getMessage());
      }
    	  finally {
    		  sc.close();
    	  }
}
}