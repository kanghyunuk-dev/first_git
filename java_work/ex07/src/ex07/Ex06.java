package ex07;

public class Ex06 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50};
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		int sum = 0;
		for(int temp: arr) {
			System.out.println(temp);
			sum = sum + temp;
		}
		System.out.println(sum);
		
		String[] arr1 = {"aa", "bb", "cc", "dd"};
		String sumstr = "";

		for(String temp : arr1) {
			System.out.println(temp);
			sumstr += temp;
		}
		
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.println(arr[i]);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
		}
	}
}
