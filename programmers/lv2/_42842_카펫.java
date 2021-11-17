package programmers.lv2;

public class _42842_카펫 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solution(8,1));

	}
	
	public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int to = brown + yellow;
        
        for (int i=1;i<to/2;i++) {
        	if(to%i==0) {
        		int heigth = to/i;
        		int width = i; //width >= height
        		if((heigth-2)*(width-2)==yellow) {
        			answer[0]=Math.max(width, heigth);
        			answer[1]= Math.min(width, heigth);
        		}
        	}
        }
        
        
        //더해서 값에 나눠떨어지는걸봐
        // 몫이랑 나머지를 봐
        //        
        //하나씩 나눠보고 거기서 가로세로 -2 해서 곱한수가 yellow여야해
        
        System.out.println(answer[0]+" : "+answer[1]);
        
        return answer;
    }

}
