package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

 //메모리 : 383792KB , 시간 : 1812ms
public class _10989_수정렬하기3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];
		for(int i=0;i<N;i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<arr.length;i++) {
			while(arr[i]>0) {
				sb.append(i+"\n");
				arr[i]--;
			}
		}
		System.out.println(sb);
	}
		
}
/*
 * Arrays.sort : Dual-Pivot Quick Sort를 사용!
 * 평균 O(nlogn)의 시간복잡도를 가지지만 최악일때는 O(n제곱)을 가질수 있다는 점!
 * 카운팅 정렬 : 시간복잡도 O(N+K) K는 자릿수 -> 데이터가 많을수록 O(N)에 가깝!
 * 
 */
