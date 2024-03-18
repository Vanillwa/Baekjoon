import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = Integer.parseInt(br.readLine());
		int num;
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < cnt; i++) {
			num = Integer.parseInt(br.readLine());
			if(num==0)
				stack.pop();
			else
				stack.push(num);
		}
		
		int sum=0;
		for(int i:stack)
			sum+=i;
		
		System.out.println(sum);
	}
}