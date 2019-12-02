import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        Scanner scan = new Scanner(System.in);

        Player user= new Player(scan.nextLine());
        Introduction(user);
        LevelOne(user);

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

    public static String wrapHash(String message) {
        String ret = "";

        for(int i = 0 ; i < message.length() + 2 ; i++) {
            ret += "#";
        }

        ret += "\n" + "#" + message + "#" + "\n";
        for(int i = 0 ; i < message.length() + 2 ; i++) {
            ret += "#";
        }
        return ret;
    }

    public static void Introduction(Player p) {

        Scanner scan = new Scanner(System.in);

        System.out.println(wrapStars("Welcome, " + p.getName()));

        System.out.println(p.getName() + ", you are now the leader of an island named Triton in the middle of the Pacific. Your goal is to lead your island nation" + "\n"
                + "to prosperity for the next 80 years. Your progress will be measured by four main categories: ");

        System.out.println("\n -Gross Domestic Product (in millions of US Dollars) \n -Food Availability (in millions of tons of food) \n " +
                "-Energy (in megawatt hours) \n -Carbon Dioxide Emissions(in parts per million)\n");

        System.out.println("This simulation activity will present you with realistic, practical challenges a leader will face over decades of rule.\n\nYou must take "
                + "measures that will keep your people happy while also protecting against future consequences from your expansion and industrialization. \n\nEach challenge you face will"
                + "require you to consider how your energy, money, CO2 emissions, and food availability will be affected. ");

        System.out.println("\nYour entire goal in this activity is to keep the global warming of Triton under 1.5 degrees C. Unfortunately, you have just found out" +"\n"
                + "global warming is an issue. The island has already warmed 0.1 C since the Industrial Revolution.");

        System.out.println("\nGood Luck!");

        System.out.println("\nPlease enter any key below to enter the simulation.");

        scan.nextLine();
    }

    public static void LevelOne(Player p) {
        Scanner scan = new Scanner(System.in);
        System.out.println(wrapHash("LEVEL ONE - 1970"));
        //Mihir
        p.getProgress();
        System.out.println("Your island of Triton is growing, and your people are buying cars like crazy. How do you deal with potential consequences of this...");
        int choice = promptUser("(1) Impose a national speed limit of 50 MPH to use less oil  \n(2) Invest in public transportation  \n(3) Let the market regulate itself\n",1,3);

        switch(choice) { /* CHOICE 1 */
            case 1:
                System.out.println("You have elected to impose a national speed limit. This option conserves energy and CO2 emissions in the short-term, but not throughout the decade as your \n" +
                        "people stop following it over time.\n ");
                p.addEnergy(-10);
                p.addCO2(18);
                p.addTemp(0.2);
                break;
            case 2:
                System.out.println("You have elected to invest in public transportation. Although your government lost money initially, the system is now profitable. Additionally, CO2 emissions and energy \n" +
                        "consumption are down.\n");
                p.addMoney(50);
                p.addCO2(-6);
                p.addEnergy(12);
                p.addTemp(0.1);
                break;
            case 3:
                System.out.println("You have elected to let the market regulate itself. The capitalistic nature of the car companies has spiraled out of control, your GDP has increased at the cost of rampant CO2 emissions \n" +
                        "and energy consumption.\n");
                p.addMoney(65);
                p.addCO2(14);
                p.addEnergy(-20);
                p.addTemp(0.3);
                break;
            default:
                break;
        }

        System.out.println("\nRapid industrialization has led to pollution at waterways, contaminating water supplies for irrigation. How do you fix this... ");
        int choice2 = promptUser("(1) Establish legislation forcing polluters to implement technology to reduce impact  \n(2) Government enforced restrictions on industrialization at waterways " +
                " \n(3) Push for citizen initiative to organize waterway cleanups\n",1,3);

        switch(choice2) {
            case 1:
                System.out.println("You have chosen to establish legislation forcing polluters to develop technology to clean up after themselves. This path minimally hurts the economy as growth slows but protects your food supply.");
                p.addFood(20);
                p.addMoney(-30);
                break;
            case 2:
                System.out.println("You have chosen to restrict industrialization at waterways. This path protects food supplies but drastically hurts the economy and energy production.");
                p.addFood(20);
                p.addMoney(-1000);
                p.addEnergy(-40);
                break;
            case 3:
                System.out.println("You have chosen to push for a citizen initiative to organize waterway cleanups. This path is ineffective at reducing pollution even minimally, and the food supply is now dwindling.");
                p.addFood(-50);
                p.addMoney(50);
                p.addEnergy(60);
                p.addTemp(0.1);
                break;
            default:
                break;
        }

        p.getProgress();








    }










    public static void LevelTwo(Player p) {
        //Mihir - 1980
    }

    public static void LevelThree(Player p) {
        //Mihir - 1990
    }

    public static void LevelFour(Player p) {
        //Mihir - 2000
    }

    public static void LevelFive(Player p) {
        //Rohil - 2010
    }

    public static void LevelSix(Player p) {
        //Rohil - 2020
    }

    public static void LevelSeven(Player p) {
        //Rohil - 2030
    }

    public static void LevelEight(Player p) {
        //Rohil - 2040
    }

    public static void Conclusion(Player p) {
        //Rohil
        System.out.println();
        System.out.println("Congratulations, " + p.getName() + "! Thanks to you, the island of Triton is a well-functioning society that has been very successful in preventing" + "\n" + "the global temperatures from skyrocketting.");
        System.out.println("The people of Triton tremendously appreciate everything you have done for them, especially as the harmful effects of global warming have" + "\n" + "become better understood.");
        System.out.println("Your country's ending GDP was:$ " + p.getMoney());
        System.out.println("Your country's ending emissions were: " + p.getCo2() + " million tons");
        System.out.println("Your country's ending food supply was: " + p.getFood() + " million tons");
        System.out.println("Your country used " +p.getEnergy() + " MegaWatt hours.");
        System.out.println("Due to your actions, the global temperature raised only by " + p.getTemp() + "degrees!");
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
    public boolean winning;



    public Player(String name) {
        this.name = name;
        level = 1;
        temp = 0.1;
        money = 7325; // based on hawaii / 10
        co2 = 315; // based on hawaii and keeling curve (WE CAN CITE THIS)
        energy = 105; // based on https://www.eia.gov/state/seds/sep_use/total/pdf_cb/use_tot_HIcb.pdf (WE CAN CITE THIS)
        winning = true;
        food = 400;
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

    public void setLevel(int toSet) {
        level = toSet;
    }

    public void addMoney(int toAdd){
        money += toAdd;
    }

    public void addEnergy(int toAdd) {
        energy += toAdd;
    }

    public void addFood(int toAdd) {
        food += toAdd;
    }

    public void addCO2(int toAdd) {
        co2 += toAdd;
    }

    public void addTemp(double toAdd) {
        temp += toAdd;
    }

    public void setWinning(boolean b)
    {
        winning = b;
    }

    public void getProgress()
    {
        System.out.println("Money: " + money + "\nEnergy: " + energy + "\nFood: " + food + "\nCO2 Emissions: " + co2);
        temp = Math.round((temp) * 10) / 10.0; // to deal with floating point errors
        System.out.println(Main.wrapBars("Global Warming: " + temp + " C "));
    }

}