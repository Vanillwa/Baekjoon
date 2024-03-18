import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		int[] n = new int[count];
		
		for (int i = 0; i < count; i++)
			n[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(n);
		
		for (int i = 0; i < count; i++)
			bw.write(n[i] + "\n");
		bw.flush();
	}
}