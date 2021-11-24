package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//for 문으로 풀면 시간이 더 빠르네 
//메모리 : 18760KB , 시간 412ms
public class _10828_스택 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
				case "push" : 
					int a= Integer.parseInt(st.nextToken());
					stack.push(a);
					break;
				case "pop": 
					int temp=-1;
					if(!stack.isEmpty())
						temp = stack.pop();
					System.out.println(temp);
					break;
				case "size": 
					System.out.println(stack.size());
					break;
				case "empty" : 
					int we = 1;
					if(!stack.isEmpty())
						we = 0;
					System.out.println(we);
					break;
				case "top" : 
					int top = -1;
					if(!stack.isEmpty())
						top = stack.peek();
					System.out.println(top);
					break;
				}
			}
		}
		
	}


