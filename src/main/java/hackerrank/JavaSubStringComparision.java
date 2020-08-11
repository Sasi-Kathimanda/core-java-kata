package hackerrank;

public class JavaSubStringComparision {
    public static void main(String[] args) {
        //System.out.println.);
        getSmallestAndLargest("SasiKiranRajaKathimanda",5);

    }

    public static void getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String firstElement = s.substring(0,k);

        for (int i = 0; i< s.length() & k<= s.length(); i++,k++) {

            if(firstElement.compareTo(s.substring(i,k)) <= 0) {
                largest = s.substring(i,k);
            } else {
                smallest = s.substring(i,k);
            }
        }
        System.out.println("smallest ="+smallest+" largest="+largest);

        //return smallest + "\n" + largest;
    }
}
