package com.account.streams.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringEx {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("abc","","bc", "ehg", "abcd","","jkl");

        
        List<String> nonEmpty = strings.stream().filter(str -> str.length()!=0).collect(Collectors.toList());

        System.out.println("strings with non-zero characters:"+nonEmpty);
        
        long a = strings.stream().filter(str -> str.length()==0).count();
        System.out.println("Count of strigs with empty values="+a);

        List<String> thrChar = strings.stream().filter(str -> str.length()==3).collect(Collectors.toList());
        System.out.println("strings with three characters:"+thrChar);

    }
	

}
