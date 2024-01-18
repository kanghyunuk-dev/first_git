package chapter05;
class ArrayEx3{
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		// for 구문으로 arr 입력
		for(int i=0; i < arr.length;i++) 
			arr[i] = i + 1;

		System.out.println("������ - arr.length:"+arr.length);
		
		// for 구문으로 arr 출력
		for(int i=0; i < arr.length;i++) 
			System.out.println("arr["+i+"]:"+arr[i]);	
		
		// tmp 배열 선언... 5*2 길이 10
		int[] tmp = new int[arr.length*2];
		
		// 입력
		for(int i=0; i < arr.length;i++) 
			tmp[i] = arr[i];

		arr = tmp;

		System.out.println("������ - arr.length:"+arr.length);	
		for(int i=0; i < arr.length;i++) 
			System.out.println("arr["+i+"]:"+arr[i]);	
	}
}
