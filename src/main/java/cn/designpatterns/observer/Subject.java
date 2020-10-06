package cn.designpatterns.observer;

//被观察者(消息发布方)
interface Subject {
    //增加订阅者
    public void attach(Observer observer);
    //删除订阅者
    public void detach(Observer observer);
    //通知订阅者更新消息
    public void  notify(String message);
}

