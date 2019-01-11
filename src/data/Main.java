package data;
import java.util.Random;

public class Main {
    static boolean playing = false;
    static Characters gamer = new Characters(10, 20);
    static Characters hobbit = new Characters(0, 2);
    static Characters elf = new Characters(10, 10);
    static Characters king = new Characters(15, 15);
    static Characters knight = new Characters(12, 12);

    public static void main(String[] args){
        game();
    }

    public static void game(){
        Random random = new Random();
        int enemy = random.nextInt(4);
        System.out.println("The game started. Your power and hp are "+ gamer.power+", "+gamer.hp);
        playing = true;
        int count = 2;
        System.out.println("Your enemy is ...");
        switch(enemy){
            case 1:
                System.out.println("Hobbit");
                int p = hobbit.power;
                int h = hobbit.hp;
                break;
            case 2:
                System.out.println("Elf");
                p = elf.power;
                h = elf.hp;
                break;
            case 3:
                System.out.println("King");
                p = king.power;
                h = king.hp;
                break;
            case 4:
                System.out.println("Knight");
                p = knight.power;
                h = knight.hp;
                break;
        }
        while (playing){
            int a = random.nextInt(10);
            System.out.println("Health remaining "+Integer.toString(a));
            gamer.hp = gamer.attac(a);
            if(!gamer.isDead()){
                System.out.println("Gamer win");
                playing = false;
            }
            else{
                System.out.println("Gamer lose");
                playing = false;
            }


        }

    }

}
