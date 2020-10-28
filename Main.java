import java.util.*;
class Main {
  public static void main(String[] args) {
    Pillowcase p = new Pillowcase();
    Scanner s = new Scanner(System.in);
    System.out.print("Happy Haloween, how many houses should we trick or treat at? ");
    int houseCount=s.nextInt();
    System.out.println();
    for(int i=0; i<houseCount; i++)
    {
      p.getCandy();
    }
    System.out.println("We have "+p.getCounter()+" candies");
    p.printNumCandies();



    }
}