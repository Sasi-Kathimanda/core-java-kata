package java11tojava17.sealed.interfaces;

public sealed interface Rectangle extends Shape permits TransparentRectangle {
    String type();
}
