package programmers.lv2;

public class _1835_단체사진찍기 {
	public static void main(String[] args) {
		int n = 2;
		String[] data = {"M~C<2", "C~M>1"};

		System.out.println(solution(n, data));

	}

	static char[] member = { 'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T' };
	static char[] arr = new char[8];
	static boolean[] check = new boolean[8];
	static int answer, num;
	static int N = 8;
	static String[] d;

	public static int solution(int n, String[] data) {
		answer = 0;	
		d = data;
		num = n;

		// 일단 멤버들을 8명. 베열을 만들고
		// 스펠 ~ 스펠 (=,>크다,<작다) 숫자
		// 조건에 맞는애들을 제거해

		perm(0);

		return answer;
	}

	public static void perm(int idx) {
		if (idx == N) {
			if (check())
				answer++;
		}
		for (int i = 0; i < N; i++) {
			if (!check[i]) {
				check[i] = true;
				arr[idx] = member[i];
				perm(idx + 1);
				check[i] = false;
			}
		}
	}

	public static boolean check() {
		int com1 = 0, com2=0;
		for (int i = 0; i < num; i++) {
			char[] temp = d[i].toCharArray();
			for(int j =0;j<8;j++) {
				//자리 조건있는 두사람 고르기
				if(temp[0]==arr[j]) com1 = j;
				if(temp[2]==arr[j]) com2 = j;
			}
			
			int res = temp[4] - '0' +1;
			
			if(temp[3]=='=') {
				if(Math.abs(com1-com2) != res) return false;
			}else if(temp[3]=='>') {
				if(Math.abs(com1-com2)<=res) return false;
			}else {
				if(Math.abs(com1-com2)>=res) return false;
			}
		}
		return true;
	}

}
