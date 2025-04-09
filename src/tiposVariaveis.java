import java.util.Locale;

public class tiposVariaveis {
    public static void main(String[] args) throws Exception {
        String product1= "Computer";
        String product2= "Office Desk";

        int age = 30;
        int code =5290;
        char gender= 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.println(product1 + ", which price is $" + price1);
        System.out.printf(product2 + ", whitch price is $%.2f%n",price2);

            System.out.println("Record: "+age+ "years old, code: "+ code+ " and gender: " + gender);

        System.out.printf("Measue witch eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.println("US decimal point: "+ measure);



    }
}
