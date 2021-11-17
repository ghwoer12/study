package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1920_수찾기 {
	//메모리 : 45944KB , 시간 : 580ms
	
	static int N, M;
	static int[] arr, comp;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		comp = new int[M];
		for(int i=0;i<M;i++) {
			comp[i]= Integer.parseInt(st.nextToken());
		}
		
		
		StringBuilder sb = new StringBuilder();
//		for(int i=0;i<M;i++) {
//			if(BS(comp[i])>=0) {
//				sb.append(1+"\n");
//			}else {
//				sb.append(0+"\n");
//			}
//		}
		for(int i:comp) {
			if(BS(i)>=0)
				sb.append(1+"\n");
			else
				sb.append(0+"\n");
		}
		
		System.out.println(sb);
		


	}
	
	public static int BS(int key) {
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(key<arr[mid]) {
				high = mid-1;	
			}else if(key>arr[mid]) {
				low = mid+1;				
			}else {
				return mid;				
			}
		}
		return -1;
	}
	
	void arr2() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		int M = Integer.parseInt(br.readLine());
		ArrayList<Integer> comp = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			comp.add(Integer.parseInt(st.nextToken()));
		}
		
//		ArrayList<Integer> ans = new ArrayList<>();
		
		StringBuilder sb = new StringBuilder();
		for(int i:comp) {
			if(arr.contains(i))
				sb.append(1+"\n");
//				ans.add(1);
			else
//				ans.add(0);
				sb.append(0+"\n");
		}
		System.out.println(sb);
		
		
	}
	
	
	void arr1(int[] array) throws NumberFormatException, IOException {
		
		//코드 길이 1094B => 시간초과
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int M = Integer.parseInt(br.readLine());
		int[] comp = new int[M];
		int[] ans = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			comp[i] = Integer.parseInt(st.nextToken());
		}
		
		//arr 안에 있는 값들이 comp 안에있는지 있으면 1로 체크하는

		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(comp[i]==arr[j])
					ans[i]=1;
			}
		}
		
		
		for(int i=0;i<M;i++) {
			System.out.println(ans[i]);
		}
		return;
	}

}
