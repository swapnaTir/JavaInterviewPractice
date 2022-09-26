package com.practice.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;



public class DuplicateElementsInAnArray {
public static Logger logger = Logger.getLogger (DuplicateElementsInAnArray.class.getName());
	@Test
	public void duplicateElements() {
		int[] elementsInArray = {10,11,12,13,14,15,15,16,16};
		Map<Integer,Integer> duplicatesInMap = new HashMap<Integer,Integer>();
		for(int i:elementsInArray) {
			if(duplicatesInMap.containsKey(i)) {
				duplicatesInMap.put(i,duplicatesInMap.get(i)+1);
			}
			else {
				duplicatesInMap.put(i,1);
			}
		}
		Set<Integer> duplicateSet = duplicatesInMap.keySet();
		for(int j:duplicateSet) {
			if(duplicatesInMap.get(j)>1) {
				int k =duplicatesInMap.get(j);
				logger.info("Duplicate element : {},count : {} "+ j + k);
			}
		}
	}



}

