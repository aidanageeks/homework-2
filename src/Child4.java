class Child4 extends Parent implements Printable {
    private double child4Field;

    public Child4(String parentField, double child4Field) {
        super(parentField);
        this.child4Field = child4Field;
    }

    @Override
    public void print() {
        System.out.println("Parent Field: " + parentField);
        System.out.println("Child4 Field: " + child4Field);
    }
}
