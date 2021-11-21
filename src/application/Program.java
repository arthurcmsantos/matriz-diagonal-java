package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Integer n = scanner.nextInt();
		Integer[][] mat = new Integer[n][n];
		
		for (Integer i = 0; i < mat.length; i++) {
			for (Integer j = 0; j < n; j++) {
				mat[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Diagoal principal:");
		for(Integer i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		Integer count = 0;
		for (Integer i = 0; i < mat.length; i++) {
			for (Integer j = 0; j < n; j++) {
				if(mat[i][j] < 0) {
				count++;
				}
			}
		}
		
		System.out.println("Numeros negativos: " + count);
		
		scanner.close();
	}

}
