package boj;

import java.io.*;
import java.util.StringTokenizer;

public class _2004_조합0의개수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int head = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		

		long twoCnt = cnt(head,2) - cnt(down,2) - cnt(head-down,2);
		long fiveCnt = cnt(head,5) - cnt(down,5) - cnt(head-down, 5);
		
		System.out.println(Math.min(twoCnt, fiveCnt));
		
	}
	
	public static long cnt(int n, int a) {
		long count =0;
		
		while(n>=a) {
			count += n/a;
			n /=a;
		}
		return count;
	}

}
