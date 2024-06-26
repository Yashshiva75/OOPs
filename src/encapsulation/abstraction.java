package encapsulation;

public class abstraction {
    public void main(String[] args) {
        tree mango = new tree();
        mango.run();
    }
    class tree extends earth{
        @Override
        void run() {
            System.out.println("Working..");
        }
    }
    abstract class earth{
        abstract void run();
    }
}
