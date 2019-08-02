package com.teamax.alleyoop.common.util;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest {
    private static int counter = 0;
    public static void main(String[] args) throws Exception{
        AtomicInteger a1 = new AtomicInteger(0);
        a1.incrementAndGet();

        Lock lock = new ReentrantLock();

        ThreadA t1 = new ThreadA("t1");
        synchronized(t1) {
            try {
                // 启动“线程t1”
                System.out.println(Thread.currentThread().getName()+" start t1");
                t1.start();

                // 主线程等待t1通过notify()唤醒。
                System.out.println(Thread.currentThread().getName()+" wait()");
                t1.wait();

                System.out.println(Thread.currentThread().getName()+" continue");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 三个方法: 获取当前线程对象:Thread.currentThread(); 给线程起名: t1.setName("t1"); 获取线程的名字: t.getName();
     */
    private static void ThreadTest1() {
        Thread t = Thread.currentThread();// t保存的内存地址指向的线程为"主线程"
        System.out.println(t.getId());
        Thread t1 = new Thread(new Processor1());
        // 给线程起名
        t1.setName("t1");
        t1.start();
        Thread t2 = new Thread(new Processor1());
        t2.setName("t2");
        t2.start();
    }

    /**
     * 线程优先级高的获取的CPU时间片相对多一些 优先级: 1-10 最低: 1 最高: 10 默认: 5
     */
    private static void ThreadTest2() {
        Thread t1 = new Processor2();
        Thread t2 = new Processor2();
        t1.setName("t1");
        t2.setName("t2");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }

    /**
     * 1.Thread.sleep(毫秒); 2.sleep方法是一个静态方法 3.该方法的作用: 阻塞当前线程,腾出CPU,让给其它线程
     */
    private static void ThreadTest3() {
        Thread t = new Thread(new Processor3());
        t.start();
        for (int i = 0; i < 11; i++) {
            System.out.println(Thread.currentThread().getName() + "========>" + i);
            try {
                t.sleep(5000);// 等同于Thread.sleep(5000);阻塞的还是当前线程,和t线程无关.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 某线程正在休眠,如何打断它的休眠 以下方式依靠的是异常处理机制
     */
    private static void ThreadTest4() {
        try {
            Thread t = new Thread(new Processor4());
            t.start();
            Thread.sleep(5000);// 睡5s
            t.interrupt();// 打断Thread的睡眠
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 如何正确的更好的终止一个正在执行的线程 需求:线程启动5s之后终止.
     */
    private static void ThreadTest5() {
        Processor5 p = new Processor5();
        Thread t = new Thread(p);
        t.start();
        // 5s之后终止
        try {
            Thread.sleep(5000);
            p.isRun = false;
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

// WaitTest.java的源码
class ThreadA extends Thread{
    public ThreadA(String name) {
        super(name);
    }
    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName()+" call notify()");
            // 唤醒当前的wait线程
            notify();
        }
    }
}

class Processor1 implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();// t保存的内存地址指向的线程为"t1线程对象"
        System.out.println(t.getName());
        System.out.println(t.getId());
    }
}

class Processor2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "----------->" + i);
        }
    }
}

class Processor3 implements Runnable {

    /**
     * Thread中的run方法不能抛出异常,所以重写runn方法之后,在run方法的声明位置上不能使用throws 所以run方法中的异常只能try...catch...
     */
    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println(Thread.currentThread().getName() + "========>" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class Processor4 implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000000000);
            System.out.println("能否执行这里");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 11; i++) {
            System.out.println(Thread.currentThread().getName() + "========>" + i);
        }
    }
}

class Processor5 implements Runnable {

    boolean isRun = true;

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            if (isRun) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "========>" + i);
            }
        }
    }
}

class Thread1 extends Thread{
    private String name;
    public Thread1(String name) {
        super(name);
        this.name=name;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 线程运行开始!");
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程"+name + "运行 : " + i);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " 线程运行结束!");
    }
}

// RunnableTest.java 源码
class MyThread implements Runnable{
    private int ticket=10;
    public void run(){
        for(int i=0;i<20;i++){
            if(this.ticket>0){
                System.out.println(Thread.currentThread().getName()+" 卖票：ticket"+this.ticket--);
            }
        }
    }
};

class ThreadNotify {
    private Object lock;
    public ThreadNotify(Object lock) {
        this.lock = lock;
    }
    public void testNotify() {
        try {
            synchronized (lock) {
                System.out.println("start notify........");
                lock.notify();
                System.out.println("end notify........");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ThreadWait {
    private Object lock;
    public ThreadWait(Object lock) {
        this.lock = lock;
    }
    public void testWait() {
        try {
            synchronized (lock) {
                System.out.println("start wait........");
                lock.wait();
                System.out.println("end wait........");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}