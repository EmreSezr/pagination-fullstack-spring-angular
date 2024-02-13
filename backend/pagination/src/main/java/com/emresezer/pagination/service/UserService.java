package com.emresezer.pagination.service;

import com.emresezer.pagination.domain.User;
import org.springframework.data.domain.Page;

public interface UserService {
    Page<User> getUsers(String name, int page, int size);
}
