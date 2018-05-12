package org.naveen.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class BaseWithImplementations {

	/*
	 * public void m1(int i) { System.out.println("m1 called" + i); }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Naveen");

		BaseWithImplementations base = new BaseWithImplementations();
		// base.m1(1);

		Supplier<List<Integer>> s = new Supplier<List<Integer>>(){

			public List<Integer> get() {
				
				List<Integer> al = new ArrayList<>();
				
				return al;
			}
			
		};
		
		BiConsumer<Integer,Integer> c = new BiConsumer<Integer,Integer> (){

			public void accept(Integer t,Integer t1) {
				System.out.println(t+t1);
			}
			
		};
		
		base.m1(c, s);

	}

	public void m1(BiConsumer<Integer,Integer> consumer, Supplier<List<Integer>> supplier) {
		consumer.accept(supplier.get().get(0),supplier.get().get(1));

	}

	/*
	 * public Integer get() { // TODO Auto-generated method stub return 10; }
	 * 
	 * public void accept(Integer t) { // TODO Auto-generated method stub
	 * System.out.println(t); }
	 */

}
