package Assignment;

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String city;
    private double marks;

    public Student(int id, String name, String city, double marks) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.marks = marks;
    }

   

    @Override
    public int compareTo(Student s) {
        int diff = this.city.compareTo(s.city);
        if (diff == 0) {
            diff = -Double.compare(this.marks, s.marks);
            if (diff == 0) {
                diff = this.name.compareTo(s.name);
            }
        }
        return diff;
    }

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

    
    }


public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        arr[0] = new Student(2, "s", "d", 3.2);
        arr[1] = new Student(3, "f", "s", 3.4);
        arr[2] = new Student(2, "x", "g", 3.0);

        // Sorting using natural ordering (implements Comparable interface)
        Arrays.sort(arr);

        for (Student ele : arr) {
            System.out.println(ele);
        }
    }
}
