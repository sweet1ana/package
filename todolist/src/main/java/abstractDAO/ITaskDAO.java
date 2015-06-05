package abstractDAO;

import dto.Task;

import java.util.List;

/**
 * Created by svetlana on 23.04.2015.
 */
public interface ITaskDAO {

    public boolean createTask(Task task);

    public Task readTaskByID(long id);

    public List<Task> readTasks();

    public void updateTask(Task task);

    public void deleteTask(long id);
}
