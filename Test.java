package lab9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {

		Student st1 = new Student("001", "Nguyen Van A", 2004);
		Student st2 = new Student("002", "Tran Thi B", 2006);
		Student st3 = new Student("003", "Ly Van C", 2004);

		List<Student> students1 = new ArrayList<>();
		students1.add(st1);
		students1.add(st2);
		students1.add(st3);

		List<Student> students2 = new ArrayList<>();
		students2.add(st2);
		students2.add(st3);

		Course course1 = new Course("01", "Cau truc du lieu", "TH", students1, "Thay Du");
		Course course2 = new Course("02", "Lap trinh nang cao", "LT", students2, "Thay Du");

		List<Course> courses = new ArrayList<>();
		courses.add(course1);
		courses.add(course2);

		Faculty f1 = new Faculty("CNTT", "Dai hoc Nong Lam", courses);

		// Method getMaxPracticalCourse
		Course course = f1.getMaxPracticalCourse();
		System.out.println("Max Practical Course: " + course);

		// Method groupStudentsByYear
		Map<Integer, List<Student>> map = f1.groupStudentByYear();
		System.out.println("Group student by year: " + map);

		// Method filterCourses
		Set<Course> set = f1.filterCourses("TH");
		System.out.println("Filter courses by type: " + set);
	}
}
