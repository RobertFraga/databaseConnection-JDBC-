import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("[1]: Access database");
        System.out.println("[2]: database");
        System.out.println("[3]: Selecting Database");
        System.out.println("[4]: create Tables");
        System.out.println("[5]: insert Record");
        System.out.print("Choose one: ");
        String choose = input.next();

        switch (choose) {
            case "1" -> databaseAccess.Access();
            case "2" -> database.dataBase();
            case "3" -> selection.dataBaseSelection();
            case "4" -> tables.dataBaseTables();
            case "5" -> recordAdder.adder();
            default -> main(null);
        }
    }
}