class Student{
String name="Haji";//literal
int age;
 int marks;

public Student(){
	System.out.println("deflut");
}

public Student(int age){
	this.age=age;
}

public void setMarks(int marks){
	this.marks=marks;
}


	public void shows(){
	System.out.println("name :"+name);
	System.out.println("age :"+age);
	System.out.println("marks :"+marks);
}


}