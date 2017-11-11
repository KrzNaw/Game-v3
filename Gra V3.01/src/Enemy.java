public class Enemy extends GenericCharacter {

    private int attackPoints;
    private int deffencePoints;
    private int healthPoints;
    private String playerName;

    @Override
    public int attack(GenericCharacter genericCharacter) {
        return 0;
    }

    @Override
    public int totalAttackPoints(GenericCharacter genericCharacter) {
        return 0;
    }

    @Override
    public int totalDefencePoints(GenericCharacter genericCharacter) {
        return 0;
    }
}
