package basic;

import java.util.Arrays;

public class 조합 {
	//숫자중 갯수만큼으로 만드는거
	static int N = 3;
	static int[] arr = {1,2,3};
	static int R =2;
	static int[] sel = new int[2];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		comb(0,0);

	}
	
	static void comb(int idx, int s_idx) {
		if(s_idx==R) {
			System.out.println(Arrays.toString(sel));
			return;
		}
		if(idx==N) {
			return;
		}
		int[] a= new int[3];
		a[0] = 10;
		//위에 화살표 위치의 숫자를 아래 화살표 위치에 담는다
		sel[s_idx]= arr[idx];
		//위에 화살표 +1, 아래 화살표 +1로 다음 상태 호출
		comb(idx+1, s_idx+1);
		//위에 화살표 +1, 아래 화살표 그대로로 다음 상태 호출
		comb(idx+1, s_idx);
	}

}
