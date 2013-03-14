package com.pattern.singleton.test;

import com.pattern.factory.entity.Pension;
import com.pattern.singleton.solution.PensionSimpleSingletonFactory;

public class SingletonTest {

	public static void main(String[] args) {
		PensionSimpleSingletonFactory simpleFactory = PensionSimpleSingletonFactory
				.getInstance();
		Pension createdPension = simpleFactory.createPension("OP");
		System.out.println("Calculated Pension for " + createdPension
				+ " is ==> " + createdPension.calculatePension());

		Runnable worker1 = new ThreadWorker();
		Runnable worker2 = new ThreadWorker();
		System.out.println("ID1: " + System.identityHashCode(worker1));
		new Thread(worker1).start();
		System.out.println("ID2: " + System.identityHashCode(worker2));
		new Thread(worker2).start();

		String hello = "hello", world = "world";
		String test = hello + world;
		test.intern();
		System.out.println(test.equals("helloworld"));
	}
}

class ThreadWorker implements Runnable {

	@Override
	public void run() {
		PensionSimpleSingletonFactory simpleFactory = PensionSimpleSingletonFactory
				.getInstance();
		Pension createdPension = simpleFactory.createPension("DP");
		System.out.println("SingletonID:"
				+ System.identityHashCode(simpleFactory)
				+ " :: Calculated Pension for " + createdPension
				+ " is ==> " + createdPension.calculatePension());
	}

}