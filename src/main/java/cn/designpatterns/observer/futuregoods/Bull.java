package cn.designpatterns.observer.futuregoods;

import java.util.Observable;
import java.util.Observer;

/*
具体的观察类：这里是多方
Observer:是java.util。只有一个update方法。参数为被Observable观察者的接口，arg为被观察对象的那个属性。
 */
public class Bull implements Observer {

    public void update(Observable o, Object arg) {

        Float price =((Float)arg).floatValue();
        if (price>0){
            System.out.println("油价上涨"+price+"元，多方高兴了！");
        }else {
            System.out.println("油价下跌"+(-price)+"元，多方伤心了！");
        }

    }
}
