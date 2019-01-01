package com.github.sasachichito.cd_webapi.port.adapter.persistence;

import com.github.sasachichito.cd_webapi.domain.model.user.User;
import com.github.sasachichito.cd_webapi.domain.model.user.UserName;
import com.github.sasachichito.cd_webapi.domain.model.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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
        String name;
        try {
            Map<String, Object> result = this.jdbcTemplate.queryForMap("SELECT * FROM my_user WHERE name = ?", userName.name());
            name = (String)result.get("name");
        } catch (EmptyResultDataAccessException e) {
            return null;
        }

        return new User(new UserName(name));
    }

    @Override
    public List<User> getAll() {
        return (List)this.jdbcTemplate.queryForList("SELECT * FROM my_user");
    }
}
