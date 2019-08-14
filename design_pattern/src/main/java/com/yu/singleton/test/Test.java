package com.yu.singleton.test;

import com.yu.singleton.hungry.Hungry;
import com.yu.singleton.lazy.LazyFour;
import com.yu.singleton.lazy.LazyOne;
import com.yu.singleton.lazy.LazyThree;
import com.yu.singleton.lazy.LazyTwo;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * @className: PrototypeTest
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
                    try {
                        latch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                //  LazyOne lazyOne =  LazyOne.getInstance();
                 //  LazyTwo lazyTwo= LazyTwo.getInstance();
                   // Hungry hungry = Hungry.getInstance();
                    LazyThree lazyThree = LazyThree.getInstance();
                   // LazyFour lazyFour = LazyFour.getInstance();
                    System.out.println(lazyThree);
                }
            }.start();
            latch.countDown();
        }

    }
}
