package com.vec.training.trng;
import java.util.*;
public class Collections {
    public static void main(String args[]) {
    	ArrayList<String> fruits = new ArrayList<>();
    	fruits.add("Apple");
    	fruits.add("Banana");
    	fruits.add("Apple"); 
    	System.out.println(fruits); 
    	System.out.println(fruits.get(1)); 
    	
    	LinkedList<String> cars = new LinkedList<>();
    	cars.add("Maruti");
    	cars.addFirst("Tata");
    	System.out.println(cars);
    	
    	Set<String> pens = new HashSet<>(); 
    	pens.add("Reynolds");
    	pens.add("Cello");
    	pens.add("Pilot");
    	pens.add("Montblanc");
    	System.out.println(pens);
    	
    	HashSet<Integer> uniqueNumbers = new HashSet<>();
    	uniqueNumbers.add(10);
    	uniqueNumbers.add(20);
    	uniqueNumbers.add(10); 
    	System.out.println(uniqueNumbers);
    	
    	TreeSet<String> actors = new TreeSet<>();
    	actors.add("Leonardo DiCaprio");
    	actors.add("Al Pacino");
    	actors.add("Robert DeNiro");
    	actors.add("Jake Gyllenhaal");
    	System.out.println(actors);
    	
    	HashMap<String, Integer> studentScores = new HashMap<>();
    	studentScores.put("Raju", 95);
    	studentScores.put("Ajay", 88);
    	studentScores.put("Yogesh", 98);
    	System.out.println(studentScores); 
    	System.out.println(studentScores.get("Ajay"));
    	
    	Map<Integer, String> films = new HashMap<>();
    	films.put(1993, "Schindler's list");
    	films.put(2013, "The Wolf of Wall Street");
    	films.put(2000, "Unbreakable");
    	films.put(1968, "2001: A Space Odyssey");
    	System.out.println(films);
    	System.out.println(films.get(2013));
    	
    	
    }
}
