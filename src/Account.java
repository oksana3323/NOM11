public class Account {
double balance;
String name;

//String дом;
//int цена;
//int комната;
//int этаж;
//int квадратметр;
//int тел;
// void myMethod() {
//    System.out.println("depozit: "+ balance+"\n"+"Рассрочка без%на 12 месяца: "+дом+"\n"+"Неделя скидок 15%:" +
//            ""+цена+"\n"+"Комната: "+комната+"\n"+"12 этажный дом : "+этаж
//    +"\n"+"кв.м: "+квадратметр+"\n"+"телефон номер: "+тел); }
//    void myMethod1() {
//
//
//         System.out.println("withdrawal: " + balance + "\n" + "Рассрочка без%на 12 месяца: " + дом + "\n" + "Неделя скидок 15%:" +
//                 "" + цена + "\n" + "Комната: " + комната + "\n" + "12 этажный дом : " + этаж
//                 + "\n" + "кв.м: " + квадратметр + "\n" + "телефон номер: " + тел);
//
//     }
    public void deposit(double price){
        this.balance+=price;
    }
    public void withdrawal(double price){
        this.balance-=price;
    };
    public String getInfo(){
        return this.name+"  "+this.balance;
    };
}
