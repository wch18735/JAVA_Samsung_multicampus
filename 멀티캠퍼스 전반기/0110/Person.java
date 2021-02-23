package com.mulcam.j0110;

public class Person {
	// 자바빈즈(서로 관련있는 속성을 표현하는 클래스), VO, DTO
	private int no;
	private String name;
	private int age;
	private String job;

	public Person() {
	}

	public Person(int no, String name, int age, String job) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.job = job;
	}

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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	// set으로 시작하는 메소드들 : setter메소드(세터메소드)
	// get으로 시작하는 메소드들 : getter메소드(게터메소드)

}
