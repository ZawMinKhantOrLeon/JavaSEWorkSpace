package object_class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student(1L,"MgMg","Civil",24);
		Student student2 = new Student(1L,"MgMg","Civil",24);
		Student student3= student;
		System.out.println(student); // student.toString();
		System.out.println(student.toString());
		System.out.println(student.getClass().getName());
		System.out.println(student.hashCode());
		System.out.println("s1==s2 : " + student.equals(student2));
		System.out.println("s1==s3 : " + student.equals(student3));
	}

}
