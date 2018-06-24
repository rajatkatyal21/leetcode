package leetcode;

public class MountainPeak {

	public static int peakIndexInMountainArray(int[] A) {
		int peakIndex = 0;
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] < A[i + 1]) {
				peakIndex = i + 1;
			}
		}
		return peakIndex;
	}

	public static void main(String[] args) {
		int A[] = {0, 10, 5, 2};
		System.out.println(peakIndexInMountainArray(A));
	}
}
