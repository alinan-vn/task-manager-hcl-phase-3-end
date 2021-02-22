package org.hcl.taskmanager.crudRepository;

import org.hcl.taskmanager.entities.TaskEntity;
import org.springframework.data.repository.CrudRepository;

public interface TaskCrudRepository extends CrudRepository<TaskEntity, Long>{

}
