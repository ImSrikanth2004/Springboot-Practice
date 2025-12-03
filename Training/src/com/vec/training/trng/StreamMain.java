package com.vec.training.trng;
import java.util.*;
import static java.util.stream.Collectors.*;
public class StreamMain {
	 public static void main(String[] args) {
	        List<StreamSuper> people = Arrays.asList(
	            new StreamSuper("Ravi", 21),
	            new StreamSuper("Srikanth", 19),
	            new StreamSuper("Mansoor", 22),
	            new StreamSuper("Sita", 18)
	        );

	        // Find students above 20, sort by name, and collect names
	        List<String> result = people.stream()
	                                      .filter(s -> s.getAge() > 20)
	                                      .map(StreamSuper::getName)
	                                      .sorted()
	                                      .collect(toList());

	        System.out.println(result); 
	    }
}

//SOURCE 
//A collection (list.stream())
//
//An array (Arrays.stream(arr))
//
//A method (Stream.of("a", "b"))
//
//A file (Files.lines(path))
//
//Or even an infinite stream (Stream.iterate(), Stream.generate())


//INTERMEDIATE OPERATIONS
//filter(Predicate<T>) → Select elements that match a condition.
//
//map(Function<T,R>) → Transform each element into another type/value.
//
//mapToInt, mapToLong, mapToDouble → Special versions of map for primitives.
//
//flatMap(Function<T, Stream<R>>) → Flatten nested streams (e.g., List<List<T>> → Stream<T>).
//
//flatMapToInt, flatMapToLong, flatMapToDouble → Primitive flattening.
//
//distinct() → Remove duplicate elements.
//
//sorted() → Sort elements naturally.
//
//sorted(Comparator<T>) → Sort with custom comparator.
//
//peek(Consumer<T>) → Debugging / perform an action while streaming (doesn’t change stream).
//
//limit(long n) → Limit to first n elements.
//
//skip(long n) → Skip first n elements.
//
//takeWhile(Predicate<T>) (Java 9+) → Take elements until condition is false.
//
//dropWhile(Predicate<T>) (Java 9+) → Skip elements until condition is false.                                                                                                     |


//  TERMINAL OPERATIONS
//forEach() → iterate & print/use elements
//
//collect() → collect into a list, set, or map
//
//reduce() → reduce to a single value (sum, max, etc.)
//
//count() → number of elements
//
//anyMatch()/allMatch() → test conditions