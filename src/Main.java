
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int amountInKopecks = 1_000_000;
        int miles = service.calculate(amountInKopecks);
        System.out.println(miles);
    }
}