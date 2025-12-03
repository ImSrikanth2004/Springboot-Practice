package com.spring1.learn_spring_framework.ex.c1;

import org.springframework.stereotype.Component;

@Component
public class SQLServerDataService implements DataService{

	@Override public int[] retrieveData(){
		// TODO Auto-generated method stub
		
		return new int[] {1, 2, 3, 4, 5};
	
	}
	
}

