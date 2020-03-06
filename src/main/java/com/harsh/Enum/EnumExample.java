package com.harsh.Enum;

public class EnumExample{

public enum Breverages {

    COFFE_LATE("Coffe_latte","Milk","Sugar"),
    TEA("Tea","Milk","Sugar"),
    STRAWBERRY_SHAKE("Strawberry_Shake","Milk","Sugar");

         private Breverages(String s1,String s2,String s3){
        System.out.println("in 3 arg Constuctor");
        type=s1;
        milk=s2;
        sugar=s3;
    }
    
     private Breverages(){
System.out.println("in 0 arg Constuctor");
       
        
    }
    String type;
    String milk;
    String sugar;

        public String getType() {
            return type;
        }

        public String getMilk() {
            return milk;
        }

        public String getSugar() {
            return sugar;
        }
   
    
    
}
    public static void main(String[] args) {
       
       // Breverages CAPACHUNO=Breverages.valueOf("CAPACHINO()");
         for(Breverages breverages:Breverages.values()){
           System.out.println(breverages.getType()+" "+breverages.getMilk()+" "+breverages.getSugar());
          
        }
          add(null);
    }
    
    public static void add(Object o){
        System.out.println("Object ");
    }
//    public static void add(Integer o){
//        System.out.println("Interg");
//    }
    public static void add(String o){
        System.out.println("String");
    }
}
