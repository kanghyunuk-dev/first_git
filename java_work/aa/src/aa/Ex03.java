package aa;

public class Ex03 {
	public static int solution(int[] array) {
		
		int[] realArr = new int[array.length];
		int[] cnArr = new int[array.length];
		int[] cntArr = new int[];
		
		// 시작하기전에 realArr 에 있는건 비교조차 안해야됨
		int rcnt = 0;
		for(int i = 0, count = 0; i < realArr.length; i++) {
			for(int j=0; j < realArr.length; j++) {
				if(array[i] == realArr[j]) {
					System.out.println("i 가 넘어가야함");
					count++;
				}
			}
			if(count == 0) {
				realArr[rcnt++] = array[i];
			}
			System.out.println(realArr[i]);
			System.out.println(cnArr[i]);
		}
		
		for(int i = 0; i < realArr.length; i++) {
			int count = 0;
			for (int j = 0; j < realArr.length; j++) {
				if(realArr[i] == array[j]) {
					count++;
				}
			}
			cntArr[rcnt++] = count-1;
			System.out.println(realArr[i]);
		}
		int max = cntArr[0];
		for (int i=1; i<cntArr.length; i++) {
			if(max < cntArr[i])
				max = cntArr[i];
		}
		System.out.println(max);
		
		for(int i = 0; i<cntArr.length; i++) {
			
			if(cntArr[0]==cntArr[i]) {
				max = -1;
			}
		}
		
		return max;
		
		int answer = 0;
		return answer;
	}
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 3, 3, 4};
		int arr2[] = {1, 1, 2, 2};
		int arr3[] = {1};
		
		int result = solution(arr1);
		System.out.println("result = " + result);
//		solution(arr2);
//		solution(arr3);
	}
}
