package scee.student;


public class Student implements Comparable<Student>{
	int no;
	String name;
	int age;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/*
	 * 생성자 field 만들었음.우클릭 - source - field 어쩌 
	 * */
	public Student(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);	
		}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[no=" + no + ", " + "name=" + name + ", age=" + age + "]";
		/*
		 * 출력 어떻게 할 건지 재정의
		 * */
	}

}
