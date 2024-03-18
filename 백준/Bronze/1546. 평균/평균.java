import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		double[] score = new double[count];
		double maxScore = 0;
		double sum = 0;
		for (int i = 0; i < count; i++) {
			score[i] = sc.nextInt();
			if (score[i] > maxScore)
				maxScore = score[i];
		}

		for (int i = 0; i < count; i++) {
			score[i] = score[i] / maxScore * 100;
			sum += score[i];
		}

		System.out.printf("%f\n", sum / count);
		sc.close();
	}
}
