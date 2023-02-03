public class Account {
double balance;
String name;

//S
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
