import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        UpgradWizard <UniqueItem> kim = new UpgradWizard<UniqueItem>("kim","water");

        UpgradWizard <UniqueItem> jung = new UpgradWizard<UniqueItem>("jung","fire");


        UniqueItem knife = new UniqueSwordItem("knife",5);
        UniqueItem sheild = new UniqueSheildItem("sheild",10);

        kim.earnItem(knife);
        jung.earnItem(sheild);
        ((UniqueSwordItem) (kim.getItem())).attack(jung);

        jung.displayStatus();

        ((UniqueSheildItem) (jung.getItem())).recovery(jung);

        jung.displayStatus();

        for(int i = 0 ; i <= jung.showItembox().size()-1 ; i++){
            System.out.println(jung.showItembox().get(i).getName());
        }

        Iterator<UniqueItem> myIterator = jung.showItembox().iterator();
        while (myIterator.hasNext()) {
            UniqueItem u = myIterator.next();
            System.out.println(u.getName());
        }


    }
}

