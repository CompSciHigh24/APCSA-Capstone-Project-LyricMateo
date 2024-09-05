class Board {

  private static int Rows = 8;
  private static int Cols = 8;
  private static Point[][] grid;

  // private int player;
  // private int computer;
  // CONSTUCTOR
  public Board() {
    grid = new Point[Rows][Cols];
  }

  // RESET
  void resetBoard() {
    for (int x = 0; x < grid.length; x++) {
      for (int y = 0; y < grid[x].length; y++) {
        Point p = new Point(x, y);
        grid[x][y] = p;
      }
    }
  }

  // DRAWS PLAYER BOARD(What the user sees)
  public void drawPlayerBoard() {
    System.out.println("  0 " + "  1 " + "  2 " + "   3 " + "  4 " + "  5 " + "  6 " + "  7 ");
    for (int i = 0; i < grid.length; i++) {
      System.out.print(i);
      for (int k = 0; k < grid[i].length; k++) {
        System.out.print(grid[i][k].getUserDisplay());
      }
      System.out.println();
    }
  }

  // DRAWS COMPUTER BOARD(What computer sees)
  public void drawCompBoard() {
    System.out.println("  0 " + "  1 " + "  2 " + "   3 " + "  4 " + "  5 " + "  6 " + "  7 ");
    for (int i = 0; i < grid.length; i++) {
      System.out.print(i);
      for (int k = 0; k < grid[i].length; k++) {
        System.out.print(grid[i][k].getCompDisplay());

      }
      System.out.println();
    }
  }

  // PLACE SHIP ON COMPUTER BOARD
  public void placeShip(int x, int y) {
    Point current = grid[x][y];
    current.setHasShip(true);
    current.setCompDisplayToShip();
    // place ship at random on board
    //
  }

  // PLACES SHIP RANDOMLY ON BOARD
  public void placeRandomShip() {
    if (Math.random() * 1 < 0.5) {

      // VERTICAL SHIP
      int startRow = (int) (Math.random() * 7);
      int startCol = (int) (Math.random() * 5);

      Point c = grid[startRow][startCol];
      c.setHasShip(true);
      c.setCompDisplayToShip();

      Point d = grid[startRow + 1][startCol];
      d.setHasShip(true);
      d.setCompDisplayToShip();

      Point e = grid[startRow + 2][startCol];
      e.setHasShip(true);
      e.setCompDisplayToShip();
    } else {

      // HORIZONTAL SHIP
      int start = (int) (Math.random() * 7);
      int end = (int) (Math.random() * 5);

      Point f = grid[start][end];
      f.setHasShip(true);
      f.setCompDisplayToShip();

      Point g = grid[start][end + 1];
      g.setHasShip(true);
      g.setCompDisplayToShip();

      Point z = grid[start][end + 2];
      z.setHasShip(true);
      z.setCompDisplayToShip();

    }
  }

  // PLACE USER GUESS ON BOARD
  public void placeUserGuess(int x, int y) {
    Point current = grid[x][y];
    current.setUserGuessed(true);
    current.setUserDisplay();
  }

  // CHECKS IF ALL SHIPS HAVE BEEN HIT(if false the game will keep running)
  public boolean haveAllShipsBeenHit() {
    boolean allShips = true;
    for (int i = 0; i < grid.length; i++) {
      for (int c = 0; c < grid[0].length; c++) {
        if (grid[i][c].getHasShip() == true) {
          if (grid[i][c].getUserGuessed() == true) {
            allShips = true;
          } else {
            allShips = false;
            return allShips;
          }
        }
      }
    }
    return allShips;
  }
  // revealShip

  public boolean GameStillRunning() {
    return true;
  }

}