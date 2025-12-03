package com.vec.training.trng;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class CustomCollectors {
//public interface Collector<T, A, R> {...}
	public static Collector<String, ?, LinkedList<String>> toUpperCaseLinkedList() {
        return Collector.of(
                LinkedList::new,                        // Supplier: creates a new LinkedList
                (list, str) -> list.add(str.toUpperCase()), // Accumulator: adds element (converted to uppercase)
                (list1, list2) -> {                      // Combiner: merges two lists
                    list1.addAll(list2);
                    return list1;
                },
                Collector.Characteristics.IDENTITY_FINISH // The result container is the final result
        );
    }
	 public static void main(String[] args) {
	        Stream<String> names = Stream.of("alice", "bob", "charlie");

	        LinkedList<String> result = names.collect(toUpperCaseLinkedList());

	        System.out.println(result); // Output: [ALICE, BOB, CHARLIE]
	    }
}
