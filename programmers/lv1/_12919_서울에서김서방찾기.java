package programmers.lv1;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class _12919_서울에서김서방찾기{
	static ArrayList<String> arr = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		while(true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String name = br.readLine();
			if(name.isEmpty())
				break;
			else {
				arr.add(name);
			}
		}
		
		System.out.println(arr);
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).equals("Kim")) {
				System.out.println("김서방은 "+i+"에 있다");
			}

		}
	}


}
