package org.naveen.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class BaseWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Naveen");

		BaseWithLambda base = new BaseWithLambda();
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);

		base.m1((number,number1)->System.out.println(number+number1), () -> al);

	}

	public void m1(BiConsumer<Integer,Integer> consumer, Supplier<List<Integer>> supplier) {
		consumer.accept(supplier.get().get(0),supplier.get().get(1));

	}

}
