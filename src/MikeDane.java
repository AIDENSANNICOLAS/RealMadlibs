import java.util.Scanner;

public class MikeDane {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

       System.out.println("What is today's month (1-12)?");
       int Month = keyboardInput.nextInt();

        System.out.println("What is today's Day (1-31)?");
        int Day = keyboardInput.nextInt();
        System.out.println("What is today's Year ?");
        int Year = keyboardInput.nextInt();


        keyboardInput.nextLine();
        System.out.println("Enter your name");
        String Name = keyboardInput.nextLine();

        System.out.println("Enter your pronoun --> (his/her/their)");
        String Pronoun =  keyboardInput.nextLine();

        System.out.println("Enter your pronoun --> (he/she/they)");
        String Pronoun2 =  keyboardInput.nextLine();

        System.out.println("Enter your favorite animal");
        String FavAnimal = keyboardInput.nextLine();

        System.out.println("Enter the noise your favorite animal makes");
        String FavAnimalNoise = keyboardInput.nextLine();

        System.out.println("Enter your second favorite animal");
        String SecondFavAnimal = keyboardInput.nextLine();

        System.out.println("Enter the noise your second favorite animal makes");
        String FavAnimalNoise2 = keyboardInput.nextLine();

        System.out.println("Enter your third favorite animal");
        String ThirdFavAnimal = keyboardInput.nextLine();

        System.out.println("Enter the noise your third favorite animal makes");
        String FavAnimalNoise3 = keyboardInput.nextLine();

        //PRINT TEXT STARTS HERE // DATE
        System.out.println("Today's date is " + Month + "/" + Day + "/" + Year );


        // FIRST FAV ANIMAL
        System.out.println("Old Mc" + Name + " had a farm, ");
        System.out.println("E I E I O");

        System.out.println("And on " + Pronoun + "farm " + Pronoun2 + " had a " + FavAnimal);
        System.out.println("E I E I O");

        System.out.println("With a " + FavAnimalNoise + "-" + FavAnimalNoise + " here");
        System.out.println("And a " + FavAnimalNoise + FavAnimalNoise + " there");
        System.out.println("Here a " + FavAnimalNoise + "," + " there a " + FavAnimalNoise);
        System.out.println("Everywhere a " + FavAnimalNoise + "-" + FavAnimalNoise);

        System.out.println("Old Mc" + Name + " had a farm, ");
        System.out.println("E I E I O");

        System.out.println();
        //SECOND FAV Nav >
        System.out.println("Old Mc" + Name + " had a farm, ");
        System.out.println("E I E I O");

        System.out.println("And on " + Pronoun + " farm " + Pronoun2 + " had a " + SecondFavAnimal);
        System.out.println("E I E I O");

        System.out.println("With a " + FavAnimalNoise2 + "-" + FavAnimalNoise2 + " here");
        System.out.println("And a " + FavAnimalNoise2 + FavAnimalNoise2 + "there");
        System.out.println("Here a " + FavAnimalNoise2 + "," + "there a " + FavAnimalNoise2);
        System.out.println("Everywhere a " + FavAnimalNoise2 + "-" + FavAnimalNoise2);

        System.out.println("Old Mc" + Name + " had a farm, ");
        System.out.println("E I E I O");

        System.out.println();
        //THIRD FAV
        System.out.println("Old Mc" + Name + " had a farm, ");
        System.out.println("E I E I O");

        System.out.println("And on " + Pronoun + " farm " + Pronoun2 + " had a " + ThirdFavAnimal);
        System.out.println("E I E I O");

        System.out.println("With a " + FavAnimalNoise3 + "-" + FavAnimalNoise3 + " here");
        System.out.println("And a " + FavAnimalNoise3 + "-" + FavAnimalNoise3 + " there");
        System.out.println("Here a " + FavAnimalNoise3 + "," + "there a " + FavAnimalNoise3);
        System.out.println("Everywhere a " + FavAnimalNoise3 + "-" + FavAnimalNoise3);

        System.out.println("Old Mc" + Name + " had a farm, ");
        System.out.println("E I E I O");

        System.out.println();
    }
}
