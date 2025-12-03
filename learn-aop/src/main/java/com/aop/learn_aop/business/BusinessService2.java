package com.aop.learn_aop.business;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.aop.learn_aop.data.DataService2;



@Service
public class BusinessService2 {
	
	private DataService2 dataService2;
	
	public BusinessService2(DataService2 dataService2) {
		this.dataService2 = dataService2;
	}
	
	public int calculateMax() {
		int[] data = dataService2.retrieveData();
		return Arrays.stream(data).max().orElse(0);
	}
}

