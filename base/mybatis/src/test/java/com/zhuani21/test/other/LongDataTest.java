package com.zhuani21.test.other;

public class LongDataTest {

	public static void main(String[] args) {
//		test1();
		test2();
		System.out.println(Integer.MAX_VALUE + "-" + Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE + "-" + Long.MIN_VALUE);
	}

	private static void test1() {
		Long a = 5L;
		Long b = 5L;

		System.out.println("a == b ? " + (a == b));

		Long c = 129L;
		Long d = 129L;
		System.out.println("c == d ? " + (c == d));
	}
	private static void test2() {
		long a = 5L;
		long b = 5L;

		System.out.println("a == b ? " + (a == b));

		long c = 129L;
		long d = 129L;
		System.out.println("c == d ? " + (c == d));
	}

}
