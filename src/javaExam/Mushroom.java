/**
 * 
 */

package javaExam;

import java.util.Scanner;

/**
 * 
 * 
 * @author nandi
 * 2015Äê12ÔÂ23ÈÕ
 * Mushroom.java
 */
public class Mushroom {
	
	private static int[][] matrix;
	
	private static int N;
	
	private static int M;
	
	private static int K;
	
	private static int max;
	
	public static void gaming() {
		
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		M = s.nextInt();
		matrix = new int[N][M];
		K = s.nextInt();
		
		for (int i = 0; i < K; i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			matrix[x - 1][y - 1]++;
		}
		s.close();
		
		max = 0;
		
		for (int i = 0; i <= N - 3; i++) {
			for (int j = 0; j <= M - 3; j++) {
				int sum = 0;
				for (int k = 0; k < 3; k++) {
					for (int k2 = 0; k2 < 3; k2++) {
						sum = sum + matrix[i + k][j + k2];
					}
				}
				if (max < sum) {
					max = sum;
				}
			}
		}
		
	}
	
	public static void printMatrix() {
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		
		gaming();
		printMatrix();
	}
}
