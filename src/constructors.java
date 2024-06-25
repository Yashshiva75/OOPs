public class constructors {
    public static class car{
        //Properties
        String color;
        String name;
        Integer amount;
           static int count;
           //This is a constructor
        public car(){
            count++;
            System.out.println("Creating an object!"+count+" times");
        }
        public void info(){
            System.out.println("Color is "+ color+" and name is "+name+" priced "+amount);
        }
        public car(String name, String color,Integer Amount){
            this();
            //use of this keyword
            this.name = name;
            this.amount = Amount;
            this.color = color;
        }

    }

    public static void main(String[] args) {
        //Making new car/object
        car alto = new car();
        car verna = new car();
        car tata = new car("nano","blue",10000);

        //object functionality
        alto.color = "white";
        alto.name = "alto";
        alto.amount = 500000;
        tata.info();
    }
}
