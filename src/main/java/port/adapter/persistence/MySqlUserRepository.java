package port.adapter.persistence;

import domain.model.user.User;
import domain.model.user.UserName;
import domain.model.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.Map;
import java.util.List;

@Repository
public class MySqlUserRepository implements UserRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void save(User user) {
        jdbcTemplate.update("insert into my_user values (?)", user.name().name());
    }

    @Override
    public User ofName(UserName userName) {
        Map<String, Object> result = this.jdbcTemplate.queryForMap("SELECT * FROM my_user WHERE name = ?", userName.name());
        String name = (String)result.get("name");
        if (name == null || name.isEmpty()) {
            return null;
        }
        return new User(new UserName(name));
    }

    @Override
    public List<User> getAll() {
        return (List)this.jdbcTemplate.queryForList("SELECT * FROM my_user");
    }
}
