package com.example.Registration.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
	@Id
	private int id;
	private String username;
	private String hobbies;
	private String gender;
	private String password;
	private int age;
	
	public User() {
	}
	
	public User(int id,String username, String hobbies, String gender, String password, int age) {
		super();
		this.id=id;
		this.username = username;
		this.hobbies = hobbies;
		this.gender = gender;
		this.password = password;
		this.age = age;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", hobbies=" + hobbies + ", gender=" + gender
				+ ", password=" + password + ", age=" + age + "]";
	}
	
	

}
