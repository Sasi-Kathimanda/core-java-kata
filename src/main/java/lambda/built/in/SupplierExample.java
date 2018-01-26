package lambda.built.in;

import java.util.function.Supplier;

/**
    Definition: A Supplier does the opposite of the <Consumer>,takes no argument and only returns some value.
    Method Definition: () -> T
 **/

public class SupplierExample {
    public static void main(String[] args) {

        // using anonymous class
        String t = "Supplier";
        Supplier<String> supplierUsingAnonymousClazz =  new Supplier<String>() {
            @Override
            public String get(){
                return t.toLowerCase();
            }
        };
        System.out.println("supplierUsingAnonymousClazz - > "+supplierUsingAnonymousClazz.get());

        //using Lambda method

        Supplier<String> supplierUsingLambda = () -> t.toLowerCase();

        System.out.println("supplierUsingLambda - > "+supplierUsingLambda.get());

    }


}
