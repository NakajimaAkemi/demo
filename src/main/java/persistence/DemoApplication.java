package persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import persistence.model.Task;
import persistence.repository.TaskRepository;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner {

    private static final Logger LOG = LoggerFactory.getLogger(DemoApplication.class);


    TaskRepository taskRepository;
    public static void main(final String... args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        LOG.info("Starting Spring Boot application...");
        Iterable<Task> tasks = taskRepository.findAll();
        tasks.forEach(task -> LOG.info(tasks.toString()));
    }

    public DemoApplication(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
}