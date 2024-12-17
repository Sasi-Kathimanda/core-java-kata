package javaeleven.to.javaseventeen.sealed.interfaces;

public sealed interface Shape permits Rectangle, Circle {
    void draw();
}
