package programmers.lv2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class _42577_전화번호목록 {
	public static void main(String[] args) {
		
		String[] phone_book = {"12","123","1235","567","88"};
		
		System.out.println(solution(phone_book));
		
	}
	
	public static boolean solution(String[] phone_book) {

		boolean answer =true;
		
		//1. 처음 숫자의 길이를 알고
		//2. 포문을 돌면서 자기랑 같으면 통과하고
		//3. 같은 길이가 있으면 false, 안포함하면 true
		HashMap<String, String> map = new HashMap<>();
		for(String p : phone_book) map.put(p, p);
		for(String p : phone_book) {
			for(int i=0;i<p.length();i++) {
				if(map.containsKey(p.substring(0,i)))
					return false;
			}
		}
		
		
		return answer;
		
		
	}

}
