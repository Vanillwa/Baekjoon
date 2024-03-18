import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] replace = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		
		String str = br.readLine();
		for (String s : replace) {
			str = str.replace(s, "a");
		}

		System.out.println(str.length());
	}
}