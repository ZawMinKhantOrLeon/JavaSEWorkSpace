package object_class;

public class Student {
	
	private Long id;
	private String name;
	private String major;
	private Integer age;
	
	public Student() {
		
	}

	public Student(Long id, String name, String major, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", major=" + major + ", age=" + age + "]";
	}
	
	
}
