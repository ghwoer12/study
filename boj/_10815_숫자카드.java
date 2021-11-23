package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.StringTokenizer;

//메모리 126712KB , 시간 : 1300ms 
public class _10815_숫자카드 {
	static int N, M;
	static ArrayList<Integer> arr, comp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(arr);
		M = Integer.parseInt(br.readLine());
		comp = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<M;i++) {
			comp.add(Integer.parseInt(st.nextToken()));
		}
		
		StringBuilder sb = new StringBuilder();
		Iterator<Integer> ite = comp.iterator();
		while(ite.hasNext()) {
			if(BS(ite.next())>=0)
				sb.append(1+" ");
			else
				sb.append(0+" ");
				
		}
		System.out.println(sb);
	}
	static int BS(int n) {
		int high = N-1;
		int low =0;
		
		while(low<=high) {
			int mid = (high+low)/2;
			if(n<arr.get(mid)) {
				high = mid-1;
			}else if(n>arr.get(mid))
				low = mid+1;
			else
				return mid;
		}
		return -1;
	}
}
