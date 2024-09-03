import java.util.Scanner;

public class TextBasedGame {
    public static void main(String[] args) {
        //**********************STORY BASED GAME**********************
        // game for English_proj
        //user inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("It's 2016 and you are in a beach on your trip to Japan and see no trash in the sand");



        String enterkey = sc.nextLine();
        if (enterkey == "") {
            System.out.print("You later find out from the locals that they have many policies to protect the environment");
        }
        enterkey = sc.nextLine();
        if (enterkey == "") {
            System.out.print("Now you are reminiscing about the pollution crisis in the US");
        }
        enterkey = sc.nextLine();
        if (enterkey == "") {
            System.out.print("After you are back, you call the House of representatives and ask " +
                        "to reduce fossil fuel related pollutants");
        }
        enterkey = sc.nextLine();
        if (enterkey == "") {
            System.out.print("They refuse, stating that it was not possible under the current leadership because " +
                        "of Donald Trump's 'pro-fossil fuels' policy");
        }
        enterkey = sc.nextLine();
        if (enterkey == "") {
            System.out.print("A few years pass by and You hear on the news that everyone has to quarantine because of the " +
                        "COVID-19 virus.");
        }
        enterkey = sc.nextLine();
        if (enterkey == "") {
            System.out.print("You get excited because of the presidential election that is supposed to happen.");
        }
        enterkey = sc.nextLine();
        //election day and COVID-19
        if (enterkey == "") {
            System.out.print("It's election day and you decide and you have to vote for a president. " +
                        "Who do you vote for? 1-Trump or 2-Biden");
            int response = sc.nextInt();
            if (response == 1) {
                System.out.println("After the election you find out that Trump lost and Biden is the winner.");
            }
            else {
                System.out.println("Biden promises to get vaccines rolling as soon as possible and rejoins the " +
                            "Paris Agreement");

            }
            //a few years later
            if (enterkey == "") {
                System.out.print("A few more years pass by and you are now the CEO of a " +
                        "climate organization which aims to reduce pollutants by working with " +
                        "local governments");
            }
            System.exit(0);
        }
    }
}
