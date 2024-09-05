class Point {
  // INSTANCE VARIABLE
  private int x;
  private int y;
  private boolean hasShip;
  private boolean userGuessed;
  private String userDisplay; // what user sees when board is printed
  private String compDisplay; // what comp sees when board is printed
  
  // BOARD IS MADE UP OF POINTS(each position on the board is a point)
  public Point(int myX, int myY) {
    x = myX;
    y = myY;
    hasShip = false;
    userGuessed = false;
    userDisplay = "[ .]";
    compDisplay = "[ .]";
  }

  // GET WHAT USER SEES
  public String getUserDisplay() {
    return userDisplay;
  }

  // GET WHAT COMPUTER SEES
  public String getCompDisplay() {
    return compDisplay;
  }

  // SET CORDINATE POINT
  public void setHasShip(boolean t) {
    hasShip = t;
  }

  public boolean getHasShip() {
    return hasShip;
  }

  public void setUserGuessed(boolean t) {
    userGuessed = t;
  }

  public boolean getUserGuessed() {
    return userGuessed;
  }

  public void setCompDisplayToShip() {
    compDisplay = "[🚢]";
  }
// SET USER DISPLAY TO EMOJI(Red x represents hit and white cirlce represents miss)(If user "hit" the ship a red x is placed on user board. If user "missed" the ship a white circle is placed on the user board)
  public void setUserDisplay() {
    if (hasShip == true) {
      userDisplay = "[❌]";
    } else if (hasShip == false) {
      userDisplay = "[⚪]";
    }
  }

}