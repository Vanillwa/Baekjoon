import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = "";

		StringBuilder sb;

		while (true) {
			str = br.readLine();
			sb = new StringBuilder(str);
			if (str.equals("0"))
				break;
			if (str.equals(sb.reverse().toString()))
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}