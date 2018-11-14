public class Main {
    public static void main(String args[]){
        String Str = new String("Вітаємо вас в дома");

        returnText();
        System.out.println(Str.matches("(.*)вас(.*)"));

        returnText();
        System.out.println(Str.matches("вас"));

        returnText();
        System.out.println(Str.matches("Вітаємо(.*)"));


    }

    private static void returnText() {
        System.out.print("Повертаємо: " );
    }
}
