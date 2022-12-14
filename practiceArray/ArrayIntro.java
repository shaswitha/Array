package practiceArray;

public class ArrayIntro {

	public static void main(String[] args) {

		String course = "html";
		String[] courses = new String[3];
		courses[0] = "java";
		courses[1] = "sql";
		courses[2] = "spring";
		System.out.println(course);
		System.out.println(courses[0]);
		System.out.println(courses[1]);
		System.out.println(courses[2]);

		for (String x : courses) {
			System.out.println(x);
		}
	}
}
