public class Main {
    public static void main (String[] args) {
        findNumber();
    }
    public static void findNumber() {
        int[] numbers = new int[] {1,2,3,7,8,9};
        int sought = 4;
        boolean isThere=false;

        for ( int number :  numbers ) {
            if (number == sought) {
                isThere = true;
                break;
            }
        }
        String message="";
        if (isThere) {
            message = "Number found: "+sought;
            giveMessage(message);
        }else{
            System.out.println("Number is cannot found: "+sought);
        }
    }
    public static void giveMessage(String message) {
        System.out.println(message);
    }
}