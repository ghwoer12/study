package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _5215_햄버거다이어트 {
	static int N, L; //재료의 수, 제한 칼로리
	static int[] tas, kal; //재료의 맛점수, 칼로리
	static boolean[] check;
	static int ful, f_kal; //음식 맛점수, 칼로리
	static int res; // 최고의 맛점수를 내자!
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N =Integer.parseInt(st.nextToken()); //재료의수
			L = Integer.parseInt(st.nextToken()); //제한 칼로리
			tas = new int[N]; //재료의 맛 점수
			kal = new int[N]; //재료의 칼로리
			check = new boolean[N]; 
			for(int i=0;i<N;i++) {
				st= new StringTokenizer(br.readLine());
				tas[i] = Integer.parseInt(st.nextToken());
				kal[i] = Integer.parseInt(st.nextToken());
			}
			res =0;
			powerSet(0);
			
			System.out.println("#"+t+" "+res);
		}
	}
	
	static void powerSet(int idx) {
		if(idx == N) {
			int sum_tas = 0;
			int sum_kal = 0;
			for(int i=0;i<N;i++) {
				if(check[i]) {
					sum_tas += tas[i];
					sum_kal += kal[i];
				}
			}
			if(sum_kal<L)
				res = Math.max(sum_tas, res);
			return;
		}
		check[idx] = true;
		powerSet(idx+1);
		check[idx] = false;
		powerSet(idx+1);
	}

}
