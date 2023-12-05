package io.javabrains;

import io.javabrains.*;
import java.util.Arrays;
import java.util.List;

public class Iterations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> person =Arrays.asList(
             new Person("Hanu","Jupudi",20),
             new Person("Srija","Jupudi",30),
             new Person("Mannu","Jupudi",40)		
		);
		System.out.println("Using For Loop");
		
		for(int i=0;i<person.size();i++)
		{
			System.out.println(person.get(i));
		}
		
		System.out.println("Using For in loop");
		
		for(Person p: person) {
			System.out.println(p);
		}
		System.out.println("Using Lambda For Each");
		
		person.forEach(p->System.out.println(p));
		
		

	}

}
