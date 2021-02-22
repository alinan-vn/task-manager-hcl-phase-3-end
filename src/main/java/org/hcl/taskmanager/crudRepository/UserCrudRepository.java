package org.hcl.taskmanager.crudRepository;

import org.hcl.taskmanager.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<UserEntity, Long>{

}
