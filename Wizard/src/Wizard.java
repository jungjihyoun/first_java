public class Wizard {
    protected int hp;
    protected int mp ;
    private String name;

    public void setHp(int Hp){
        hp = Hp;
    }

    public int getHp(){
        return hp;
    }


    public Wizard (String name){
        this.name = name;
        hp = 10;
        mp = 90;
    }

    public void manaBall(){
        mp -= 10;
    }

    public void displayStatus(){
        System.out.println(hp);
        System.out.println(mp);
        System.out.println(name);
    }


}
