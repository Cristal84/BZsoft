package com.bzsoft;

import java.util.Date;

public class HelloWorld {
	public static void main(String[] args){
		System.out.println("Hello Barbara Welcome to the Jungle");
		
		HelloWorld h = new HelloWorld();
		h.hello("Francesco");
		
		Persona barbara= new Persona("Barbara","Zonnedda",new Date());
		System.out.println(barbara);
	}
	
	public void hello(String nome){
		System.out.println("Benvenuto "+nome);
	} 
}

