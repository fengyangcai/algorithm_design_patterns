package cn.designpatterns.facade;

import java.lang.reflect.Method;

//外观角色测试
public class FacadePattern {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method();
    }
}
//外观角色
class Facade{
   private SubSystem01 obj1= new SubSystem01();
   private SubSystem02 obj2= new SubSystem02();
   public void method(){
        obj1.method();
        obj2.method();
   }


}
//子系统01
class SubSystem01{
    public void method(){
        System.out.println("子系统01的method1()被调用！");
    }
}//子系统02
class SubSystem02{
    public void method(){
        System.out.println("子系统02的method2()被调用！");
    }
}
