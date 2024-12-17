package javaeleven.to.javaseventeen.sealed.interfaces;

public sealed interface Rectangle extends Shape permits TransparentRectangle {
    String type();
}
