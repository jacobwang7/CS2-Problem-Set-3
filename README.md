# Problem Set 3: Writing a real Java class
## Due Friday, January 31, 11:59pm EST

This problem set will give you the opportunity to pratice your Java syntax while creating and using a Java class. 

---
### Reminders
If your code does not compile, you will get a 0. Don't submit code that doesn't compile! One way to avoid ending up with a program that you can't get to compile is to re-compile often. Every time you write a few lines that ought to compile, re-compile. 

For instance, in this program you'll start by writing a construtor. Write it (about 7 lines of code), then compile. Keep fixing it until it compiles. Then try it out in the `main()` method by creating a `Team` object. Work on it until it compiles. Then move onto the next task, ensuring each time that it compiles before proceeding to the following task.

You can push your changes to GitHub whenever you like. It is useful to use GitHub as a back-up. If your computer breaks or gets lost, you'll be very happy that you stored your partially completed code on GitHub.

Finally, don't forget to write comments in your code. I will gladly give you partial credit for code that doesn't do exactly what it's supposed to do if you write comments explaining what you did and why.


### Introduction
In the `src` directory, you will see a file called `Team.java`. **You will be modifying this file so look at it as you read this description.** This is a class that contains information (variables) and behaviors (methods) associated with a team that plays some sport. `Team` has two methods: a constructor and a method called `play()`. `Team` has the following instance variables:

```java
String city;
String mascot;
int wins;
int losses;
int total_points
```

`Team` also has one static variable, `MAX_GAMES`, which is set to 10. I will explain how to use this in the `main()` method, below.

### Your tasks
Here are your tasks:

1. Write a constructor that will create an instance of `Team` and will initialize the five instance variables. In the `Team.java` file, I have provided some of the code for the constructor, along with some helpful comments. You will fill in the rest.

2. Write getters and setters for each of the five instance variables. Look at the week 2 example code I provided in `Car.java` and in the Java appendix in the book for hints about how to write getters and setters.

3. Write an instance method called `play()`. The method will be called by an instance of the class and it will take as an argument a different instance of the class. Its return type will be `boolean`. I have provided some of the code for you, along with some comments.

    To simulate one team playing another, you will use `Math.random()` to generate a random number between 0 and 100 for each team. That number will represent the number of points that team scored. You will then compare those two numbers, and the team with the larger number of points will be the winner of that game.  
  
    The method will do the following after deciding the winner: (1) Using the setters, increment the winning team's `wins` variable by 1 and increment the losing team's `losses` variable by 1. (2) Using the setters, increment each team's `total_points` variable by the number of points they scored in the game. (3) Finally, return true if the calling `Team` won and return false if the argument `Team` won.

4. Write a `main()` method that tests your code as follows. Again, some of the code you need is already written for you in the `Team.java` file:

  * Read in the first command-line argument as an integer representing how many game should be played.
  * Make sure that it is less than the static variable `MAX_GAMES`. If it is more than `MAX_GAMES`, you will end the program by throwing this exception:
  ```java
  throw new IllegalArgumentException("Too many games requested.");
  ```
  * Create an empty ArrayList of String objects. This will store the winner of each game in a series.
  * Create a Team object with whatever city and mascot you wish.
  * Create a second Team object with whatever city and mascot you wish.
  * Play the specified number of games between the two teams. (Hint: use `play()` and a `for` loop!) After each game, add the name of the winner (i.e., the city + mascot) to the ArrayList of winning teams.
  * After the desired number of games, use the ArrayList to print out the name of the winning team for each game.
  * Using the `wins` and `losses` instance variables, print out the record of wins and losses for each team.
  * Print out which team won the whole series.
  * Print out which team scored the most points in the series.
  
### Pushing and verifying your submission

Once your code works to your satisfaction, push `Team.java` to your personal master repo on the GitHub Classroom site, as you did for ps1 and ps2. Use the commit message "READY FOR GRADING" so we know you are done. For a reminder about how to do this, see ps1.

As always, you can check to see if it worked by going to your account on GitHub and checking to see if it was updated and whether the files have changed in the way you expected. This is your responsibility.

---

## Important notes on grading

1. The only acceptable way to submit is through GitHub. If you do not submit via GitHub, you will get a 0.

2. The `Team.java` file **must be in the `src` directory**. You will lose 2 points if it is in the wrong directory.

3. Your code must compile. If your program does not compile, you will get a 0 for this problem set. If you are struggling and you aren't able to get in touch with me or the TAs, any TAs in the lab can help you compile your code.

  


