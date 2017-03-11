package pl.sda.beans;

public class Bean {
    private boolean methodCalled = false;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void testMethod() {
        methodCalled = true;
    }
    public boolean isTestMethodCalled() {
        return methodCalled;
    }
}
