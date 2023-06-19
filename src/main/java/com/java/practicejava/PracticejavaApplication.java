package com.java.practicejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;


@SpringBootApplication
public class PracticejavaApplication {
    
     
	public static void main(String[] args) {
		SpringApplication.run(PracticejavaApplication.class, args);
		LocalDateTime ldt = LocalDateTime.now();
	    LocalTime lt = LocalTime.now();
	    LocalDate ld = LocalDate.now();
	    
		System.out.println(ldt);
		System.out.println(lt);
		System.out.println(ld);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
	    System.out.println(al);
	    System.out.println(al.get(2));
	    
	    LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		
		System.out.println(ll.getLast());
		
		
	}

}
