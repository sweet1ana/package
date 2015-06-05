package abstractDAO;

import dto.Task;

import java.util.List;


public interface ITaskDAO {

    public boolean createTask(Task task);

    public Task readTaskByID(long id);

    public List<Task> readTasks();

    public void updateTask(Task task);

    public void deleteTask(long id);
}
