package com.java8.streams;

import java.util.stream.Stream;

public class UsingStreams {

	public static void main(String[] args) throws java.lang.Exception {
		Stream<String> fruitStream = Stream.of("apple", "banana", "pear", "kiwi", "orange");
		
		fruitStream.filter(s -> s.contains("a")).map(String::toUpperCase).sorted().forEach(System.out::println);
	}

}
