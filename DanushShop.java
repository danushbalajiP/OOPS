public class DanushShop{
public static void main(String[] args){
int iteama=100, iteamb=175, iteamc=800;
double price;
price=(iteama*2) + (iteamb*3) + (iteamc*4);
price=price-(0.1*price);
price=price+(0.05*price);
if (price>1000){
price=price-(0.1*price);
}else{
System.out.println("Not eligible for disount");
}
System.out.println(price);
}
}