package com;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {


	public static void main(String[] args) {
		
		//Stream 
		
		/*
		 * String str[]=new String[] {"hai","hello","gd mrng"};
		 * Stream.of(str).forEach(System.out::println);
		 */
		  
		
		//filter findFirst
		/*
		 * List list= Arrays.asList("hi","welcome");
		 * 
		 * String ss=(String) list.stream().filter(
		 * s->s.equals("hai")).findFirst().orElse(null); System.out.println(ss);
		 */
		
		//map 		
		//list.stream().map(s->s=s+"abc").forEach(s->System.out.println(s));
		
		//flatMap
		/*
		 * List<List<String>> namesNested = Arrays.asList( Arrays.asList("Jeff",
		 * "Bezos"), Arrays.asList("Bill", "Gates"), Arrays.asList("Mark",
		 * "Zuckerberg"));
		 * 
		 * List<String> namesFlatStream = namesNested.stream()
		 * .flatMap(Collection::stream) .collect(Collectors.toList());
		 * System.out.println(namesFlatStream);
		 */
		
		
		//peek		
		/*
		 * List list = Arrays.asList("hi", "welcome"); list.stream().peek(s -> { s = s +
		 * "abc"; }).peek(System.out::println).collect(Collectors.toList());
		 */
		 
		
		//Short-circuiting operations
		/*
		 * Stream<Integer> infiniteStream = Stream.iterate(2, i -> i * 2); List<Integer>
		 * collect = infiniteStream .skip(3) .limit(5) .collect(Collectors.toList());
		 * System.out.println(collect);
		 */
		
		
		//Lazy Evaluation
		/*
		 * Integer[] empIds = { 1, 2, 3, 4 }; Stream.of(empIds) .map(s->s=s+10)
		 * .filter(e -> e != null) .filter(e -> e > 10).peek(System.out::println)
		 * .findFirst() .orElse(null);
		 */
		
		
		//min
		/*
		 * Integer[] empIds = { 10, 2, 3, 4 }; Optional<Integer>
		 * min=Stream.of(empIds).min((id1,id2)->id1.compareTo(id2));
		 * System.out.println(min.get());
		 */
		
		//min max sorted takes comparator logic as argument
		//min,max,findFirst returns Optional
		//allMatch, anyMatch, and noneMatch
		
		
		//Steam specialization
		//mapToInt
		/*
		 * Integer[] empIds = { 10, 2, 3, 4 }; Integer max = Stream.of(empIds)
		 * .mapToInt(s->s) .max() .orElseThrow(null); System.out.println(max);
		 */
		
		///Specialized streams provide additional operations as compared to the standard Stream – which are quite convenient when dealing with numbers.
		///sum(), average(), range()
		
		//reduce
		/*
		 * Double[] empIds = { 10.0, 2.0, 3.0, 4.0 }; Double sum =
		 * Stream.of(empIds).reduce(0.0, Double::sum); System.out.println(sum);
		 */
		
		String[] empIds1 = { "10.0", "2.0", "3.0"};
		String f = Stream.of(empIds1).collect(Collectors.joining(", "));
		System.out.println(f);
	}

}
