import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		loop1 :
		for (int i = a; i <= b; i++) {
			if(i==1)
				continue;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					continue loop1;
				}
			}
			bw.write(i+"\n");
		}
		bw.flush();
	}
}