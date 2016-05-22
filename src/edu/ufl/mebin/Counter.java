package edu.ufl.mebin;

import java.util.ArrayList;
import java.util.List;

public class Counter implements Runnable {
	int count;

	@Override
	public void run() {
		List<Integer> values = new ArrayList<Integer>();
		while (count <100) {
			incrementAndAdd(values);
		}
		for (Integer val : values) {
			System.out.println(val);
		}
	}

	private synchronized  void incrementAndAdd(List<Integer> values) {
		if(count < 100){
			count++;
			values.add(count);
		}
		
	}

}
