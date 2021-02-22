package org.hcl.taskmanager.entities;

import javax.persistence.*;

@Table(name = "user")
@Entity
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	public Long getId() { return id; }
	
	@Column(name = "username")
	private String username;
	public String getUsername() { return username; }
	public void setUsername(String username) { this.username = username; }
	
	@Column(name = "password")
	private String password;
	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }
}
