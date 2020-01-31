import java.util.ArrayList;
import java.util.Random;

class Team {

  /* --------------------------
     ------- VARIABLES --------
     -------------------------- */

  // STATIC VARIABLE
  static int MAX_GAMES = 10;
//This variable is used to limit the number of games the user can call
//in the command line argument

  // INSTANCE VARIABLES
  String city;
  //This variable stores the hometown of the team
  String mascot;
  //This variable stores the mascot of the team
  int wins;
  //This variable stores the number of wins of the team
  int losses;
  //This variable stores the number of losses of the team
  int total_points;
  //This variable stores the number of total points of the team


  /* ------------------------
     ------- METHODS --------
     ------------------------ */

  // CONSTRUCTOR
  Team(String city, String mascot) {
    this.city = city;
    //This initializes the city of the team from the argument
    this.mascot = mascot;
    //This initializes the mascot of the team from the argument
    this.wins = 0;
    //This initializes the number of wins of each team to 0
    this.losses = 0;
    //This initializes the number of losses of each team to 0
    this.total_points = 0;
    //This initializes the number of total points of each team to 0
    // Set the values of the instance variables here.
    // city and mascot should be set using the above parameters.
    // wins, losses, and total_points should be set to 0.

  }

  // GETTERS
  // Write 5 getters, one for each instance variable.
  String getCity() {
    return this.city;
    //This returns the city of the team
  }

  String getMascot() {
    return this.mascot;
    //This returns the mascot of the team
  }

  int getWins() {
    return this.wins;
    //This returns the total number of wins of the team
  }

  int getLosses() {
    return this.losses;
    //This returns the total number of losses of the team
  }

  int getTotal_points() {
    return this.total_points;
    //This returns the total points of the team
  }
  // SETTERS
  // Write 5 setters, one for each instance variable.
  void setCity(String city) {
    this.city = city;
    //This updates the city of the team from the argument
  }

  void setMascot(String mascot) {
    this.mascot = mascot;
    //This updates the variable storing the mascot of the team from the argument
  }

  void setWins(int wins) {
    this.wins = wins;
    //This updates the variable storing the number of wins from the argument
  }

  void setLosses(int losses) {
    this.losses = losses;
    //This updates the variable storing the number of losses from the argument
  }

  void setTotal_points(int total_points) {
    this.total_points = total_points;
    //This updates the variable storing the number of total points
    //from the argument
  }
  // PLAY METHOD
  // Write an instance method called play() as follows.
  boolean play(Team t2) {

    // Here's how to generate a random number in the range [0, 100)
    int team1_points = (int)Math.floor(Math.random() * 100);
    //This randomly generated number determines who will win each game

    // Now generate the number for team2_points, following the above.
    int team2_points = (int)Math.floor(Math.random() * 100);
    // There's a chance the two numbers will be the same. In that
    // case you'll want to regenerate the two numbers.
    // To do this, write a while loop whose condition is
    // team1_points is equal to team2_points,
    // and whose body is a repeat of the random number code above.
    while (team1_points == team2_points) {
      team1_points = (int)Math.floor(Math.random() * 100);
    }
    //If the number of points are equal for each team, team 1 will randomly
    //generate a new number

    // Next write an if-else statement to determine who wins.
    // If team1_points > team2_points, the calling team (this) wins.
    // Otherwise, the argument team, t2, wins. Within the if-else:
    // * Increment each team's wins or losses variable.
    // * Increment each team's total_points variable.
    // * Return true if the calling team wins, otherwise false.
    if (team1_points > team2_points) {
      this.setWins(this.getWins() + 1);
      //This updates the number of wins for team 1 by adding 1
      t2.setLosses(t2.getLosses() + 1);
      //This updates the number of losses for team 2 by adding 1
      this.setTotal_points(this.getTotal_points() + team1_points);
      //This updates the number of total points for team 1 by adding the number
      //of points they scored
      t2.setTotal_points(t2.getTotal_points() + team2_points);
      //This updates the number of total points for team 2 by adding the number
      //of points the scored
      return true;
    } else {
      t2.setWins(t2.getWins() + 1);
      //This updates the number of wins for team 2 by adding 1
      this.setLosses(this.getLosses() + 1);
      //This updates the number of losses for team 1 by adding 1
      t2.setTotal_points(t2.getTotal_points() + team2_points);
      //This updates the number of total points for team 2 by adding the number
      //of points the scored
      this.setTotal_points(this.getTotal_points() + team1_points);
      //This updates the number of total points for team 1 by adding the number
      //of points they scored
      return false;
    }

  }

  /* ------------------------
     ------- MAIN METHOD ----
     ------------------------ */

  // MAIN() METHOD
  public static void main (String[] args) {
    int n = Integer.parseInt(args[0]);
    if (n>MAX_GAMES) {
      throw new IllegalArgumentException("Too many games requested.");
    }
    //This will get thrown if the command line argument exceeds the limit (10)

    // Read in the first command line argument as an int.
    // If it is larger than the static variable MAX_GAMES,
    // quit the program by throwing an exception.
    // This is the code you can insert after the if-condition:
    // throw new IllegalArgumentException("Too many games requested.");


    // Here's an ArrayList of strings to keep track of who won each game.
    ArrayList<String> results = new ArrayList<String>();
    //This array list will store the winners of each game

    // Create two Team objects using your constructor.
    Team team1 = new Team("New York", "Giants");
    //This is the first team
    Team team2 = new Team("Buffalo", "Bills");
    //This is the second team

    // Have them play each other as many times as specified by the
    // command line argument. Each time they play, add the name of the
    // winner (city + mascot) to the ArrayList results.

    for (int i = 0; i < n; i++) {
      if (team1.play(team2)) {
        results.add(team1.getCity() + " " + team1.getMascot());
      } else {
      results.add(team2.getCity() + " " + team2.getMascot());
      }
    }
    //If true, then team 1 wins and team 1 will get added to the array list
    //Otherwise (else) if false, team 2 will get added into the array list

    // After the desired number of games, use a for-each loop with the
    // ArrayList to print out the name of the winning team for each game, e.g.,
    // "The Chestnut Hill Narwhals won!"
    for (int i = 0; i<results.size(); i++) {
      System.out.println("The " + results.get(i) + " won!");
      }
    //This loop iterates through the array list and prints out which team won
    //for each game

    // Using the getters for the wins and losses instance variables,
    // print out the record of wins and losses for each team, e.g.,
    // "Chestnut Hill Narwhals: 6 wins, 4 losses"
    System.out.println(team1.getCity() + " " + team1.getMascot() + ": " +
    team1.getWins() + " wins, " + team1.getLosses() + " losses");
    //This line prints out the number of wins and losses for team 1 with getters
    System.out.println(team2.getCity() + " " + team2.getMascot() + ": " +
    team2.getWins() + " wins, " + team2.getLosses() + " losses");
    //This line prints out the number of wins and losses for team 2 with getters

    // Print out which team won the whole series, e.g.,
    // "The Chestnut Hill Narwhals won the series."
    if (team1.getWins() > team2.getWins()) {
      System.out.println("The " + team1.getCity() + " " + team1.getMascot() +
      " won the series.");
      //If team 1 has more wins than team 2, then a print statement will say
      //That team 1 has won the series
    } else if (team1.getWins() == team2.getWins()) {
      System.out.println("The teams have tied in the series.");
      //If team 1 and team 2 have the same number of wins, then a print
      //statement will say that the two teams have tied in the series
    } else{
    System.out.println("The " + team2.getCity() + " " + team2.getMascot() +
    " won the series.");
      //If team 2 has more wins than team 1, then a print statement will say
      //That team 2 has won the series
  }
    // Print out the total number of points scored by each team, e.g.,
    // "The Chestnut Hill Narwhals scored 497 points."
    System.out.println("The " + team1.getCity() + " " + team1.getMascot() +
    " scored " + team1.getTotal_points() + " points.");
    //This print statement uses getters to state how many total points team 1
    //has scored
    System.out.println("The " + team2.getCity() + " " + team2.getMascot() +
    " scored " + team2.getTotal_points() + " points.");
    //This print statement uses getters to state how many total points team 2
    //has scored

  }

}
