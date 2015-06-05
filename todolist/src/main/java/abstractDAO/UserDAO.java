package abstractDAO;

import dto.User;

import java.util.List;

/**
 * слой работы с БД
 */
public interface IUserDAO {
    public boolean createUser(User user);

    public User readUserByID(long id);

    public List<User> readUsers();

    public void updateUser(User user);

    public void deleteUser(long id);

}
