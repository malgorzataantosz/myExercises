package exercise;

public class BinaryGap {

	public static int solution(int A) {
		String binary = Integer.toBinaryString(A);
		int i = binary.length() - 1;
		while (binary.charAt(i) == '0') {
			i--;
		}
		int gap = 0;
		int max = 0;
		for (; i >= 0; i--) {
			if (binary.charAt(i) == '1') {
				max = Math.max(max, gap);
				gap = 0;
			} else {
				gap++;
			}
		}
		return max > 0 ? max : -1;
	}

	public static void main(String[] args) {
		System.out.println(solution(1000100100));

	}

}
