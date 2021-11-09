
public class CH07_Decreasing {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 4, 5, 7};
		int[] arr2 = {5, 2, 3, 9, 9};
		int[] arr3 = {15, 13, 12, 9, 4};
		int[] arr4 = {28, 23, 13, 12, 2};
		int[] arr5 = {33, 44, 22, 55, 11};
		
		System.out.println("Array1 (1,2,4,5,7) is not in decreasing order, should be FALSE: "
				+ isStrictlyDecreasing(arr1));
		System.out.println("Array1 (5,2,3,9,9) is not in decreasing order, should be FALSE: "
				+ isStrictlyDecreasing(arr2));
		System.out.println("Array1 (15,13,12,9,4) is not in decreasing order, should be TRUE: "
				+ isStrictlyDecreasing(arr3));
		System.out.println("Array1 (28,23,13,12,2) is not in decreasing order, should be TRUE: "
				+ isStrictlyDecreasing(arr4));
		System.out.println("Array1 (33,44,22,55,11) is not in decreasing order, should be FALSE: "
				+ isStrictlyDecreasing(arr5));
	}
	public static boolean isStrictlyDecreasing(int[] dc) {
		boolean result = true;
		for(int i=0; i<dc.length-1; i++) {
			if(dc[i]<dc[i+1]){
				result = false;
				break;
			}
		}
		return result;
	}

}
