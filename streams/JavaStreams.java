package com.account.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaStreams {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(11);
		numbers.add(12);
		numbers.add(15);
		numbers.add(13);
		numbers.add(14);

		System.out.println("numbers are " + numbers);
		// square of each number

		numbers.forEach(n -> System.out.println(n * n));

		List<Integer> result = numbers.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println("Resulting list is:" + result);

		Predicate<Integer> checkeven = sqr -> (sqr % 2 == 0);

		//List<Integer> evenresult = numbers.stream().map(n -> n * n).filter(checkeven).collect(Collectors.toList());
		Set<Integer> evenresult = numbers.stream().map(n -> n * n).filter(checkeven).collect(Collectors.toSet());

		System.out.println("Resulting list is:" + evenresult);
		
		System.out.println("Using forEach");
		numbers.stream().map(n->n*n).filter(checkeven).forEach(n->System.out.println("***"+n));
	
//		map<Object,String == >map<className,String>
//	map.entryset().stream().map(e->e.getKey().getClassName(),e.getValue()).collect;
	}

}
