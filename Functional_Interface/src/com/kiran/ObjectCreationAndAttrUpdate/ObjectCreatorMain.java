package com.kiran.ObjectCreationAndAttrUpdate;

import java.util.function.Consumer;

@FunctionalInterface
interface ObjectCreator
{
	Object create(int id, String name);
}

class Student
{
	 private int id;
	 private String name;
	public String setName;
	 
	 
	 
	 public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	void updateName(Consumer<String> nameUpdater)
	 {
		 nameUpdater.accept(this.name);
		 setName(this.name);
	 }
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + "]";
	}
	 
}

public class ObjectCreatorMain 
{
	public static void main(String[] args) 
	{
		ObjectCreator studentCreator = (id, name) -> new Student(id, name);

        // Test Case 1: Basic Creation and Update
        Student student1 = (Student) studentCreator.create(1, "John Doe");
        student1.updateName(name -> student1.setName = "Jane Updated");  // Update name
        System.out.println("Updated Student Details:");
        System.out.println(student1);  // Expected: Student{id=1, name='Jane Updated'}

        // Test Case 2: Different Name Update
        Student student2 = (Student) studentCreator.create(2, "Alice");
        student2.updateName(name -> student2.setName = "Alice Johnson");  // Update name
        System.out.println("\nUpdated Student Details:");
        System.out.println(student2);  // Expected: Student{id=2, name='Alice Johnson'}

        // Test Case 3: No Name Update
        Student student3 = (Student) studentCreator.create(3, "Bob");
        // No update, so name stays the same
        System.out.println("\nUpdated Student Details:");
        System.out.println(student3);  // Expected: Student{id=3, name='Bob'}

	}

}
