package com.aop.learn_aop.business;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.aop.learn_aop.data.DataService1;



@Service
public class BusinessService1 {
	
	private DataService1 dataService1;
	
	public BusinessService1(DataService1 dataService1) {
		this.dataService1 = dataService1;
	}
	
	@TrackTime
	public int calculateMax() {
		int[] data = dataService1.retrieveData();
		return Arrays.stream(data).max().orElse(0);
	}
}

