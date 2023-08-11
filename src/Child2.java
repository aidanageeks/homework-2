class Child2 extends Parent implements Printable {
    private String child2Field;

    public Child2(String parentField, String child2Field) {
        super(parentField);
        this.child2Field = child2Field;
    }

    @Override
    public void print() {
        System.out.println("Parent Field: " + parentField);
        System.out.println("Child2 Field: " + child2Field);
    }
}
