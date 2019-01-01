package port.adapter.persistence;

import domain.model.user.User;
import domain.model.user.UserRepository;

public class MySqlUserRepository implements UserRepository {
    @Override
    public void registerUser(User user) {

    }

    @Override
    public User user(String userName) {
        return null;
    }
}
