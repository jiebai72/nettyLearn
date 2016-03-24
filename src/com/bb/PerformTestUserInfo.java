package com.bb;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by aiyou on 16/3/24.
 */
public class PerformTestUserInfo {


    public static void main(String[] args) throws IOException {


        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("张飞");
        userInfo.setAge(20);

        int loop = 1000000;

        ByteArrayOutputStream byteArrayOutputStream ;
        ObjectOutputStream objectOutputStream ;

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < loop ; i++) {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);

            objectOutputStream.writeObject(userInfo);
            objectOutputStream.flush();
            objectOutputStream.close();

            byte[] b = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        }

        long elapsedTime = System.currentTimeMillis() - startTime ;

        System.out.println("  serials cost: " + elapsedTime );
        System.out.println("----------------------------");


        startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            byte[] b = userInfo.codeC();
        }

        elapsedTime = System.currentTimeMillis() - startTime ;

        System.out.println("my serial :" + elapsedTime );
    }



}
