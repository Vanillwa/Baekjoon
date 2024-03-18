import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cnt1 = Integer.parseInt(br.readLine());
		int[] num1 = new int[cnt1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = 0;
		while (st.hasMoreTokens())
			num1[n++] = Integer.parseInt(st.nextToken());

		int cnt2 = Integer.parseInt(br.readLine());
		int[] num2 = new int[cnt2];
		st = new StringTokenizer(br.readLine());
		n = 0;
		while (st.hasMoreTokens())
			num2[n++] = Integer.parseInt(st.nextToken());

		loop1: for (int i = 0; i < cnt2; i++) {
			for (int j = 0; j < cnt1; j++) {
				if (num2[i] == num1[j]) {
					bw.write("1\n");
					continue loop1;
				}
			}
			bw.write("0\n");
		}
		bw.flush();
	}
}