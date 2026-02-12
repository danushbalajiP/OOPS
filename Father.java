class Father {
    protected int landArea;
    protected String propertyType;

    public void showProperty() {
        System.out.println("Land Area: " + landArea);
        System.out.println("Property Type: " + propertyType);
    }
}
class ChildOne extends Father {
    protected String usage;

    public void showUsage() {
        showProperty();
        System.out.println("Usage by Child One: " + usage);
    }
}
class ChildTwo extends Father {
    protected String usage;

    public void showUsage() {
        showProperty();
        System.out.println("Usage by Child Two: " + usage);
    }
}
public class PropertyManagement {
    public static void main(String[] args) {

        ChildOne c1 = new ChildOne();
        c1.landArea = 2000;
        c1.propertyType = "Ancestral House";
        c1.usage = "Residential Purpose";

        System.out.println("Child One Details");
        c1.showUsage();

        System.out.println();

        ChildTwo c2 = new ChildTwo();
        c2.landArea = 2000;
        c2.propertyType = "Ancestral House";
        c2.usage = "Rental Purpose";

        System.out.println("Child Two Details");
        c2.showUsage();
    }
}
