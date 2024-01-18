package ex10;

/*
 * 5*5 배열
 */

public class Ex01 {
	public static void doPrinArr(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 100)+1;
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println(arr[0][3]);	}
	public static void main(String[] args) {
		int[][] arr = new int[5][3];
		int[][] arr2 = new int[5][5];
		
		
		doPrinArr(arr);
	}
}
