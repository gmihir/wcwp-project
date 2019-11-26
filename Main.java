import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Introduction();
}

    public static String wrapStars(String message) {
        String ret = "";

        for(int i = 0 ; i < message.length() + 2 ; i++) {
            ret += "*";
        }

        ret += "\n" + "*" + message + "*" + "\n";
        for(int i = 0 ; i < message.length() + 2 ; i++) {
            ret += "*";
        }
        return ret;
    }


    public static String wrapBars(String message) {
        String ret = "";

        for(int i = 0 ; i < message.length() + 2 ; i++) {
            ret += "-";
        }

        ret += "\n" + "|" + message + "|" + "\n";
        for(int i = 0 ; i < message.length() + 2 ; i++) {
            ret += "-";
        }
        return ret;
    }

    public static void Introduction() {
        System.out.println("Please enter your name:");
        Scanner scan = new Scanner(System.in);

        Player p = new Player(scan.nextLine());

        System.out.println(wrapStars("Welcome, " + p.getName()));

        System.out.println(p.getName() + ", you are now the leader of an island named Triton in the middle of the Pacific. Your goal is to lead your island nation" + "\n"
                + "to prosperity for the next 50 years. Your success will be measured by four main categories: ");

        System.out.println("\n -Gross Domestic Product (in millions of US Dollars) \n -Food Availability (in millions of tons of food) \n " +
                "-Energy (in megawatt hours) \n -Carbon Dioxide Emissions(in millions of tons)\n");

        System.out.println("This simulation activity will present you with realistic, practical challenges a leader will face over decades of rule. You must take " + "\n"
        + "measures that will keep your people happy while also protecting against future consequences from your expansion and industrialization. Each challenge you face will" + "\n"
        + "include a prediction of how your energy, money, CO2 emissions, and food availability will be affected. ");

        System.out.println("\nYour entire goal in this activity is to keep the global warming of Triton under 1.5 degrees C. Unfortunately, you have just found out" +"\n"
        + "global warming is an issue. The island has already warmed 0.1 C since the Industrial Revolution.");

        System.out.println("\nGood Luck!");

        System.out.println("\nPlease enter any key below to enter the simulation.");

        scan.nextLine();
        LevelOne();
    }

    public static void LevelOne() {
        System.out.println(wrapBars("LEVEL ONE - 1960"));

    }


}

class Player {

    private String name;
    private int level, money, energy, food, co2, temp;



    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getMoney() {
        return money;
    }

    public int getEnergy() {
        return energy;
    }

    public int getFood() {
        return food;
    }

    public int getCo2() {
        return co2;
    }

    public int getTemp() {
        return temp;
    }

}