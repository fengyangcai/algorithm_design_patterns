package cn.designpatterns.observer;

/*
具体的观察者（或者消息的接受方）
 */
public class ConcrereObserver implements Observer {

    private String name;

    public ConcrereObserver(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name+":\t" +message);
    }
}
