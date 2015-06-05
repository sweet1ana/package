package abstractDAO;

import dto.Status;

import java.util.List;

/**
 * Created by svetlana on 23.04.2015.
 */
public interface IStatusDAO {
    public boolean createStatus(Status status);

    public Status readStatusByID(long id);

    public List<Status> readStatuses();

    public void updateStatus(Status status);

    public void deleteStatus(long id);
}
