package com.vec.training.trng;
import static java.util.stream.Collectors.*;
//import static java.util.stream.Collectors.teeing;
import java.util.function.*;
import java.util.*;
public class CollectorsDemo {
	List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd");
	
	//Collectors.toCollection()
	public void ToCol() {
		System.out.println("Result of Collectors.toCollection()");
    	List<String> result = givenList.stream()
    			  .collect(toCollection(LinkedList::new));
    	result.forEach(System.out::println);
	} 
	
	//Collectors.toList()
	public void ToList() {
		System.out.println("Result of Collectors.toCollection()");
		List<String> result = givenList.stream()
				  .collect(toList());
		result.forEach(System.out::println);
	}
	
	//Collectors.toUnmodifiableList()
	public void ToUnmodList() {
		System.out.println("Result of Collectors.toCollection()");
		List<String> result = givenList.stream()
				  .collect(toUnmodifiableList());
		result.forEach(System.out::println);
	}
	
	//Collectors.toSet()
	public void ToSet() {
		System.out.println("Result of Collectors.toCollection()");
		Set<String> result = givenList.stream()
				  .collect(toSet());
		result.forEach(System.out::println);
	}
	
	//Collectors.toUnmodifiableSet()
	public void ToUnmodSet() {
		System.out.println("Result of Collectors.toCollection()");
		Set<String> result = givenList.stream()
				  .collect(toUnmodifiableSet());
		result.forEach(System.out::println);
	}
	
	//Collectors.toMap()
	public void ToMap() {
		System.out.println("Result of Collectors.toCollection()");
		Map<String, Integer> result = givenList.stream()
				  .collect(toMap(Function.identity(), String::length));
		System.out.println(result);
	}
	
	//
	//Collectors.toUnmodifiableMap()
	public void ToUnmodMap() {
		System.out.println("Result of Collectors.toCollection()");
		Map<String, Integer> result = givenList.stream()
				  .collect(toUnmodifiableMap(Function.identity(), String::length));
		System.out.println(result);
	}
	
	//Collectors.collectingAndThen()
	public void CAT() {
		System.out.println("Result of Collectors.toCollection()");
		List<String> result = givenList.stream()
				  .collect(collectingAndThen(toList(), List::copyOf));
		System.out.println(result);
	}
	
	//Collectors.joining()
	public void Joining() {
		System.out.println("Result of Collectors.toCollection()");
		String result = givenList.stream()
				  .collect(joining(" "));	
		System.out.println(result);
	}
	
	//Collectors.counting()
	public void Counting() {
		System.out.println("Result of Collectors.toCollection()");
		Long result = givenList.stream()
				  .collect(counting());	
		System.out.println(result);
	}
	
	//Collectors.summarizingDouble/Long/Int()()
	public void Summarizing() {
		System.out.println("Result of Collectors.toCollection()");
		DoubleSummaryStatistics SumDouble = givenList.stream()
				  .collect(summarizingDouble(String::length));		
		System.out.println(SumDouble);
		LongSummaryStatistics SumLong = givenList.stream()
				  .collect(summarizingLong(String::length));
		System.out.println(SumLong);
		IntSummaryStatistics SumInt = givenList.stream()
				  .collect(summarizingInt(String::length));
	    System.out.println(SumInt);
	}
	
	//Collectors.averagingDouble/Long/Int()
	public void Averaging() {
		System.out.println("Result of Collectors.toCollection()");
		Double AvgDouble = givenList.stream()
				  .collect(averagingDouble(String::length));	
		System.out.println(AvgDouble);
//		Long AvgLong = givenList.stream()
//				  .collect(averagingLong(String::length));
//		System.out.println(AvgLong);
//		Integer AvgInt = givenList.stream()
//				  .collect(averagingInt(String::length));
//	    System.out.println(AvgInt);
	}
	
	//Collectors.summingDouble/Long/Int()
	public void Summing() {
		System.out.println("Result of Collectors.toCollection()");
		Double SumDouble = givenList.stream()
				  .collect(summingDouble(String::length));	
		System.out.println(SumDouble);
		Long SumLong = givenList.stream()
				  .collect(summingLong(String::length));
		System.out.println(SumLong);
		Integer SumInt = givenList.stream()
				  .collect(summingInt(String::length));
	    System.out.println(SumInt);
	    
	}
	
	//Collectors.maxBy/minBy()
	public void MaxMinBy() {
		System.out.println("Result of Collectors.toCollection()");
		Optional<String> maxValue = givenList.stream()
				  .collect(maxBy(Comparator.naturalOrder()));
		System.out.println(maxValue);
		Optional<String> minValue = givenList.stream()
				  .collect(minBy(Comparator.naturalOrder()));
		System.out.println(minValue);
	}
	
	//Collectors.groupingBy()
	public void GroupingBy() {
		System.out.println("Result of Collectors.toCollection()");
		Map<Integer, Set<String>> result = givenList.stream()
				  .collect(groupingBy(String::length, toSet()));
		System.out.println(result);
	}
	
	//Collectors.partitioningBy()
	public void PartitioningBy() {
		System.out.println("Result of Collectors.toCollection()");
		Map<Boolean, List<String>> result = givenList.stream()
				  .collect(partitioningBy(s -> s.length() > 2));
		System.out.println(result);
	}
	
	//Collectors.teeing()
//    public void Teeing() {
//        List<Integer> numbers = Arrays.asList(42, 4, 2, 24);
//
//        List<Integer> result = numbers.stream().collect(teeing(
//                minBy(Integer::compareTo),   // First collector: minimum
//                maxBy(Integer::compareTo),   // Second collector: maximum
//                (min, max) -> Arrays.asList(min.orElse(null), max.orElse(null)) // Combine results
//            ));
//
//        System.out.println(result); 
//    }
	public static void main(String[] args) {
	    CollectorsDemo c = new CollectorsDemo();
	    c.ToCol();
	    c.ToList();
	    c.ToUnmodList();
	    c.ToSet();
	    c.ToUnmodSet();
	    c.ToMap();
	    c.ToUnmodMap();
	    c.CAT();
	    c.Joining();
	    c.Counting();
	    c.Summarizing();
	    c.Averaging();
	    c.Summing();
	    c.MaxMinBy();
	    c.GroupingBy();
	    c.PartitioningBy();
//	    c.Teeing();   // works now
	}

}
