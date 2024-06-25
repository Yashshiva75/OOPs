public class inheritance {
    //In this the methods made in father class can be used by son and grandchild
  public static class father{
      String name;
      String voice;
      int height;
      Integer income;
      //Making as constructor
      public father(String fvoice,int fheight,Integer fincome,String fname){
          voice = fvoice;
          income = fincome;
          height = fheight;
          name = fname;
      }
      //method
      public void info(){
          System.out.println("name is "+name+" Voice is "+voice+" height is "+ height +" Income is "+ income);
      }
      //father's walking method can be accessed by son
        public void walking(){
            System.out.println(name+" is walking at park");
        }

  }
    //Son class
      static class son extends father{
          public son(String fvoice, int fheight, Integer fincome, String fname) {
              super(fvoice, fheight, fincome,fname);
          }
      }

      //GrandChild class
      static class grandChild extends son{
      //constructor
          public grandChild(String fvoice,int fheight, Integer fincome,String fname){
              super(fvoice,fheight,fincome,fname);
          }
      }

    public static void main(String[] args) {
      //object
        father kamal = new father("Deep",6,550000,"kamal");
        son yash = new son("high",7,4000000,"Yash");
        grandChild vyom = new grandChild("hard",9,350000,"Vyom");
        kamal.info();
        yash.walking();
        vyom.info();
        vyom.walking();
    }
}
