package com.yu.decorator;

import javax.xml.crypto.Data;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/**
 * @className: DecoratorTest
 * @author: yu.liu
 * @date: 2019/8/17 18:12
 * @description: IO流用了许多装饰着模式
 * 原来的功能依旧保留，但可以增加一些新的功能
 */
public class DecoratorTest {


    public static void main(String[] args){

        InputStream in = null;
        FilterInputStream fis = new DataInputStream(in);
    }
}
