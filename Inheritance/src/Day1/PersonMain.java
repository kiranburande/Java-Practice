package Day1;

public class PersonMain {
	public static void main(String[] args) {
		Student p1 = new Student(2,2,5.8,1001,"Kiran B");
		Employee p2 = new Employee(2,2,5.6,102,"Raj");
		
		p1.eat();
		p1.sleep();
		System.out.println(p1.height);
		p1.height = 6.1;
		System.out.println(p1.height);
		p1.read();
		p1.write();
		System.out.println(p1.studentId);
		System.out.println(p1.studentName);
		
		System.out.println("------------------------");
		
		p2.eat();
		p2.sleep();
		System.out.println(p2.legs);
		p2.taskComplete();
		System.out.println(p2.empId);
		System.out.println(p2.empName);
	}

}
