package com.vec.training.trng;
import java.util.*;
import java.util.stream.*;
public class StreamError {
      public static void main(String[] args) {
    	  Stream<String> stream = 
    			  Stream.of("a", "b", "c").filter(element -> element.contains("b"));
    			Optional<String> anyElement = stream.findAny();
    		    System.out.println(anyElement);
    		    
//    		    Optional<String> firstElement = stream.findFirst(); //Can't be reused
//    		    System.out.println(firstElement);
    		    
    		    //Right use case
//    		    List<String> elements =
//    		    		  Stream.of("a", "b", "c").filter(element -> element.contains("b"))
//    		    		    .collect(Collectors.toList());
//    		    		Optional<String> anyElement = elements.stream().findAny();
//    		    		Optional<String> firstElement = elements.stream().findFirst();
      }
}
