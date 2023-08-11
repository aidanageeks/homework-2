public class Main {
    public static void main(String[] args) {
        Child2 child2 = (Child2) createObject("2й", "Parent Value", "Child2 Value");
        Child3 child3 = (Child3) createObject("3й", "Parent Value", 42);
        Child4 child4 = (Child4) createObject("4й", "Parent Value", 3.14);

        Printable[] objects = { child2, child3, child4 };

        for (Printable obj : objects) {
            obj.print();
            System.out.println();
        }
    }

    public static Parent createObject(String className, String parentField, Object childField) {
        Parent obj = null;

        switch (className) {
            case "2й":
                obj = new Child2(parentField, (String) childField);
                break;
            case "3й":
                obj = new Child3(parentField, (int) childField);
                break;
            case "4й":
                obj = new Child4(parentField, (double) childField);
                break;
            default:
                System.out.println("Invalid class name");
        }

        return obj;
    }
}