package com.customlistener.zhao.listenerUsage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(customListener.class)//这个语句指明了使用自定义的listener。


public class listenerTest {
    @Test
    public void templistener1(){
        System.out.println("i'm listenerTest1");
    }

    @Test
    public void templistener2(){
        System.out.println("i'm listenerTest2");
    }
}
