package com.vec.training.trng;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.*;

public class Streams {

    // Empty Stream
    public Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }

    // Collection Stream
    public void streamOfCollections() {
        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();
        System.out.println("Collection Stream:");
        streamOfCollection.forEach(System.out::println);
    }

    // Arrays Stream
    public void streamOfArrays() {
        System.out.println("Array created using Stream.of:");
        Stream.of("a", "b", "c").forEach(System.out::println);

        String[] arr = {"a", "b", "c"};
        System.out.println("Stream containing array of values:");
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("Array sliced using stream:");
        Arrays.stream(arr, 1, 3).forEach(System.out::println);
    }

    // StreamBuilder
    public void streamBuilder() {
        System.out.println("Stream created using StreamBuilder:");
        Stream.<String>builder().add("a").add("b").add("c").build().forEach(System.out::println);
    }

    // StreamGenerate
    public void streamGenerate() {
        System.out.println("Stream created using StreamGenerate:");
        Stream.generate(() -> "element").limit(5).forEach(System.out::println);
    }

    // StreamIterate
    public void streamIterate() {
        System.out.println("Stream created using StreamIterate:");
        Stream.iterate(40, n -> n + 2).limit(10).forEach(System.out::println);
    }

    // Stream of Primitives
    public void streamOfPrimitives() {
        System.out.println("Stream created for int values:");
        IntStream.range(1, 3).forEach(System.out::println);

        System.out.println("Stream created for long values:");
        LongStream.rangeClosed(1, 3).forEach(System.out::println);

        System.out.println("Stream created for double values:");
        new Random().doubles(3).forEach(System.out::println);
    }

    // streamOfChars
    public void streamOfChars() {
        System.out.println("Stream of characters from string:");
        "abc".chars().forEach(ch -> System.out.println((char) ch));

        System.out.println("Stream from regex split:");
        Pattern.compile(", ").splitAsStream("a, b, c").forEach(System.out::println);
    }

    // streamOfFile
    public void streamOfFile() {
        Path path = Paths.get("D://SQL Practice/Plannew.txt");
        try (Stream<String> streamOfStrings = Files.lines(path);
             Stream<String> streamWithCharset = Files.lines(path, Charset.forName("UTF-8"))) {

            System.out.println("Stream of Strings from file:");
            streamOfStrings.forEach(System.out::println);

            System.out.println("Stream of charset from file:");
            streamWithCharset.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //Referencing a Stream 
    
    //Lazy Invocation
    private long counter;
    
	private void wasCalled() {
		
	    counter++;
	}
    public void lazyInvocation() {
    	List<String> list = Arrays.asList("abc1", "abc2", "abc3");
    	counter = 0;
    	Stream<String> stream = list.stream().filter(element -> {
    	    wasCalled();
    	    return element.contains("2");
    	});
    	stream.forEach(System.out::println);
    	
//    	Optional<String> stream = list.stream().filter(element -> {
//    	    log.info("filter() was called");
//    	    return element.contains("2");
//    	}).map(element -> {
//    	    log.info("map() was called");
//    	    return element.toUpperCase();
//    	}).findFirst();
//    	stream.forEach(System.out::println);
    }
    

    // Main
    public static void main(String[] args) {
        Streams e = new Streams();

        System.out.println("Empty Stream:");
        e.streamOf(null).forEach(System.out::println);

        System.out.println();
        e.streamOfCollections();

        System.out.println();
        e.streamOfArrays();

        System.out.println();
        e.streamBuilder();

        System.out.println();
        e.streamGenerate();

        System.out.println();
        e.streamIterate();

        System.out.println();
        e.streamOfPrimitives();

        System.out.println();
        e.streamOfChars();

        System.out.println();
        e.streamOfFile();
        
        System.out.println();
        e.lazyInvocation();
    }
}
