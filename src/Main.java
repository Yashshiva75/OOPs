public class Main {
    public static void main(String[] args) {
        //Making a new object/student using "new keyword"
        students yash = new students(); //This is a object
        students nikhil = new students();//This is a object
        students anand = new students();//This is a object
        //The dot"." operator used in accessing a property of an object/student
        yash.name = "yash shiva";
        yash.rollNo = 44;
        yash.Address = "Aburoad";
        yash.Income = 40000;
        yash.standard = 11;
        // Calling a method for yash/object
        yash.information();
        yash.result(70);

    }

    public static class students{
        // This is called properties if a class(students)
        String name;  //this is a property
        String Address;
        Integer rollNo;
        Integer Income;
        Integer standard;

        //Using a method for object/student
        void result(){
            System.out.println(name+" has passed the semister!!");
        }
        //Polymormiphsm
        void result(int marks){
            System.out.println(name+" has passed the semister!!"+" with "+marks+" marks");
        }
        void greet(){
            System.out.println("Good morning "+name);
        }
        void information(){
            System.out.println("Student name is: "+name+" living at "+Address+"Roll no is "+rollNo+" Annual income is "+Income+" and studying in "+standard);
        }
    }
}