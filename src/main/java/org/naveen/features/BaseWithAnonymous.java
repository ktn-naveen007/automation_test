package org.naveen.features;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class BaseWithAnonymous {

	/*
	 * public void m1(int i) { System.out.println("m1 called" + i); }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Naveen");

		BaseWithAnonymous base = new BaseWithAnonymous();
		// base.m1(1);

		base.m1(new Consumer<Integer>() {

			public void accept(Integer t) {
				System.out.println("Number is " + t);
			}

		}, new Supplier<Integer>() {

			public Integer get() {

				return 10;
			}

		});

	}

	public void m1(Consumer<Integer> consumer, Supplier<Integer> supplier) {
		consumer.accept(supplier.get());

	}

	/*
	 * public Integer get() { // TODO Auto-generated method stub return 10; }
	 * 
	 * public void accept(Integer t) { // TODO Auto-generated method stub
	 * System.out.println(t); }
	 */

}
