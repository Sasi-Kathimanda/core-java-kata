package java11tojava17.sealed.interfaces;

public class Circle implements Shape {
    private String outcome;
    @Override
    public void draw() {
        this.outcome = "circle drawn";
    }

    public String getOutcome() {
        return outcome;
    }
}
