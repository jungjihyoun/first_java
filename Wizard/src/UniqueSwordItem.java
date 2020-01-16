public class UniqueSwordItem extends UniqueItem{
    private int attackAbility;

    public UniqueSwordItem(String nameOfItem, int attackAbility) {
        super(nameOfItem);
        this.attackAbility = attackAbility;
    }

    public void attack(Wizard enemy){
        enemy.setHp(enemy.getHp() - attackAbility);
    }

}


