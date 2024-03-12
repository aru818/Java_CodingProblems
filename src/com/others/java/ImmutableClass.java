package com.others.java;

//step 1: make the class final
//step 2: make the variable final
//step 3: make the getter not setter
public final class ImmutableClass {
	final int id;
	final String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public ImmutableClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		ImmutableClass immutable = new ImmutableClass(12, "nullyfing");
		int getId = immutable.getId();
		String getName = immutable.getName();
		System.out.println(getId + ":" + getName);
	

	}
}
