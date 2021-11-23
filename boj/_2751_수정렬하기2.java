package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class _2751_수정렬하기2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0;i<N;i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(arr);
		
//		for(int a:arr) {
//			System.out.println(a);
//		} // 왕 얘는 시간 초과났는데 빌더로 하니까 통과했어 우와!!!
		
		StringBuilder sb = new StringBuilder();
		for(int a:arr) {
			sb.append(a+"\n");
		}
		System.out.println(sb);
	}

}
