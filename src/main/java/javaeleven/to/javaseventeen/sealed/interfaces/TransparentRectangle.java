package javaeleven.to.javaseventeen.sealed.interfaces;

public final class TransparentRectangle implements Rectangle {
    @Override
    public String type() {
        return "Transparent";
    }

    @Override
    public void draw() {

    }
}
