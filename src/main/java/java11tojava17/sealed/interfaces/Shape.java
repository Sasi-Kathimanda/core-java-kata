package java11tojava17.sealed.interfaces;

public sealed interface Shape permits Rectangle, Circle {
    void draw();
}
