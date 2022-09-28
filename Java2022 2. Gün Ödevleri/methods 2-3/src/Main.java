public class Main {
    public static void main(String[] args) {
        String message = "Today weather is so beautiful.";
        String newmessage = city();
        System.out.println(newmessage);
        int number = add(15,7);
        System.out.println(number);
        int added = add2(2,3,4);
        System.out.println(added);

    }

    public static void add() {
        System.out.println("Added");
    }
    public static void delete() {
        System.out.println("deleted");
    }
    public static int add(int number1, int number2) {
        return number1+number2;
     }
     public static int add2( int...numbers) {
        int add = 0;
        for (int number:numbers) {
            add += number;
        }
        return add;
     }
        public static String city() {
            return "Ankara";
        }
    }