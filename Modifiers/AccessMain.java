class AccessExample {

    private int a = 10;        
    int b = 20;                
    protected int c = 30;      
    public int d = 40;         

    public void display() {
        System.out.println("Private a = " + a);
        System.out.println("Default b = " + b);
        System.out.println("Protected c = " + c);
        System.out.println("Public d = " + d);
    }
}

public class AccessMain {
    public static void main(String[] args) {

        AccessExample obj = new AccessExample();
        obj.display();

        System.out.println(obj.b);  // Default
        System.out.println(obj.c);  // Protected
        System.out.println(obj.d);  // Public

    }
}