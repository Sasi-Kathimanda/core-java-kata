package javaeleven.to.javaseventeen.sealed.interfaces;

public final class Circle implements Shape {
    private String outcome;
    @Override
    public void draw() {
        this.outcome = "circle drawn";
    }

    public String getOutcome() {
        return outcome;
    }
}
