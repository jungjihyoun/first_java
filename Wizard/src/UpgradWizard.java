import java.util.ArrayList;

public class UpgradWizard<ItemType> extends Wizard{
    String specialize;
    ArrayList<ItemType>itemContainer;

    public UpgradWizard(String name,String specialize) {
        super(name);
        this.specialize = specialize;
        itemContainer = new ArrayList<ItemType>();
    }


    public void earnItem(ItemType item){
        itemContainer.add(item);
    }

    public void specialBall(){
        mp -= 20;
    }

    public ItemType getItem(){
        return itemContainer.get(0);
    }



    public ArrayList<ItemType> showItembox(){
        return itemContainer;
    }
}

