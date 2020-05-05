package com.store_room.service;

import com.store_room.entity.UserEntity;

public interface UserService {
    UserEntity findById(String id);
}
