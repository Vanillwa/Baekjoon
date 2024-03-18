import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static class Person {
		public int idx;
		public int age;
		public String name;

		public Person(int idx, int age, String name) {
			this.idx = idx;
			this.age = age;
			this.name = name;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		List<Person> list = new ArrayList<Main.Person>();
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			Person person = new Person(i, age, name);
			list.add(person);
		}

		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if (o1.age == o2.age) {
					return o1.idx - o2.idx;
				}
				return o1.age - o2.age;
			}
		});

		for (Person p : list) {
			bw.append(p.age + " " + p.name + "\n");
		}
		bw.flush();
	}
}