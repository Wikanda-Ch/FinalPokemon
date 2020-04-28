
public class Pokemon {

    private String name1;
    private String name2;
    private String name3;
    private int HP1, MP1, lv1;
    private int HP2, MP2, lv2;
    private int HP3, MP3, lv3;
    //private int status[] = {HP, MP, lv};
    //private int status2[] = {HP2, MP2, lv2};
    //private int status3[] = {HP3, MP3, lv3};

    public Pokemon(){
        //this.name1;

        this.HP1 = 100;
        this.MP1 = 20;
        this.lv1 = 1;

        this.HP2 = 100;
        this.MP2 = 20;
        this.lv2 = 1;

        this.HP3 = 100;
        this.MP3 = 20;
        this.lv3 = 1;
    }
    public String getName1(){
        return this.name1;
    }
    public void setName1(String name1){
        this.name1 = name1;
    }
    public int getHP1(){
        return this.HP1;
    }
    public int getMP1(){
        return this.MP1;
    }
    public int getlv1(){
        return this.lv1;
    }
    public void lvUp1(){
        this.HP1 += 10;
        this.MP1 += 10;
        this.lv1 += 1;
    }

    public String getName2(){
        return this.name2;
    }
    public void setName2(String name2){
        this.name2 = name2;
    }
    public int getHP2(){
        return this.HP2;
    }
    public int getMP2(){
        return this.MP2;
    }
    public int getlv2(){
        return this.lv2;
    }
    public void lvUp2(){
        this.HP2 += 10;
        this.MP2 += 10;
        this.lv2 += 1;
    }

    public String getName3(){
        return this.name3;
    }
    public void setName3(String name3){
        this.name3 = name3;
    }
    public int getHP3(){
        return this.HP3;
    }
    public int getMP3(){
        return this.MP3;
    }
    public int getlv3(){
        return this.lv3;
    }
    public void lvUp3(){
        this.HP3 += 10;
        this.MP3 += 10;
        this.lv3 += 1;
    }
}
