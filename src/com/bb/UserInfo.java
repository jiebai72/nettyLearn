package com.bb;

import java.io.Serializable;
import java.nio.ByteBuffer;

/**
 * Created by aiyou on 16/3/24.
 */
public class UserInfo  implements Serializable {


    String userName;
    int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public byte[] codeC(){
//
//        ByteBuffer buffer = ByteBuffer.allocate(1024);
//        byte[] value = this.userName.getBytes();
//        buffer.putInt( value.length ) ;
//        buffer.put(value);
//
//        buffer.putInt( this.age ) ;
//        buffer.flip() ;
//
//        value = null ;
//
//        byte[] result =  new byte[buffer.remaining()];
//        buffer.get(result);
//        return result ;
//    }

    public byte[] codeC(){

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        byte[] value = this.userName.getBytes();
        buffer.putInt( value.length ) ;
        buffer.put(value);

        buffer.putInt( this.age ) ;
        buffer.flip() ;

        value = null ;

        byte[] result =  new byte[buffer.remaining()];
        buffer.get(result);
        return result ;
    }



}
