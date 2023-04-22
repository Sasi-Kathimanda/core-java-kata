package java11tojava17.sealed.interfaces;

public final class TransparentRectangle implements Rectangle {
    @Override
    public String type() {
        return "Transparent";
    }

    @Override
    public void draw() {

    }
}
