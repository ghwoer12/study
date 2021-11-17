package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _14503_로봇청소기 {

	static int[] r = { -1, 0, 1, 0 };
	static int[] c = { 0, 1, 0, -1 };

	static char[][] map;
	static int N, M, cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new char[N][M];

		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {
			map[i] = br.readLine().toCharArray();
		}

		// 1. 현재위치를 청소한다.
		// 2. 청소하고 난 다음에 왼쪽방향 칸을 탐색
		// 3. 왼쪽 방향이 청소 되어있으면 다시 왼쪽으로 한번 더 돌아
		// 4. 네 방향 다 청소 or 벽이면 지금 바라보는 방향을 유지한채로 한칸 후진하고 2번 다시 ㄱㄱ
		// 5. 네 방향 다 청소 or 벽 + 뒤쪽 방향이 벽이라 후진이 안돼 그럼 멈춰

		// 1.
		cnt = 0;

		clean(x, y, d);
		
		if (map[x][y] == '0') {
			map[x][y] = '2';
			cnt++;
		}
		
		while (true) {
			for (int i = 0; i < 4; i++) {
				d= (d + 3) % 4;
				int nx = x+ r[d];
				int ny = y + c[d];
				if (nx < 0 || ny < 0 || nx >= N || ny >= M || map[nx][ny] != '0') {
					continue;
				}

				cnt++;
				map[nx][ny] = (char) cnt;
				x = nx;
				y = ny;
				break;
			}

			if (!isAvailableCleaning(robotX, robotY)) {
				if (room[robotX + (dx[robotDir] * (-1))][robotY + (dy[robotDir] * (-1))] != 1) {
					robotX = robotX + (dx[robotDir] * (-1));
					robotY = robotY + (dy[robotDir] * (-1));
				} else {
					break;
				}
			}
		}
		System.out.println(result);
		
		
		

	}

	static void clean(int x, int y, int d) {

		// 현재 위치 청소
		if (map[x][y] == '0') {
			map[x][y] = '2';
			cnt++;
		}
		
		
		
		
	}

}
