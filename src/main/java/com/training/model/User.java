package com.training.model;

import java.util.Collection;

import javax.persistence.*;


@Entity
@Table(name="User", uniqueConstraints=@UniqueConstraint(columnNames={"username"}))
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;
	private String username;
	private String password;
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

	

	
}
