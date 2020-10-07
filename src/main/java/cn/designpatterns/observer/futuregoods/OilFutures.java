package cn.designpatterns.observer.futuregoods;

import java.util.Observable;

/*
Observable是代表一个可代表可观察对象或者数据的接口

OilFutures：具体的目标类（被观察的类）：原油期货
 */
public class OilFutures extends Observable {

    private  float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        //设置内部标志位，注明数据发生变化
        super.setChanged();
        //通知观察者价格改变了
        super.notifyObservers(price);
        this.price = price;
    }
}
