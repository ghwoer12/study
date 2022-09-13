package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _10845_큐 {
	
	// 메모리 18888KB, 시간 368ms 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
			
			case "push" :
				queue.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop" : 
				int np = -1;
				if(!queue.isEmpty())
					np = queue.poll();
				System.out.println(np);
				break;
			case "size":
				System.out.println(queue.size());
				break;
			case "empty":
				int ne = 1;
				if(!queue.isEmpty())
					ne = 0;
				System.out.println(ne);
				break;
			case "front":
				int nf = -1;
				if(!queue.isEmpty())
					nf = queue.peek();
				System.out.println(nf);
				break;
			case "back":
				int nb  = -1;
				if(!queue.isEmpty()) {
					for(int a : queue) {
						nb = a;
					}
				}
				System.out.println(nb);
				break;
				
			
			}
		}
		
	}

}
