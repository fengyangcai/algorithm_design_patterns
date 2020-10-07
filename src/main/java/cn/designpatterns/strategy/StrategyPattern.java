package cn.designpatterns.strategy;

import cn.designpatterns.observer.ConcrereObserver;

public class StrategyPattern {
    public static void main(String[] args) {
        Context context = new Context();
        ConcreteStrategyA concreteStrategyA = new ConcreteStrategyA();
        ConcreteStrategyB concreteStrategyB = new ConcreteStrategyB();
        //使用策略A
        context.setStrategy(concreteStrategyA);
        context.strategyMethod();
        System.out.println("===============");
        //使用策略B
        context.setStrategy(concreteStrategyB);
        context.strategyMethod();
    }
}
