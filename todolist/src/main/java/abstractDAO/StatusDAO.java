package abstractDAO;

import dto.Status;

import java.util.List;


public interface IStatusDAO {
    public boolean createStatus(Status status);

    public Status readStatusByID(long id);

    public List<Status> readStatuses();

    public void updateStatus(Status status);

    public void deleteStatus(long id);
}
