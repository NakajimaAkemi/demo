package persistence.repository;

import org.springframework.data.repository.CrudRepository;
import persistence.model.Task;

public interface TaskRepository extends CrudRepository<Task,Long> {
}

