package com.vec.training.trng;
import java.util.*;
import static java.util.stream.Collectors.*;
public class StreamsLambda {
       public static void main(String[] args) {
    	   List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

           
           List<String> result = names.stream()
                                      .filter(name -> name.startsWith("A"))   
                                      .map(String::toUpperCase)               
                                      .collect(toList());    //Collectors.joining(", ", "[", "]")                       

           System.out.println(result); 
           
           List<Integer> numbers = Arrays.asList(15, 10, 5, 2, 20);

           int sum = numbers.stream()
                            .reduce(0, (a, b) -> a + b);

           System.out.println("Sum = " + sum); 
           List<Integer> ord = numbers.stream()
        		            .sorted()
        		            .collect(toList());
           System.out.print("Ordered = "+ord);
           
           List<Integer> desc = numbers.stream()
        	        .sorted(Comparator.reverseOrder())
        	        .collect(toList());
           System.out.print("Ordered = "+desc);
       }
}
