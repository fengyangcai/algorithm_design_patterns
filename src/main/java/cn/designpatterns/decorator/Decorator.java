package cn.designpatterns.decorator;

//抽象装饰角色
public class Decorator implements Component {
    //拥有被装饰的对象接口
    private  Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    //调用被装饰对象的方法
    public void operation() {
        component.operation();
    }
}
