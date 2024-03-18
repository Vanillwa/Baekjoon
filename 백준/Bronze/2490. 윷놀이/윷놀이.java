import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i = 1; i <= 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int check = 0;
			for (int j = 1; j <= 4; j++) {
				if (Integer.parseInt(st.nextToken()) == 0)
					check++;
			}
			switch (check) {
			case 0:
				bw.append("E\n");
				break;
			case 1:
				bw.append("A\n");
				break;
			case 2:
				bw.append("B\n");
				break;
			case 3:
				bw.append("C\n");
				break;
			case 4:
				bw.append("D\n");
				break;
			}
		}
		bw.flush();
	}
}