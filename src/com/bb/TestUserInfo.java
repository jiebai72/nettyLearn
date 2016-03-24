package com.bb;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by aiyou on 16/3/24.
 */
public class TestUserInfo {


    public static void main(String[] args) throws IOException {


        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("张飞");
        userInfo.setAge(20);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);

        objectOutputStream.writeObject(userInfo);
        objectOutputStream.flush();
        objectOutputStream.close();

        byte[] b = byteArrayOutputStream.toByteArray();
        System.out.println("after serials length: " + b.length );

        byteArrayOutputStream.close();

//        System.out.println("my serial :" + userInfo.codeC().length );
    }



}
