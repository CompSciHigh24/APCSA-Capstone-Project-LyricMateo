import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Welcome / Instructions
    System.out.println();
    System.out.println("WELCOME TO BATTLESHIP");
    System.out.println();
    System.out.println(
        "There are 2 enemy ships(6 total cordinates) placed    randomly on the board and your mission is to destroy  all of them!!!!!");

    // KEY(Players need to know what hit or miss mean)
    System.out.println("[❌] = HIT");
    System.out.println("[⚪] = MISS");

    System.out.println();
    System.out.println();

    int turns = 15;

    // Board creation(Creates 2Darray)
    Board gameBoard = new Board();
    gameBoard.resetBoard();

    // Draw the boards
    // System.out.println("COMPUTER BOARD");
    gameBoard.placeRandomShip();
    gameBoard.placeRandomShip();
    // gameBoard.drawCompBoard();
    System.out.println();

    // USER GUESS CREATION
    System.out.println("USER BOARD");
    System.out.println("You have " + turns + " moves left");

    gameBoard.drawPlayerBoard();

    Scanner myObj = new Scanner(System.in);
    int attack;
    int attack2;
    int mateo = 0;
    // RUNS UNTIL TURNS RUN OUT
    while (turns > 0 && mateo == 0) {
      System.out.println("What row do you want?");

      attack = myObj.nextInt();
      System.out.println("Row is: " + attack);

      System.out.println("What column do you want?");

      attack2 = myObj.nextInt();
      System.out.println("Column is: " + attack);
      gameBoard.placeUserGuess(attack, attack2);

      gameBoard.drawPlayerBoard();
      turns--;
      System.out.println("You have " + turns + " moves left");
      // WIN
      if (gameBoard.haveAllShipsBeenHit() == true) {
        System.out.println();
        System.out.println("YOU WON ALL SHIPS HAVE BEEN HIT!!!");
        mateo++;
      }

    }
    // LOSE
    if (gameBoard.haveAllShipsBeenHit() == false) {
      System.out.println();
      System.out.println("YOU LOST");
      System.out.println();
      System.out.println("COMPUTER BOARD");
      System.out.println();
      gameBoard.drawCompBoard();
    }
  }
}
