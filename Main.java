import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Introduction(); // just testing some stuff
}

    public String wrapStars(String message) {
        String ret = "";
        for(int i = 1 ; i < 4 ; i++)
        {
            for(int j = 0 ; j < message.length() + 3 ; j++)
            {
                if(i%2 == 1)
                    ret += "*";
            }
        }

    }

    public static void Introduction() {
        System.out.println("Please enter your name.");
        Scanner scan = new Scanner(System.in);

        Player p = new Player(scan.nextLine());

        System.out.println("You control the United Nations. The year is 1970, and scientists have begun to realize \n" +
                "there is a possibility human atmospheric pollution has damaged the natural ecosystem."); // i think i figured it out
    }

    public static void LevelOne() {


    }


}

public class Player {

    private String name;
    private int level;

    public Player(String name) {
        level = 0;
        this.name = name;
        System.out.println("Hello " + name + " ");
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

}