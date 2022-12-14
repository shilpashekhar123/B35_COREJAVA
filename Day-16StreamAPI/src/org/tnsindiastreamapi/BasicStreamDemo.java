package org.tnsindiastreamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) {
		Stream<String>obj=Stream.of("shilpa","divya","girisha");
  //for each terminal operation
		
		obj.forEach((i)->System.out.print(i+""));
		System.out.println();
		//stream can be obtained from source like array or collection
		//To obtain stream from array,use java.util.array class
		
		List<Integer>obj1=Arrays.asList(new Integer[]{22,54,87});
		obj1.forEach((i)->System.out.print(i +""));
		Set<String>obj2=new HashSet<>();
		obj2.add("Nia");
		obj2.add("divya");
		obj2.add("shilpa");
		System.out.println(obj2);
		for(String str:obj2)
		{
			System.out.println(str); 		
		
		
		
		
	}

	}
}
