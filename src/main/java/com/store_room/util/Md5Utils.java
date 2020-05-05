package com.store_room.util;


import org.apache.shiro.crypto.hash.SimpleHash;


/**
  *
 */
public class Md5Utils {
    public static Object encryption(String userName, String password) {
        String hashAlgorithmName = "MD5";//加密方式
        org.apache.shiro.util.ByteSource salt = org.apache.shiro.util.ByteSource.Util.bytes(userName);//以账号作为盐值
        int hashIterations = 1024;//加密1024次
        return new SimpleHash(hashAlgorithmName, password, salt, hashIterations);
    }
}
