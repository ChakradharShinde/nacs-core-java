package com.nacs.collection.queue.entities;

public class Devotees implements Comparable<Devotees>{
	private String name;
	private int age;
	private int priority;

	public Devotees() {
		
	}

	public Devotees(String name, int age, int priority) {
		this.name = name;
		this.age = age;
		this.priority = priority;
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

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	@Override
	public int compareTo(Devotees obj2) {
		return obj2.age-this.age;
	}

	@Override
	public String toString() {
		return "Devotees [name=" + name + ", age=" + age + ", priority=" + priority + "]";
	}

}
