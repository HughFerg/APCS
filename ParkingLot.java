package Recursion;

public class ParkingLot
{
  public static void main(String[] args)
  {
    step(100); // argument represents number of steps required
  }
  
  public static boolean step(int dist) 
  {
    System.out.println("steps to go: " + dist);
    if (dist == 0) // base case
    {
      System.out.println("You made it!");
      return false;
    }

    else 
    {
      return true;
    }
  }
}