package com.account.threads.sep6th;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerStream {

	public static void main(String[] args) {
List<Integer> integers=Arrays.asList(1,2,13,4,15,6,17,8,19);

System.out.println("numbers are " + integers);
// square of each number

integers.forEach(n -> System.out.println(n * n));

List<Integer> result = integers.stream().map(n -> n * n).collect(Collectors.toList());
System.out.println("Resulting list is:" + result);

int sum = integers.stream().collect(Collectors.summingInt(i->i));
System.out.println("Resulting sum is:" + sum);


double avg = integers.stream().collect(Collectors.averagingInt(i->i));
System.out.println("Resulting average is:" + avg);
}

}
