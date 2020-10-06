package cn.designpatterns.single;

public class Sington1 {

    private static Sington1 instance = new Sington1();

    private Sington1() {
    }

    public static Sington1 getInstance() {
        return instance;
    }
}


class Sington2 {

    private static Sington2 instance;

    private Sington2() {
    }

    ;

    private static synchronized Sington2 getInstance() {
        if (instance == null) {
            instance = new Sington2();
        }
        return instance;
    }
}

class Sington3 {

    private static Sington3 instance;

    private Sington3() {
    }

    private static Sington3 getInstance() {
        if (instance == null) {
            synchronized (Sington3.class) {
                if (instance == null) {
                    instance = new Sington3();
                }
            }
        }
        return instance;
    }
}