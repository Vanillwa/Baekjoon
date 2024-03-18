import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = new String[5];

		for (int i = 0; i < 5; i++)
			str[i] = br.readLine();

		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if(i>=str[j].length())
					continue;
				sb.append(str[j].charAt(i));
			}
		}
		System.out.println(sb);
	}
}