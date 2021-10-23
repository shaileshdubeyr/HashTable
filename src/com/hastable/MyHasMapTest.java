package com.hastable;

import org.junit.Assert;
import org.junit.Test;

public class MyHasMapTest {
	@Test
	public void givenSentenceWhenWordAreAddedToListShouldReturnWord() {
		String sentence = "to be not to be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<String, Integer>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer  value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myHashMap.add(word, value);
		}
		int frequency = myHashMap.get("to");
		System.out.println("frequency is of to is " + frequency);
		Assert.assertEquals(2, frequency);
	}
}