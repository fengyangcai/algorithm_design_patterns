package cn.designpatterns.observer.futuregoods;

public class CrudOilFutures {

    public static void main(String[] args) {
        OilFutures oil =new OilFutures();
        Bull bull = new Bull();//多方
        Bear bear = new Bear();//空方
        oil.addObserver(bear);
        oil.addObserver(bull);
        oil.setPrice(10);
        oil.setPrice(-2);
    }
}
