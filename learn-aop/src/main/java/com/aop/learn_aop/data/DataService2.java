package com.aop.learn_aop.data;


import org.springframework.stereotype.Repository;

import com.aop.learn_aop.business.TrackTime;

@Repository
public class DataService2 {
	@TrackTime
	public int[] retrieveData() {
		try {
			Thread.sleep(30);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		return new int[] {11, 22, 33, 44, 55};
	}

}

