package cn.designpatterns.observer;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ObserverTest {

    public static void main(String[] args) {
        //发布者
        final Subject subject =new ConcreteSubject();

        //订阅者
        ConcrereObserver concrereObserver = new ConcrereObserver("猪八戒");
        ConcrereObserver concrereObserver2 = new ConcrereObserver("沙僧");

        subject.attach(concrereObserver);
        subject.attach(concrereObserver2);

        //subject.notify("你师傅被捉走啦");
        final AtomicInteger atomicInteger=new AtomicInteger(0);
        new Thread(new Runnable() {
            public void run() {
                while (true) {
                    subject.notify("你师傅被捉走第\t" + atomicInteger.addAndGet(1) + "\t次");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },Thread.currentThread().getName()).start();
    }
}
