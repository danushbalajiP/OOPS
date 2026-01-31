public Class car{
String model;
int year;

public car(String model,int year){
this.model=model;
this.year=year;
}
public void displayInfo(){
System.out.println("model:" + model + ",year:" + year);
}
public static void main(String[] ags){
car mycar=new car("venue",2023);
mycar.displayInfo();
}
}