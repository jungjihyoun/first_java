public class UniqueSheildItem extends UniqueItem{
    private int recoverAbility;

    public UniqueSheildItem(String nameOfItem,int recoverAbility) {
        super(nameOfItem);
        this.recoverAbility = recoverAbility;

    }
    public void recovery(Wizard name){
        name.setHp(name.getHp() + recoverAbility);
    }

}


