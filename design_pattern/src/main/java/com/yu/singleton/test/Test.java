package com.yu.singleton.test;

import com.yu.singleton.hungry.Hungry;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * @className: Test
 * @author: yu.liu
 * @date: 2019/8/13 20:33
 * @description:
 */
public class Test {

    public static void main(String[] args){
        int count = 100;
        CountDownLatch latch = new CountDownLatch(count);
        //final Set<Hungry> synSet = Collections.synchronizedSet(new HashSet<>());
        for (int i = 0; i < count; i++) {
            new Thread(){
                @Override
                public void run() {
                    Hungry.getInstance();
                }
            }.start();
            latch.countDown();
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
