public class BonusMilesService {
    public int calculate (int amountInKopecks){
        int percentInKopecks = 2000;
        int bonus = amountInKopecks / percentInKopecks;
        return bonus;

    }
}
