package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*1. 벽을 3개를 세우고 바이러스를 퍼트린 후 감연안된곳을 카운트
 * 2. 벽3개를 세울때 재귀를 써서 3개를 차례로 선택하면서 세우면 된다!
 * 3. 그리고 맥스값 찾아주지! 
 * 바이러스 퍼트릴 떄는 주변에 감염되니까 queue써서 사방으로 퍼트버려!
 * brute force? 
 * 
 * */
public class _14502_연구소 {
	
	static int N,M;
	static int[][] map, virus;
	static int[] r = {-1, 0, 1, 0};
	static int[] c = {0, -1, 0, 1};
	
	static int res =0;
	
	static Queue<int[]> queue = new LinkedList<>();
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				map[i][j]= Integer.parseInt(st.nextToken());
			}
		}
		
		
		DFS(0);
		
		System.out.println(res);
		
		
	}
	
	public static void DFS(int depth) {
		if(depth==3) {
			//벽 세개 다세웠다
			BFS();
			return;
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(map[i][j]==0) {
					map[i][j]=1;
					DFS(depth+1);
					map[i][j]=0;
				}
			}
		}
		
	}
	
	public static void BFS() {
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(map[i][j]==2) {
					queue.add(new int[] {i, j});
				}
			}
		}
		
		int cnt = 0;
		
		virus = new int[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				virus[i][j] = map[i][j];
			}
		}
		
		
		while(!queue.isEmpty()) {
			int[] que = queue.poll();
			
			for(int i=0;i<4;i++) {
				int que_x = que[0]+r[i];
				int que_y = que[1]+c[i];
				
				if(que_x<0||que_y<0||que_x>=N||que_y>=M) continue;
				if(virus[que_x][que_y]!=0)continue;
				
				virus[que_x][que_y]=2;
				queue.add(new int[] {que_x,que_y});
					
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(virus[i][j]==0)cnt++;
			}
		}
		res = Math.max(res, cnt);
	}
}
