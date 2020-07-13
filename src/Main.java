
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int cost = 1_000_000;
        int miles = service.calculate(cost);
        System.out.println("Hello, Jason. Thank you for your payment. Cost of flying = " + cost + " rub. Bonus miles = " + miles +".");
    }
}
