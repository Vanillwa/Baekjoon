import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 1;
		for (int i = 0; i < 3; i++)
			num *= Integer.parseInt(br.readLine());

		char[] str = String.valueOf(num).toCharArray();

		int[] count = new int[10];
		for (char c : str)
			count[Character.getNumericValue(c)]++;
		for (int i : count)
			System.out.println(i);
	}
}