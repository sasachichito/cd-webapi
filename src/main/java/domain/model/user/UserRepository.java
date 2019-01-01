package domain.model.user;

import java.util.List;

public interface UserRepository {
    public void save(User user);
    public User ofName(UserName userName);
    public List<User> getAll();
}
