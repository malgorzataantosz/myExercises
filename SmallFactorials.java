package exercise;

import java.util.*;
import java.lang.*;
import java.math.BigInteger;
class Main {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			System.out.println(factorial(a));
		}
	}
	public static BigInteger factorial(int a) {
	BigInteger answer = BigInteger.ONE;
		for (; a>1; a--) {
			answer = answer.multiply(BigInteger.valueOf(a));
		}
		return answer;
	}
}