package demo;

public class SingleTon {
    private SingleTon() {

    }

    public static void main(String[] args) {
        SingleTon instance = SingleTon.getInstance();
        SingleTon instance1 = SingleTon.getInstance();

        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
        SingleTon singleTon = SingleTonHolder.instance.singleTon;
    }


    public static SingleTon getInstance() {
        return SingleTonHolder.instance.singleTon;
    }

    private enum SingleTonHolder {
        instance;
        private final SingleTon singleTon;

        SingleTonHolder() {
            this.singleTon = new SingleTon();
        }
    }
}
