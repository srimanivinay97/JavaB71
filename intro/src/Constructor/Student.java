package Constructor;


class Exam{
	Exam(){
		IO.println("exam class");
	}
	Exam(int a){
		IO.println(a);
		this();
	}
	public static void main(String[] args) {
		IO.println("exam main method");
	}
}


 class Student extends Exam{
	int id;
	String name;
	int age;
	int batch;
	Student(){
		IO.println("Student class");
		super(5);
	}
	public static void main(String[] args) {
		Student s=new Student();
IO.println("student main method");
	}

}
