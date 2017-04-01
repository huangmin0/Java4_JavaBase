 package com.collection;

public class Student implements Comparable<Student> {
	// public class Student {
	String name;
	int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Student 方法被执行..");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		
		 if (age != other.age) return false;
		 
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (this.age < o.age) {
			return -1;
		} else if (this.age == o.age) {
			return 0;
		} else {
			return 1;
		}
	}

}