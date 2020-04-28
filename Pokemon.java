
public class Pokemon {

    private String name;
    private int HP, MP, lv;
    private int status[] = {HP, MP, lv};

    public Pokemon(String name){
        this.name = name;
        this.HP = 100;
        this.MP = 20;
        this.lv = 1;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getHP(){
        return this.HP;
    }
    public int getMP(){
        return this.MP;
    }
    public int getlv(){
        return this.lv;
    }
    public void lvUp(){
        this.HP += 10;
        this.MP += 10;
        this.lv += 1;
    }
}
