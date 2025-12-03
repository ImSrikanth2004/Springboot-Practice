package com.spring1.learn_spring_framework.ex.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDataService implements DataService{

	@Override public int[] retrieveData(){
		// TODO Auto-generated method stub
		return new int[] {11, 22, 33, 44, 55};
	}
	
}

