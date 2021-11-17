package basic;

import java.util.Arrays;

public class 순열 {

	static int N = 3;
	static int[] arr = {1,3,5};
	static int[] sel = new int[3];
	static boolean[] check = new boolean[3];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perm(0);
		

	}
	
	static void perm(int idx) {
		if(idx == N) {
			System.out.println(Arrays.toString(sel));
			return;
		}
		for(int i=0;i<N;i++) {
			if(!check[i]) {
				check[i] = true; //고른걸로 체크해두고
				sel[idx] = arr[i];
				perm(idx +1);
				check[i] = false;//다시돌아왔을땐 체크 해제
			}
		}
	}

}
