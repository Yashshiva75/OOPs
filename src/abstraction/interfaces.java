package abstraction;

public class interfaces implements car {
    public static void main(String[] args) {
         interfaces n = new interfaces();
         n.run();
    }
public void run(){
        System.out.println("RUnning");
    }
}
interface car{
    void run();
}
