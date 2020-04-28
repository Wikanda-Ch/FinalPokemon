import java.util.ArrayList;

public class Trainner {
    private ArrayList<Pokemon> bag = new ArrayList<Pokemon>();
    private int berry;

    public Trainner(){
        
    }
    public void setPokemon(Pokemon p){
        bag.add(p);
    }
    public Pokemon getPokemon(int i){
        try{
            return bag.get(i);
        }catch(ArrayIndexOutOfBoundsException e){
            return bag.get(0);
        }finally{
            return bag.get(0);
        }
        
    }
    public void setBerry(){
        this.berry++;
    }
    public int getBerry(){
        return this.berry;
    }
    public ArrayList<Pokemon> getArrayP(){
        return bag;
    }

}