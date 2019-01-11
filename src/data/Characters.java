package data;

public class Characters {
    public int power;
    public int hp;

    public Characters(int power, int hp){
        this.power = power;
        this.hp = hp;
    }

    public boolean isDead(){
        if(this.hp<=0){
            return true;
        }
        else{
            return false;
        }
    }
    public int getpower(){return power;}
    public int gethp(){return hp;}
    public int attac(int att){
        this.hp -=att;
        return att;
    }
}
