import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int len = Integer.parseInt(br.readLine());
		String str = br.readLine();

		if (len % 2 != 0) {
			StringBuilder sb = new StringBuilder(str);
			sb.deleteCharAt(len / 2);
			str = sb.toString();
		}

		String check = "Yes";
		int[] atoz = new int[26];
		for (int i = 0; i < str.length(); i++) {
			atoz[str.charAt(i) - 97]++;
		}
		for (int i : atoz) {
			if (i % 2 != 0)
				check = "No";
		}
		System.out.println(check);
	}
}