package org.hcl.taskmanager.controllers;

import org.hcl.taskmanager.crudRepository.TaskCrudRepository;
import org.hcl.taskmanager.entities.TaskEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TaskController {

	@Autowired
	private TaskCrudRepository taskCrudRepository;
	
	@GetMapping(path = "/tasks")
	public Iterable<TaskEntity> getAllTasks() {
		return taskCrudRepository.findAll();
	}

	@GetMapping(path = "/task/{id}")
	public TaskEntity getTaskById(@PathVariable Long id) {
		return taskCrudRepository.findById(id).get();
	}
	
	@PostMapping(path = "/task")
	public TaskEntity createTask(@RequestBody TaskEntity task) {
		return taskCrudRepository.save(task);
	}
	
	@PutMapping(path = "/task/{id}")
	public TaskEntity updateTask(@PathVariable Long id, @RequestBody TaskEntity task) throws Exception {
		TaskEntity toBeUpdatedTask = taskCrudRepository.findById(id).orElseThrow(() -> new Exception());
		
		toBeUpdatedTask.setName(task.getName());
		toBeUpdatedTask.setDescription(task.getDescription());	
		
		return toBeUpdatedTask;
	}
	
	@DeleteMapping(path = "/task/{id}")
	public void deleteTaskById(@PathVariable Long id) {
		taskCrudRepository.deleteById(id);
	}
}
