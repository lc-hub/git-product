package com.baizhi.test;

import org.junit.Test;
import sun.applet.Main;

/**
 * @author miion
 * @create 2019-08-22 22:16
 */
public class Test1 {


    @Test
    public void test(){
        A a = new B();
        B b = (B) a;
        System.out.println(b.toString());
    }
}

class A {

}

class B extends A{

}
