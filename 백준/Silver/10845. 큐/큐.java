import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Deque<Integer> deque = new ArrayDeque<Integer>();

		int cnt = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			String func = st.nextToken();
			
			switch(func) {
			case "push":
				deque.addLast(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if(deque.isEmpty())
					System.out.println(-1);
				else 
					System.out.println(deque.pollFirst());
				break;
			case "size":
				System.out.println(deque.size());
				break;
			case "empty":
				if(deque.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				break;
			case "front":
				if(deque.isEmpty())
					System.out.println(-1);
				else
					System.out.println(deque.peekFirst());
				break;
			case "back":
				if(deque.isEmpty())
					System.out.println(-1);
				else
					System.out.println(deque.peekLast());
				break;
			}
		}
	}
}