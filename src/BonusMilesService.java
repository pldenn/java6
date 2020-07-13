public class BonusMilesService {
    public int calculate(int cost) {
        int percentInKopecks = 2000;
        int bonus = cost / percentInKopecks;
        return bonus;
    }
}
