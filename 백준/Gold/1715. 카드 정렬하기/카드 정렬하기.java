import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < n; i++)
			pq.add(Integer.parseInt(br.readLine()));
		int temp = 0;
		int sum = 0;
		for (int i = 0; i < n-1; i++) {
			temp = pq.poll() + pq.poll();
			pq.add(temp);
			sum += temp;
		}
		System.out.println(sum);
	}
}