package programmers.lv2;

import java.util.*;

public class _42746_가장큰수 {
	static int[] sel;
	static boolean[] check;
	static long max =0;

	
	public static String solution(int[] numbers) {
//		sel = new int[numbers.length];
//		check = new boolean[numbers.length];
//		
//		perm(0, numbers);
//		return Long.toString(max);
		String answer ="";
		String[] list = new String[numbers.length];
		for(int i=0;i<numbers.length;i++) {
			list[i] = Integer.toString(numbers[i]);
		}
		
		Arrays.sort(list,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return ((o2+o1).compareTo(o1+o2));
			}
		});
		
		for(String s : list) {
			answer += s;
		}
		if(answer.charAt(0)=='0') {
			return "0";
		}
		
		
		return answer;
		
		
	}
	static void perm(int idx, int[] numbers) {
		if(idx==numbers.length) {
			String line ="";
			for(int i=0;i<numbers.length;i++) {
				line += Long.toString(sel[i]);
			}
			long num = Long.parseLong(line);
			max = Math.max(num, max);
			return;
		}
		for(int i=0;i<numbers.length;i++) {
			if(!check[i]) {
				check[i] = true;
				sel[idx] = numbers[i];
				perm(idx+1, numbers);
				check[i] = false;
			}
		}
	}
	public static void main(String[] args) {
		
		int[] numbers = {3, 30, 34, 5, 9};
		
		System.out.println(solution(numbers));
		
	}
	

}
