package com.yu.proxy.staticed;

/**
 * @className: ProxyStudent
 * @author: yu.liu
 * @date: 2019/8/15 20:49
 * @description:
 */
public class ProxyStudent {

    private Student student;
    public ProxyStudent(Student student){
        this.student = student;
    }

    public void dosomething(){
        System.out.println("加强");
        student.dosomething();
        System.out.println("加强");
    }
}
