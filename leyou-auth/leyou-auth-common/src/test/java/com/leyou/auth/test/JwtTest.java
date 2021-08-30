package com.leyou.auth.test;

import com.leyou.auth.entity.UserInfo;
import com.leyou.auth.utils.JwtUtils;
import com.leyou.auth.utils.RsaUtils;
import org.junit.Before;
import org.junit.Test;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Date;

/**
 * @Author: 98050
 * @Time: 2018-10-23 20:58
 * @Feature: JWT测试
 */
public class JwtTest {

    private final String pubKeyPath = "D:\\tmp\\leyoursa\\rsa.pub";

    private final String priKeyPath = "D:\\tmp\\leyoursa\\rsa.pri";

    private PublicKey publicKey;

    private PrivateKey privateKey;

    // 如果运行 testRsa() ，需要将testGetRsa()方法的@Before注释掉
    @Test
    public void testRsa() throws Exception {
        RsaUtils.generateKey(pubKeyPath, priKeyPath, "234");
    }

    // 如果运行 testRsa() ，需要将@Before注释掉
    @Before
    public void testGetRsa() throws Exception {
        this.publicKey = RsaUtils.getPublicKey(pubKeyPath);
        this.privateKey = RsaUtils.getPrivateKey(priKeyPath);
    }

    @Test
    public void testGenerateToken() throws Exception {
        // 生成token
        String token = JwtUtils.generateToken(new UserInfo(20L, "jack"), privateKey, 5);
        System.out.println("token = " + token);
    }

    @Test
    public void testParseToken() throws Exception {
        String token = "eyJhbGciOiJSUz1NiJ9.eyJpZCI6MjAsInVzZXJuYW1lIjoiamFjayIsImV4cCI6MTYyMzMzOTE2N30.eVeX1Q5zJoQeJJdibSp1SUrqOWR0n_dJ89yrYb1GNhiHr83P1XJtqApdE0id6_Q3PA_3a5ZINP_9O-pA9MXx3I_wG4iRqxs-bK3u5ZDVL2x0X5U9ANVdSfqrV0PUpqt0t8NsNu3Q8-gC1mo28xBcLLMevOht3MgvQFuMLewZA1s";

        // 解析token
        UserInfo user = JwtUtils.getInfoFromToken(token, publicKey);
        System.out.println("id: " + user.getId());
        System.out.println("userName: " + user.getUsername());
    }

    @Test
    public void date(){
        System.out.println(new Date());
    }
}
