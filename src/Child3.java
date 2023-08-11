class Child3 extends Parent implements Printable {
    private int child3Field;

    public Child3(String parentField, int child3Field) {
        super(parentField);
        this.child3Field = child3Field;
    }

    @Override
    public void print() {
        System.out.println("Parent Field: " + parentField);
        System.out.println("Child3 Field: " + child3Field);
    }
}