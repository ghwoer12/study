package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class _2750_수정렬하기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0;i<N;i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		
//		Arrays.sort(arr); //int 배열일때
		Collections.sort(arr); //arraylist일때 정렬
		
//		StringBuilder sb = new StringBuilder(); // 메모리는 좀 사용하지만 시간은 빠룸!
//		for(int a:arr) {
//			sb.append(a+"\n");
//		} 
//		System.out.println(sb); // 16120KB 164ms
		for(int a : arr) { //메모리는 덜 먹지만 시간이 오래걸리네
			System.out.println(a); // 14952KB 172ms
		} 
	}

}
