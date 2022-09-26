package com.practice.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class DuplicateCharInAString {

	public static Logger logger = Logger.getLogger (DuplicateElementsInAnArray.class.getName());

	@Test
	public void duplicateCharInAString() {
		Map<Character,Integer> duplicateMap = new HashMap<Character,Integer>();
		String s = "albany";
		char[] charArr = s.toCharArray();
		for(char c:charArr) {
			if(duplicateMap.containsKey(c)) {
				duplicateMap.put(c,duplicateMap.get(c)+1);
			}
			else {
				duplicateMap.put(c,1);
			}

		}

		Set<Character> charSetNew = duplicateMap.keySet();
		for(char c:charSetNew) {
			if(duplicateMap.get(c)>1) {
				logger.info("duplicate character " + c + " " + duplicateMap.get(c));
				System.out.println("duplicate character " + c + " " + duplicateMap.get(c));
			}
		}

	}
}
