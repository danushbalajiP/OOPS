class Employee{
    String name;
    double salary;
    Employee(String n,double s){
        this.name=n;
        this.salary=s;
    }
    Employee(Employee e){
        this.name=e.name;
        this.salary=e.salary;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
public class Constructors{
    public static void main(String[] args) {
        Employee e1=new Employee("John",50000.0);
        Employee e2=e1;
        e1.display();
        e2.display();
        e2.name="Jane";
        e2.salary=60000.0;
        e1.display();   
        e2.display();
    }
}