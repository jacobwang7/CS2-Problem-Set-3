import java.util.ArrayList;
import java.util.Random;

class Team {

  /* --------------------------
     ------- VARIABLES --------
     -------------------------- */

  // STATIC VARIABLE
  static int MAX_GAMES = 10;

  // INSTANCE VARIABLES
  String city;
  String mascot;
  int wins;
  int losses;
  int total_points;


  /* ------------------------
     ------- METHODS --------
     ------------------------ */

  // CONSTRUCTOR
  Team(String city, String mascot) {
    // Set the values of the instance variables here.
    // city and mascot should be set using the above parameters.
    // wins, losses, and total_points should be set to 0.

  }

  // GETTERS
  // Write 5 getters, one for each instance variable.


  // SETTERS
  // Write 5 setters, one for each instance variable.


  // PLAY METHOD
  // Write an instance method called play() as follows.
  boolean play(Team t2) {

    // Here's how to generate a random number in the range [0, 100)
    double team1_points = Math.floor(Math.random() * 100);

    // Now generate the number for team2_points, following the above.

    // There's a chance the two numbers will be the same. In that
    // case you'll want to regenerate the two numbers.
    // To do this, write a while loop whose condition is
    // team1_points is equal to team2_points,
    // and whose body is a repeat of the random number code above.



    // Next write an if-else statement to determine who wins.
    // If team1_points > team2_points, the calling team (this) wins.
    // Otherwise, the argument team, t2, wins. Within the if-else:
    // * Increment each team's wins or losses variable.
    // * Increment each team's total_points variable.
    // * Return true if the calling team wins, otherwise false.

    // I am inserting this dummy return statement so the program
    // will compile. You should delete this line when you write
    // this method.
    return true;

  }

  /* ------------------------
     ------- MAIN METHOD ----
     ------------------------ */

  // MAIN() METHOD
  public static void main (String[] args) {
    // Read in the first command line argument as an int.
    // If it is larger than the static variable MAX_GAMES,
    // quit the program by throwing an exception.
    // This is the code you can insert after the if-condition:
    // throw new IllegalArgumentException("Too many games requested.");


    // Here's an ArrayList of strings to keep track of who won each game.
    ArrayList<String> results = new ArrayList<String>();

    // Create two Team objects using your constructor.


    // Have them play each other as many times as specified by the
    // command line argument. Each time they play, add the name of the
    // winner (city + mascot) to the ArrayList results.


    // After the desired number of games, use a for-each loop with the
    // ArrayList to print out the name of the winning team for each game, e.g.,
    // "The Chestnut Hill Narwhals won!"


    // Using the getters for the wins and losses instance variables,
    // print out the record of wins and losses for each team, e.g.,
    // "Chestnut Hill Narwhals: 6 wins, 4 losses"


    // Print out which team won the whole series, e.g.,
    // "The Chestnut Hill Narwhals won the series."

    // Print out the total number of points scored by each team, e.g.,
    // "The Chestnut Hill Narwhals scored 497 points."


  }

}
