package com.vec.training.trng;

public class StreamSuper implements StreamInterface{
	 private String name;
	    private int age;

	    public StreamSuper(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    @Override
	    public String getName() { return name; }
	    @Override
	    public int getAge() { return age; }

	    @Override
	    public String toString() {
	        return name + " (" + age + ")";
	    }
}
