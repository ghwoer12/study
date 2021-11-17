package basic;

public class 부분집합 {
	static int[] arr = {1,3,5};
	static boolean[] sel = new boolean[3];
	
	public static void main(String[] args) {
		powerSet(0);
	}
	
	static void powerSet(int idx) {
		if(idx == arr.length) {
			//모든 원소들 중에서 골라진거만 출력 
			for(int i=0;i<arr.length;i++) {
				if(sel[i]) {
					System.out.print(arr[i]+" ");
				}
			}
			System.out.println();
			return;
		}
		//idx번째 원소를 고른걸로 체크해두고 다음 원소로 이동
		sel[idx] = true;
		powerSet(idx+1);
		//idx번째 원소를 안고른걸로 체크해두고 다음 원소로 이동
		sel[idx] = false;
		powerSet(idx+1);
		
	}
}
