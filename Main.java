import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        Scanner scan = new Scanner(System.in);

        Player user= new Player(scan.nextLine());
        Introduction(user);
        LevelOne(user);
        LevelTwo(user);
        LevelThree(user);
        LevelFour(user);
        LevelFive(user);
        LevelSix(user);
        LevelSeven(user);
        LevelEight(user);
        Conclusion(user);

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
                + " require you to consider how your energy, money, CO2 emissions, and food availability will be affected. ");

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
        boolean isEnd = false;
        p.getProgress(isEnd);
        System.out.println("Your island of Triton is growing, and your people are buying cars like crazy. How do you deal with potential consequences of this...");
        int choice = promptUser("(1) Impose a national speed limit of 50 MPH to use less oil  \n(2) Invest in public transportation  \n(3) Let the market regulate itself\n",1,3);

        switch(choice) { /* CHOICE 1 */
            case 1:
                System.out.println("You have elected to impose a national speed limit. This option conserves energy and CO2 emissions in the short-term, but not throughout the decade as your \n" +
                        "people stop following it over time.");
                p.addEnergy(-10);
                p.addCO2(18);
                p.addTemp(0.2);
                break;
            case 2:
                System.out.println("You have elected to invest in public transportation. Although your government lost money initially, the system is now profitable. Additionally, CO2 emissions and energy \n" +
                        "consumption are down.");
                p.addMoney(50);
                p.addCO2(-6);
                p.addEnergy(12);
                p.addTemp(0.1);
                break;
            case 3:
                System.out.println("You have elected to let the market regulate itself. The capitalistic nature of the car companies has spiraled out of control, your GDP has increased at the cost of rampant CO2 emissions \n" +
                        "and energy consumption.");
                p.addMoney(65);
                p.addCO2(14);
                p.addEnergy(-20);
                p.addTemp(0.3);
                break;
            default:
                break;
        }

        System.out.println("\nRapid industrialization has led to pollution at waterways, contaminating water supplies for irrigation. How do you fix this... \n");
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

        System.out.println("\nLead poisoning is on the rise and your scientists suspect it is due to unregulated industrial outputs, what do you do...");
        int choice3 = promptUser("(1) Test all crop fields and stop food production on contaminated ones \n(2) Encourage consumers to only purchase food from ethical companies " +
                "\n(3) Add new regulations and force random inspections to ensure they are met",1,3);

        switch(choice3) {
            case 1:
                System.out.println("You have chosen to test all crop fields and stop food production on contaminated ones. This option drastically reduces food production and harms your GDP as the problem is extremely widespread");
                p.addFood(-40);
                p.addMoney(-30);
                p.addTemp(0.05);
                break;
            case 2:
                System.out.println("You have chosen to encourage consumers to only purchase food from ethical companies. This option is not successful in causing enough change and the problem continues.");
                p.addFood(-40);
                p.addMoney(-30);
                p.addEnergy(30);
                p.addTemp(0.05);
                break;
            case 3:
                System.out.println("You have chosen to add new regulations and force random inspections. This option is successful throughout the decade and beyond since it forces companies to consider their waste.");
                p.addFood(40);
                p.addMoney(-20);
                p.addEnergy(-10);
                p.addCO2(12);

        }

        isEnd = true;
        p.getProgress(isEnd);
        p.setLevel(2);

        System.out.println("\nPlease enter any key below to enter level two.");

        scan.nextLine();
    }



    public static void LevelTwo(Player p) {
        //Mihir - 1980
        Scanner scan = new Scanner(System.in);
        System.out.println("\n" + Main.wrapHash("LEVEL TWO - 1980"));
        boolean isEnd = false;
        p.getProgress(isEnd);

        System.out.println("Industrialization is still continuing throughout Triton...\n\n");

        System.out.println("In the Revelle province, a major oil spill has occurred. How do you deal with the fallout...");

        int choice1 = promptUser("(1) Invest money into alternative energy, even though it's inefficient\n(2) Impose more stringent regulations on oil companies\n(3) Fine the oil companies to force them to comply",1,3);

        switch(choice1) {
            case 1:
                System.out.println("You have chosen to invest money into alternative energy. Since it's inefficient, this approach reduces CO2 emissions a little bit but greatly reduces your GDP");
                p.addCO2(-20);
                p.addEnergy(12);
                p.addMoney(-200);
                p.addTemp(-0.05);
                break;
            case 2:
                System.out.println("You have chosen to impose more regulations onto the oil companies. This harms GDP and energy reserves, but cleans up the spill and reduces CO2 emissions");
                p.addMoney(-300);
                p.addEnergy(-20);
                p.addCO2(-25);
                p.addTemp(0.05);
                break;
            case 3:
                System.out.println("You have chosen to fine oil companies on their byproducts. This approach works throughout the decade and bolsters energy production.");
                p.addMoney(80);
                p.addEnergy(20);
                p.addTemp(0.05);
                break;
        }

        System.out.println("\nA scientist known as James Hansen reports the rise of CO2 is correlated to climate change. What will you do...");
        int choice2 = promptUser("(1) Trust consumers will make buying decisions that are environmentally conscious\n(2) Give Hansen a national stage and launch a government agency devoted to reducing CO2 emissions\n(3) Ignore Hansen and promote industry",1,3);

        switch(choice2) {
            case 1:
                System.out.println("You have chosen to trust consumers. This doesn't work in the capitalistic society of Triton wants the lowest prices. This greatly increases CO2 emissions.");
                p.addCO2(40);
                p.addMoney(60);
                p.addTemp(0.05);
                break;
            case 2:
                System.out.println("You have chosen to promote Hansen's findings and form the Environmental Protection Agency. This is beneficial as it causes widespread change.");
                p.addMoney(-100);
                p.addCO2(-50);
                p.addTemp(-0.05);
                break;
            case 3:
                System.out.println("You have chosen to ignore Hansen and promote domestic industry. This bolsters GDP but greatly hurts CO2 emissions and food supplies.");
                p.addMoney(400);
                p.addCO2(80);
                p.addTemp(0.1);
                p.addFood(-30);
                break;
        }

        System.out.println("\nA whistleblower has released internal documents from Shell and Exxon-Mobil that acknowledge global warming will be a result of their products. Your response?");

        int choice3 = promptUser("(1) Punish the companies and force them to develop eco-friendly products\n(2) Release the documents to the media\n(3) Fine the companies but let them continue",1,3);

        switch(choice3) {
            case 1:
                System.out.println("You have chosen to force the companies to develop environmentally responsible products. This temporarily hurts industry but contributes to reducing climate change");
                p.addMoney(-60);
                p.addCO2(10);
                p.addTemp(-.05);
                p.addFood(40);
                break;
            case 2:
                System.out.println("You have chosen to release the internal documents to the media. The corporations are able to control the narrative and mitigate any economic harm to their business.");
                p.addCO2(40);
                p.addTemp(0.05);
                p.addFood(20);
                break;
            case 3:
                System.out.println("You have chosen to fine the companies and let them continue. This does nothing to solve address the issue and CO2 emissions and artificial warming continue to increase.");
                p.addCO2(50);
                p.addTemp(0.1);
                p.addFood(30);
                break;
        }

        isEnd = true;
        p.getProgress(isEnd);
        p.setLevel(3);

        System.out.println("\nPlease enter any key below to enter level three.");

        scan.nextLine();
    }

    public static void LevelThree(Player p) {
        //Mihir - 1990
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n\n" + Main.wrapHash("LEVEL THREE - 1990"));
        boolean isEnd = false;
        p.getProgress(isEnd);

        System.out.println("**ALERT** \nThe United Nations has proposed the Kyoto Protocol. It aims to reduce CFC (a greenhouse gas) and CO2 concentrations in the atmosphere\n");
        int choice1 = promptUser("(1) Conditionally join the Kyoto Protocol\n(2) Join the Kyoto Protocol and ratify it immediately\n(3) Leave it for other countries to handle", 1,3);
        switch(choice1) {
            case 1:
                System.out.println("You have chosen to conditionally join the Kyoto Protocol. This is a good start to promoting environmentalism both within your population and a global stage, but doesn't have a huge effect.");
                p.addMoney(-20);
                p.addTemp(0.05);
                p.addCO2(20);
                p.addFood(40);
                break;
            case 2:
                System.out.println("You have chosen to unconditionally join the Kyoto Protocol and ratify it immediately. Although the initial cost of CO2 reduction measures hurts GDP, it's a good long-term investment and greatly reduces global warming.");
                p.addMoney(100);
                p.addTemp(-0.1);
                p.addCO2(-10);
                p.addFood(60);
                break;
            case 3:
                System.out.println("You have chosen to ignore the Kyoto Protocol and leave it for other countries to handle. This preserves your financial reserves but does nothing to stop the increasing environmental effects of expansion.");
                p.addMoney(200);
                p.addTemp(0.2);
                p.addCO2(100);
                p.addFood(-30);
                break;
        }

        System.out.println("\nStudies have shown industrial use of plastics is leading to excessive marine death around the island. How do you deal with this...");
        int choice2 = promptUser("(1) Start an awareness movement to reduce consumer usage of plastic straws and bags\n(2) Institute a “waste tax” on big companies to incentivize less waste\n(3) Ignore the study and promote domestic industry", 1,3);
        switch(choice2) {
            case 1:
                System.out.println("You have chosen to raise customer awareness and push for less consumer use of plastic goods. This approach simply does not act on the magnitude required to solve the issue and has minimal impact.");
                p.addMoney(20);
                p.addTemp(0.1);
                p.addCO2(40);
                p.addFood(-30);
                break;
            case 2:
                System.out.println("You have chosen to institute a waste tax on polluting companies. Through the decade, this approach is successful in saving marine lives and has the unintended byproduct of reducing gaseous emissions as well.");
                p.addMoney(-60);
                p.addTemp(0.05);
                p.addCO2(20);
                p.addFood(-40);
                break;
            case 3:
                System.out.println("You have chosen to ignore the scientific study. This path leads to a continual harm of marine life and also sets a precedent for companies to act in other environmentally irresponsible ways.");
                p.addMoney(400);
                p.addTemp(0.2);
                p.addCO2(100);
                p.addFood(-30);
                break;
        }

        System.out.println("\nOPEC is throttling gas prices to maintain their competitive hold and to also make more money. How do you handle this...");
        int choice3 = promptUser("(1)Implement policy to force car manufacturers to increase fuel efficiency\n(2)Promote electric vehicles to reduce foreign dependency and boost industry\n(3)Reduce civilian access to gas", 1,3);
        switch(choice3) {
            case 1:
                System.out.println("You have chosen to implement policy promoting fuel efficiency. This decision slows down the growth of CO2 emissions considerably and actually saves money in the long run.");
                p.addMoney(80);
                p.addTemp(0.05);
                p.addCO2(30);
                break;
            case 2:
                System.out.println("You have chosen to push for electric vehicle development. This is good policy since foreign dependence is reduced and more energy-efficient solutions are developed, this decision boosts GDP while also managing CO2 emissions responsibly.");
                p.addMoney(200);
                p.addCO2(10);
                break;
            case 3:
                System.out.println("You have chosen to reduce civilian access to gas. Although this is effective, the decision damages domestic industry and hurts overall productivity as a whole.");
                p.addMoney(-150);
                p.addTemp(0.05);
                p.addCO2(50);
                break;
        }


        isEnd = true;
        p.getProgress(isEnd);
        p.setLevel(4);

        System.out.println("\nPlease enter any key below to enter level four.");

        scan.nextLine();
    }

    public static void LevelFour(Player p) {
        //Mihir - 2000
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n\n" + Main.wrapHash("LEVEL FOUR - 2000"));
        boolean isEnd = false;
        p.getProgress(isEnd);


        System.out.println("\nThe growing demands of Triton require new mechanisms of energy production. What do you do to meet the new needs of your people?");
        int choice1 = promptUser("(1) Build more oil drills subsidized by private industry\n(2) Focus on finding external sources of energy like importing more oil from OPEC\n(3)Use it as an opportunity to transition towards renewables, although there is significant initial expense", 1,3);
        switch(choice1) {
            case 1:
                System.out.println("You have chosen to build more oil drills. This is the cheapest option as companies invest in the venture, but worsens the sustainability of Triton.");
                p.addMoney(2000);
                p.addTemp(0.2);
                p.addCO2(100);
                break;
            case 2:
                System.out.println("You have chosen to increase foreign energy dependency. This is poor policy as Triton is now more vulnerable to external influence and since the climate crisis is not being addressed.");
                p.addMoney(-800);
                p.addTemp(0.1);
                p.addCO2(60);
                break;
            case 3:
                System.out.println("You have seized the opportunity and invested in renewables. This costs money but cuts future CO2 emissions and mitigates the climate risks of future expansion.");
                p.addMoney(-400);
                p.addTemp(0.05);
                p.addCO2(30);
                break;
        }

        System.out.println("\nPowerful companies want to expand their operations deep into the forests of Triton. How do you respond...");
        int choice2 = promptUser("(1) Declare the forest as a protected area\n(2) Sell them the land and let them expand into the forests\n(3) Encourage a grassroots movement among your people to protect the forests", 1,3);
        switch(choice2) {
            case 1:
                System.out.println("You have chosen to declare the forest as a protected area. You miss out on some money from selling the land, but by preventing deforestation you keep the carbon in the trees and also keep your food supply.");
                p.addMoney(-300);
                p.addTemp(0.05);
                p.addCO2(50);
                p.addFood(40);
                break;
            case 2:
                System.out.println("You have chosen to sell the land to the corporations. This damages the local ecosystem and hurts both your food production and increases CO2 emissions as the carbon in the trees is now in the atmosphere. ");
                p.addMoney(2000);
                p.addTemp(0.2);
                p.addCO2(120);
                p.addFood(-50);
                break;
            case 3:
                System.out.println("You have chosen to encourage a movement among your people to stop the corporations. This is ineffective since the change is not happening at a high enough level, and the corporations end up expanding.");
                p.addMoney(400);
                p.addTemp(0.1);
                p.addCO2(80);
                p.addFood(40);
                break;
        }

        System.out.println("\nA study has shown eating meat (especially beef) contributes to greenhouse gas emissions, what do you do...");
        int choice3 = promptUser("(1) Let consumer demand for environmentally responsible food regulate the market\n(2) Implement a “beef tax” incentivizing consumers to eat other sources of protein\n(3) Do nothing", 1,3);
        switch(choice3) {
            case 1:
                System.out.println("You have chosen to trust the consumer and hope they demand environmentally responsible food. This doesn't work as most consumers are drawn in by the low prices of beef, leaving the problem as is.");
                p.addMoney(60);
                p.addTemp(0.05);
                p.addCO2(80);
                p.addFood(20);
                break;
            case 2:
                System.out.println("You have chosen to implement a beef tax. This is effective in incentivizing both companies and consumers to eating other proteins and helps slow the rise of temperature.");
                p.addMoney(30);
                p.addTemp(-0.05);
                p.addCO2(40);
                p.addFood(30);
                break;
            case 3:
                System.out.println("You have chosen to do nothing about the issue and maintain the status quo while electing to endure the consequences.");
                p.addMoney(10);
                p.addTemp(0.1);
                p.addCO2(60);
                p.addFood(-20);
                break;
        }

        isEnd = true;
        p.getProgress(isEnd);
        p.setLevel(5);

        System.out.println("\nPlease enter any key below to enter level five.");

        scan.nextLine();
    }

    public static void LevelFive(Player p) {
        //Rohil - 2010
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n\n" + Main.wrapHash("LEVEL FIVE - 2010"));
        boolean isEnd = false;
        p.getProgress(isEnd);

        System.out.println("With the growing technology, companies on Triton start looking for ways to make money faster..." + "\n\n");

        System.out.println("Due to the onset of fast fashion companies, people are buying significantly more clothes than they would otherwise, leading to the burning of clothes and releasing CO2 into the environment.");

        int choice1 = promptUser("(1)Launch a campaign to educate the public about what is happening here, encouraging them to buy fewer clothes.\n(2)Invest in new research to find better ways to reuse old clothes or dispose without hurting the environment.\n(3)Let people buy fewer clothes on their own, and hope the problem gets resolved on its own.",1,3);
        switch(choice1) {
            case 1:
                System.out.println("You have chose to launch a campaign to attempt to educate the public about these bad business practices. This approach has a small effect on a portion of the public due to your credibility.");
                p.addMoney(-50);
                //p.addEnergy(20);
                p.addTemp(0.1);
                p.addCO2(-5);
                break;
            case 2:
                System.out.println("You have chosen to invest in research. This reduces GDP in the short run, but greatly helps with CO2 emissions.");
                p.addMoney(-50);
                //p.addEnergy(20);
                p.addCO2(-30);
                p.addTemp(0.05);
                break;
            case 3:
                System.out.println("You have chosen to take no action against these companies. Your GDP benefits, but CO2 emissions and temperature are affected greatly");
                p.addMoney(25);
                p.addTemp(0.2);
                p.addCO2(40);
                break;
        }

        System.out.println("You find out that cruise companies are heavily polluting the water that they sail in due to the rules of Maritime law.");

        int choice2 = promptUser("(1)Collaborate with other nations to create a good system for regulating how much waste cruise companies can release into the environment.\n(2)Encourage customers to think twice about the harmful things that the companies are doing to the ocean.\n(3)Try to create other methods of vacations that people would enjoy, but are less harmful to the cruises.", 1, 3);
        switch(choice2)
        {
            case 1:
                System.out.println("You have chosen to collaborate with other countries in an attempt to regulate the pollution of the companies. This will greatly help reduce emissions, but will decrease GDP");
                p.addMoney(-50);
                p.addCO2(-20);
                p.addTemp(0.05);
                break;
            case 2:
                System.out.println("You have chose to launch a campaign telling customers about the harmful effects of cruises. This is somewhat effective in lowering emissions, but lowers GDP as a result.");
                p.addTemp(0.05);
                p.addMoney(-50);
                p.addCO2(-10);
                break;
            case 3:
                System.out.println("You have chosen to invest in looking for a more environmentally friendly alternative to cruises. This lowers GDP and does not have a very large effect on CO2 emissions as cruises are still as popular as ever");
                p.addTemp(0.1);
                p.addMoney(-50);
                break;
        }

        System.out.println("The Prime Minister of Canada approves a new oil pipeline to be built after making climate change one of his biggest campaign issues.");

        int choice3 = promptUser("(1)Arrange a meeting with the Canadian Prime Minister to find a better way to make the country more money.\n(2)Launch a campaign that slanders the Canadian government for going against their word.\n(3)Attack the company that is building the pipleine in Canada and try to shut them down.", 1, 3);
        switch(choice3) {
            case 1:
                System.out.println("You have chosen to meet with the Canadian PM. This meeting is successful and he finds a different way to increase his country's GDP.\n You have reduced the emissions. But have lost money on the time spent with the Canadian government.");
                p.addMoney(-50);
                p.addTemp(0.05);
                p.addCO2(-20);
                break;
            case 2:
                System.out.println("You have chosen to slander the Canadian PM. This lowers GDP and does not help, as the Canadian citizens are very prideful in their government.");
                p.addMoney(-100);
                p.addTemp(0.1);
                p.addCO2(20);
                break;
            case 3:
                System.out.println("You have chosen to attack the company. This lowers your GDP and does not deter the company from doing anything.");
                p.addMoney(-50);
                p.addTemp(0.1);
                p.addCO2(20);
                break;
        }
        isEnd = true;
        p.getProgress(isEnd);
        p.setLevel(6);

        System.out.println("\nPlease enter any key below to enter level six.");

        scan.nextLine();
    }

    public static void LevelSix(Player p) {
        //Rohil - 2020
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n\n" + Main.wrapHash("LEVEL SIX - 2020"));
        boolean isEnd = false;
        p.getProgress(isEnd);

        System.out.println("Electric Vehicle sales are down, due in large to battery range problems.");
        int choice1 = promptUser("(1)Give EV companies more government compensation.\n(2) Invest in battery technology to help EV companies keep selling\n(3)Rely on companies to find environmentally friendly alternatives to electric vehicles.", 1,3);
        switch(choice1) {
            case 1:
                System.out.println("You have chosen to give EV companies companies more compensation. This will decrease GDP but will overall decrease emissions.");
                p.addMoney(-50);
                p.addTemp(0.05);
                p.addCO2(-20);
                break;
            case 2:
                System.out.println("You have chosen to invest more in battery technology. This has caused your GDP to significantly decrease, but reduces emissions greatly, as more people buy EVs");
                p.addMoney(-75);
                p.addTemp(0.05);
                p.addCO2(-40);
                break;
            case 3:
                System.out.println("You have chosen to rely on the companies to find their own solutions. This method is very inefficient as the comapnies do not have enough funding.");
                p.addMoney(25);
                p.addTemp(0.1);
                p.addCO2(15);
                break;
        }

        System.out.println("Due to global warming, temperatures are up and a town on the shore of the island is threatened to be flooded.");

        int choice2 = promptUser("(1)Invest in new infastructure to try to prepare for possible floods.\n(2)Invest in disaster relief to prepare for upcoming floods.\n(3)Try to raise attention for climate change by pointing out the horrific efforts of the floods", 1,3);
        switch(choice2) {
            case 1:
                System.out.println("You have chosen to invest in new infastructure. This has no effect on emissions, and lowers the money.");
                p.addMoney(-50);
                p.addTemp(0.05);
                p.addCO2(10);
                break;
            case 2:
                System.out.println("You have chosen to invest in disaster relief to prepare for the incoming floods. This decreases GDP significantly and does nothing to reduce emissions.");
                p.addMoney(-75);
                p.addTemp(0.05);
                p.addCO2(10);
                break;
            case 3:
                System.out.println("You have chosen to try to raise attention about climate change through the harmful effects of this flood. This will reduce GDP greatly and will do nothing to change emissions.");
                p.addMoney(-100);
                p.addTemp(0.05);
                p.addCO2(10);
                break;
        }

        System.out.println("Due to global warming, drier areas of the islands are experiencing more wildfires than before.");

        int choice3 = promptUser("(1)Invest more money into the fire department so they can have more resources to combat the fires\n(2)Invest in fire preparation to be better equipped\n(3)Place regulations on companies to prevent them from emitting more CO2", 1,3);
        switch(choice3) {
            case 1:
                System.out.println("You have chosen to invest more money into the fire department. This lowers GDP but causes you to become more popular.");
                p.addMoney(-50);
                p.addTemp(0.05);
                p.addCO2(20);
                break;
            case 2:
                System.out.println("You have chosen to be more prepared for fires. This lowers GDP, and does not change emissions by much.");
                p.addMoney(-50);
                p.addTemp(0.05);
                p.addCO2(20);
                break;
            case 3:
                System.out.println("You have chosen to place regulations on companies to prevent them from emitting more CO2. This decreases GDP, but emissions decrease.");
                p.addMoney(-50);
                p.addTemp(0.05);
                p.addCO2(20);
                break;
        }


        isEnd = true;
        p.getProgress(isEnd);
        p.setLevel(7);

        System.out.println("\nPlease enter any key below to enter level seven.");

        scan.nextLine();
    }

    public static void LevelSeven(Player p) {
        //Rohil - 2030
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n\n" + Main.wrapHash("LEVEL SEVEN - 2030"));
        boolean isEnd = false;
        p.getProgress(isEnd);

        System.out.println("Technology continues to grow, and with it, the probability of the technology failing grows as well.");


        System.out.println("Technology continues to grow, and with it, the probability of the technology failing grows as well.");

        System.out.println("Toyota's hydrogen plant, which supplies all of the hydrogen for their hydrogren powered cars has their 2nd explosion in the past two years, causing toyota to consider shutting down their hydrogen plants and the manufacturing of the car.");

        int choice1 = promptUser("(1)Invest in technology to help Toyota make their plants safer.\n(2)Compensate Toyota for part of the damages, so that they can continue to produce clean air vehicles.\n(3)Allow Toyota to shut down their plant.\n", 1,3);
        switch(choice1) {
            case 1:
                System.out.println("You have chosen to invest in the technology to help Toyota create safer plants. This reduces your GDP temporarily, but decreases emissions and slows global warming.");
                p.addMoney(-50);
                p.addTemp(0.03);
                p.addCO2(-30);
                p.addFood(20);
                break;
            case 2:
                System.out.println("You have chosen to compensate Toyota for part of the damages, so that their plants can continue to stay open. This reduces GDP, but decreases emissions slightly.");
                p.addMoney(-50);
                p.addTemp(0.05);
                p.addCO2(-20);
                p.addFood(20);
                break;
            case 3:
                System.out.println("You have chosen to allow Toyota to shut down its hydrogen plants. This increases GDP, but greatly raises emissions and temperature.");
                p.addMoney(100);
                p.addTemp(0.15);
                p.addCO2(50);
                p.addFood(20);
                break;
        }

        System.out.println("The province of Marshall has decided to completely ban the use of gasoline cars. The police are able to arrest anyone they see driving a gasoline car.");
        int choice2 = promptUser("(1)Offer people under a certain income some sort of compensation to make the switch.\n(2)Work to change the law so that gasoline cars stop being sold, eventually leading to all vehicles being clean air.\n(3)Completely ignore the situation in Marshall and allow them to find a solution independently.", 1,3);
        switch(choice2) {
            case 1:
                System.out.println("You have chosen to offer certain people compensation to help make the switch easier. This reduces GDP significantly, but also reduces emissions significantly.");
                p.addMoney(-75);
                p.addTemp(0.005);
                p.addCO2(-70);
                p.addFood(20);
                break;
            case 2:
                System.out.println("You have chosen to work with the province to change the law and slowly decrease the gasoline cars. This does not change GDP, and slowly reduces emissions.");
                p.addMoney(10);
                p.addTemp(0.01);
                p.addCO2(-30);
                p.addFood(20);
                break;
            case 3:
                System.out.println("You have chosen to completely ignore the situation. This causes mass riots, and due to it, the Marshall providence needs money to repair everything. Emissions are also not affected much.");
                p.addMoney(-30);
                p.addTemp(0.1);
                p.addCO2(20);
                p.addFood(20);
                break;
        }

        System.out.println("A scientist comes out with a new theory about biofuels that could lead to them replacing fossil fuels.");
        int choice3 = promptUser("(1)Give the scientist money so that they can further research into this theory\n(2)Provide economic incentive for the scientists/company that complete the research on biofuels.\n(3)Ignore the findings of the scientist completely.", 1,3);
        switch(choice3) {
            case 1:
                System.out.println("You have chosen to give the scientist money. This decreases GDP, but greatly decreases emissions, as fossil fuel usage decreases signifcantly.");
                p.addMoney(-90);
                p.addTemp(0.01);
                p.addCO2(-50);
                p.addFood(20);
                break;
            case 2:
                System.out.println("You have chosen to provide some sort of recognition/award to the company that tests the theory of the scientist. This decreases GDP, and decreases emissions.");
                p.addMoney(-60);
                p.addTemp(0.02);
                p.addCO2(-30);
                p.addFood(20);
                break;
            case 3:
                System.out.println("You have chosen to ignore the findings of the researcher. This option makes you some more money, but overall does nothing to combat emissions.");
                p.addMoney(20);
                p.addTemp(0.1);
                p.addCO2(30);
                p.addFood(20);
                break;
        }

        isEnd = true;
        p.getProgress(isEnd);
        p.setLevel(8);

        System.out.println("\nPlease enter any key below to enter level eight.");

        scan.nextLine();
    }

    public static void LevelEight(Player p) {
        //Rohil - 2040
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n\n" + Main.wrapHash("LEVEL EIGHT - 2040"));
        boolean isEnd = false;
        p.getProgress(isEnd);

        System.out.println("Climate change has become a global concern, and the UN wants total emissions to be down to zero by the end of this decade.");

        System.out.println("The UN meets for the UN Conference in Madrid, and they want all emissions from vehicles to be 0 as soon as possible.");

        int choice1 = promptUser("(1)Invest in electric car chargers, so that they are as common as gas stations are.\n(2)Pressure car manufactures to produce more electric cars instead of gasoline cars.\n(3)Give car manufacturers money to invest in better battery technology to make EVs more popular.\n", 1,3);
        switch(choice1) {
            case 1:
                System.out.println("You have chosen to invest in more charging stations for electric cars. This makes people more motivated to buy an electric car. Your decisions decreases money temporarily, but also decreases emissions, as EV sales go up.");
                p.addMoney(-20);
                p.addTemp(0.01);
                p.addCO2(-30);
                p.addFood(20);
                break;
            case 2:
                System.out.println("You have chosen to pressure car manufacturers. This does nothing to GDP, and causes emissions to slightly decrease.");
                p.addMoney(20);
                p.addTemp(0.05);
                p.addCO2(-5);
                p.addFood(20);
                break;
            case 3:
                System.out.println("You have chosen to give car manufacturers more money to better the battery technology. This is slightly sucessful, and lowers your GDP, but drives down emissions");
                p.addMoney(-50);
                p.addTemp(0.02);
                p.addCO2(-20);
                p.addFood(20);
                break;
        }

        System.out.println("The UN decides that the next step to reducing emissions is within a single person's home.");
        int choice2 = promptUser("(1)Offer rebates for people who choose to install solar panels in their homes.\n(2)Make it a requirement to have energy conserving bulbs and other items.\n(3)Fine citizens who are not using renewable energy sources in their homes.\n", 1,3);
        switch(choice2) {
            case 1:
                System.out.println("You have chosen to offer rebates for solar panel users. This decreases GDP, but heavily decreases emissions.");
                p.addMoney(-50);
                p.addTemp(0.01);
                p.addCO2(-40);
                p.addFood(20);
                break;
            case 2:
                System.out.println("You have chosen to make energy saving a requirement in households. This doesn't impact GDP much, but also doesn't result in a huge emissions decrease.");
                p.addMoney(10);
                p.addTemp(0.05);
                p.addCO2(-5);
                p.addFood(20);
                break;
            case 3:
                System.out.println("You have chosen to fine citizens. This increases money, but causes some rage in citizens, making it not very effective in reducing emissions.");
                p.addMoney(20);
                p.addTemp(0.1);
                p.addCO2(10);
                p.addFood(20);
                break;
        }

        System.out.println("Finally, to completely reduce emissions to zero, garbage needs to be dealt with properly.");

        int choice3 = promptUser("(1)Invest in better ways to recycle garbage.\n(2)Invest in research to dispose of garbage without burning it.\n(3)Burn all garbage in an enclosed facility so that minimal CO2 escapes.\n", 1,3);
        switch(choice3) {
            case 1:
                System.out.println("You have chosen to invest in better recycling methods. This drives down GDP and slightly betters emissions.");
                p.addMoney(-30);
                p.addTemp(0.05);
                p.addCO2(-15);
                p.addFood(20);
                break;
            case 2:
                System.out.println("You have chosen to invest in better garbage disposal methods. This research is successful and has a significant impact on emissions.");
                p.addMoney(-40);
                p.addTemp(0.01);
                p.addCO2(-30);
                break;
            case 3:
                System.out.println("You have chosen to burn garbage. This idea fails miserably and while GDP slightly increases, emissions increase from before.");
                p.addMoney(15);
                p.addTemp(0.15);
                p.addCO2(50);
                p.addFood(20);
                break;
        }

        isEnd = true;
        p.getProgress(isEnd);
        p.setLevel(0);

        System.out.println("\nPlease enter any key to continue.");

        scan.nextLine();
    }

    public static void Conclusion(Player p) {
        //Rohil
        System.out.println();
        if(p.getTemp() <= 1.5) {
            System.out.println("Congratulations, " + p.getName() + "! Thanks to you, the island of Triton is a well-functioning society that has been very successful in preventing" + "\n" + "the global temperatures from skyrocketting.");
            System.out.println("The people of Triton tremendously appreciate everything you have done for them, especially as the harmful effects of global warming have" + "\n" + "become better understood.");
            System.out.println("Your country's ending GDP was:$ " + p.getMoney());
            System.out.println("Your country's ending emissions were: " + p.getCo2() + " million tons");
            System.out.println("Your country's ending food supply was: " + p.getFood() + " million tons");
            System.out.println("Due to your actions, the global temperature raised only by " + p.getTemp() + "degrees!");
            System.out.println("You will go down in history as an excellent leader!");
        }
        else {
            System.out.println("You have failed. The global temperatures have risen by over 1.5 degrees celcius and global warming is rampant. You have pushed society past the point of recovery.");
        }


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


    public void getProgress(boolean b)
    {
        int moneyDiff = money-7325;

        String mDiff = moneyDiff + " from start";
        if(moneyDiff > 0)
            mDiff = "+" + mDiff;

        int energyDiff = energy-105;

        String eDiff = energyDiff + " from start";
        if(energyDiff > 0)
            eDiff = "+" + eDiff;

        int foodDiff = food-400;

        String fDiff = foodDiff + " from start";
        if(foodDiff > 0)
            fDiff = "+" + fDiff;

        int co2Diff = co2-315;

        String cDiff = co2Diff + " from start";
        if(co2Diff > 0)
            cDiff = "+" + cDiff;

        System.out.println("\nMoney: " + money + "(" + mDiff + ")" + "\nEnergy: " + energy + "(" + eDiff + ")" +  "\nFood: " + food + "(" + fDiff + ")" +  "\nCO2 Emissions: " + co2 + "(" + cDiff + ")");


        temp = Math.round((temp) * 100) / 100.0; // to deal with floating point errors
        System.out.println(Main.wrapBars("Global Warming: " + temp + " C "));
        if(b) {
            System.out.println(Main.wrapStars("LEVEL " + (level) + " COMPLETED"));
        }


    }

}