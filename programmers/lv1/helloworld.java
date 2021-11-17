package programmers.lv1;

import java.util.*;

public class helloworld {
	public static void main(String[] args) {
		

		int[] numbers= {1, 1, 1, 1, 1};
		int target = 3;
		
		int answer = 0;
		
		answer=dfs(numbers, target, 0, 0);
		
		System.out.println(answer);
	}
	
	public static int dfs(int[] numbers, int target, int index, int num) {
		if(index==numbers.length)
			return num==target?1:0;
		else {
			return dfs(numbers, target, index+1, num+numbers[index])+
					dfs(numbers, target, index+1, num-numbers[index]);
		}
	}
}
