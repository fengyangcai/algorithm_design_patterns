package cn.designpatterns.decorator;

//具体构建角色
//也就是要被装饰的对象。
public class ConcreteComponent implements Component {

    public ConcreteComponent() {
        System.out.println("我是原本的就在的角色。我还很虚弱");
    }

    public void operation() {
        System.out.println("调用具体的角色的方法--此时我还是虚弱的");
    }
}
