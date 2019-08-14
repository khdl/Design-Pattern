package com.yu.prototype;

import com.yu.prototype.User;
import com.yu.prototype.Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: PrototypeTest
 * @author: yu.liu
 * @date: 2019/8/13 22:08
 * @description:
 */
public class PrototypeTest {
    public static void main(String[] args){
        Prototype p = new Prototype();
        p.setName("alan");
        List<String> list = new ArrayList<>();
        list.add("111");
        p.setList(list);


        User user = new User();
        user.setAge(20);
        user.setName("Eric");
        p.setUser(user);

        try {
            System.out.println(p);
            //Prototype clone = (Prototype)p.clone();
             Prototype clone = (Prototype)p.deepClone();
            System.out.println(clone);
            System.out.println(p.getUser());
            System.out.println(clone.getUser());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
