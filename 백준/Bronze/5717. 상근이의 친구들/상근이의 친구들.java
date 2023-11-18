import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		List<Integer> list = new ArrayList<Integer>();
		while (true) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a==0&&b==0)
				break;
			list.add(a+b);
		}
		list.forEach(System.out::println);
		sc.close();
	}
}