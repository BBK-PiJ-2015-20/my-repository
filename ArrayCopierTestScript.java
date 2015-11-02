public class ArrayCopierTestScript {
	public static void main(String[] args) {
		ArrayCopier copier = new ArrayCopier();
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {6,7,8,9};
		
		int count = 0;
		String result = "";
		copier.copy(array1,array2);
		while(count <= array2.length) {
			result = result + ", " + array2[count];
			count++;
		}
		System.out.println("Larger to smaller copy: " + result);
		
		int[] array3 = {1,2,3,4};
		int[] array4 = {5,6,7,8,9};
		count = 0;
		result = "";
		copier.copy(array3,array4);
		while(count <= array4.length) {
			result = result + ", " + array4[count];
			count++;
		}
		System.out.println("Smaller to larger copy: " + result);
		
		int[] array5 = {1,2,3,4,5};
		int[] array6 = {6,7,8,9,0};
		count = 0;
		result = "";
		copier.copy(array5,array6);
		while(count <= array6.length) {
			result = result + ", " + array6[count];
			count++;
		}
		System.out.println("Same size result: " + result);
	}
}