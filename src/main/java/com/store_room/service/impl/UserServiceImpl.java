package com.store_room.service.impl;

import com.store_room.entity.UserEntity;
import com.store_room.service.UserService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Override
    public UserEntity findById(String id) {
        return null;
    }
}
