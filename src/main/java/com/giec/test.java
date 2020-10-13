package com.giec;

public class test {
    public static void main(String[] args) throws InterruptedException {
        long totalMemory = Runtime.getRuntime().totalMemory();
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("配置的直接内存"+sun.misc.VM.maxDirectMemory()/1024/1024);

        System.out.println(totalMemory);
        System.out.println(maxMemory);
        System.out.println(Thread.currentThread().getName());
       // Thread.currentThread().sleep(1000000000);
    }
}
