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
    }   //`    `
    public static void LevelOne() {
        Scanner scan = new Scanner(System.in);
        System.out.println(wrapBars("LEVEL ONE - 1960"));
        //Mihir

        System.out.println("Your island of Triton is growing, and your people want you to build a university...");
        int choice = promptUser("(1) Option 1 \n(2) Option 2 \n(3) Option 3",1,3);
        System.out.println("You have picked Option " + choice);




    }
    public static void LevelTwo() {
        //Mihir
    }

    public static void LevelThree() {
        //Mihir
    }

    public static void LevelFour() {
        //Mihir
    }

    public static void LevelFive() {
        //Rohil
    }

    public static void LevelSix() {
        //Rohil
    }

    public static void LevelSeven() {
        //Rohil
    }

    public static void LevelEight() {
        //Rohil

    }

    public static void Conclusion() {
        //Rohil
        System.out.println("Congratulations, " + this.getName() + "! Thanks to you, the island of Triton is a well-functioning society that has been very successful in preventing\n the global temperatures from skyrocketting");
        System.out.println("The people of Triton tremendously appreciate everything you have done for them, especially as the harmful effects of global warming have\n become better understood.");
        System.out.println("You will go down in history as an excellent leader!");

        System.out.println(wrapStars("THE END"));
    }

    public static int promptUser(String message, int firstOption, int lastOption) {
        System.out.println(message);
        int input = -1;
        Scanner scan = new Scanner(System.in);
        boolean isValid = false;
        while(!isValid) {
            if (scan.hasNextInt()) {
                input = scan.nextInt();
                if(input >= firstOption && input <= lastOption)
                {
                    isValid = true;
                    return input;
                }
                else {
                    System.out.println("Please enter a valid option number.");
                    continue;
                }
            }
            else
            {
                System.out.println("Please enter a number.");
                scan.nextLine();
                continue;
            }
        }
        return -1;
    }




}

class Player {

    private String name;
    private int level, money, energy, food, co2;
    private double temp;



    public Player(String name) {
        this.name = name;
        level = 1;
        temp = 0.1;
        /* TODO
            Determine initial values for money, energy, food, co2
         */
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

    public double getTemp() {
        return temp;
    }

}