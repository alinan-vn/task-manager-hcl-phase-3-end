package org.hcl.taskmanager.entities;

import javax.persistence.*;

@Table(name = "task")
@Entity
public class TaskEntity {

	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;
	public UserEntity getUser() { return user; } // Are these necessary?
	public void setUser(UserEntity user) { this.user = user; } // Are these necessary?
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	public Long getId() { return id; }
	
	@Column(name = "name")
	private String name;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	@Column(name = "description")
	private String description;
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	
}
