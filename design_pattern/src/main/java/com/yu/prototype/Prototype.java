package com.yu.prototype;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @className: Prototype
 * @author: yu.liu
 * @date: 2019/8/13 22:06
 * @description:  原型模式实现方式 反射、克隆、建对象循环赋值
 */
public class Prototype  implements  Cloneable,Serializable{

    private String name;
    private List<String> list = new ArrayList();
    private User user;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /**
     * 浅克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * 深克隆
     * @return
     */
    public Object deepClone(){
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream is = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(is);

            Prototype  copy = (Prototype)ois.readObject();
            return  copy;
        }catch (Exception e){
            e.printStackTrace();
            return  null;
        }
    }
}
