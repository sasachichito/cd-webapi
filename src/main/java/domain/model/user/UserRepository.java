package domain.model.user;

public interface UserRepository {
    public void registerUser(User user);
    public User user(String userName);
}
