package 设计模式;

public class SingleTon {
    private SingleTon() {

    }

    public static SingleTon getInstance() {
        return SingleTonHolder.INSTANCE.singleton;
    }


    public static void main(String[] args) {
        SingleTon instance = SingleTon.getInstance();
        SingleTon instance1 = SingleTon.getInstance();
        System.out.println(instance == instance1);
    }

    private enum SingleTonHolder {
        INSTANCE;
        private final SingleTon singleton;
        SingleTonHolder() {
            this.singleton = new SingleTon();
        }
    }
}
