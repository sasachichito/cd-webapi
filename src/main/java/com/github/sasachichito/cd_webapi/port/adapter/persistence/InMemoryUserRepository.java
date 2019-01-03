package com.github.sasachichito.cd_webapi.port.adapter.persistence;

import com.github.sasachichito.cd_webapi.domain.model.user.User;
import com.github.sasachichito.cd_webapi.domain.model.user.UserName;
import com.github.sasachichito.cd_webapi.domain.model.user.UserRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
@Profile("dev")
public class InMemoryUserRepository implements UserRepository {

    private Map<String, User> repository;

    public InMemoryUserRepository() {
        this.repository = new HashMap<>();
    }

    @Override
    public void save(User user) {
        if (this.repository.containsKey(user.name().name())) {
            return;
        }
        this.repository.put(user.name().name(), user);
    }

    @Override
    public User ofName(UserName userName) {
        return this.repository.get(userName.name());
    }

    @Override
    public List<User> getAll() {
        return this.repository.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
    }
}
