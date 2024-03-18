import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num + 1];
		List<Integer> route;
		arr[1]=0;
		for (int i = 2; i <= num; i++) {
			route = new ArrayList<Integer>();
			if(i%3==0)
				route.add(arr[i/3]);
			if(i%2==0)
				route.add(arr[i/2]);
			route.add(arr[i-1]);
			
			arr[i]=Collections.min(route)+1;
		}
		bw.write(String.valueOf(arr[num]));
		bw.flush();
		br.close();
	}
}