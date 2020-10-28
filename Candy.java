/*
  Owen Lottman

*/
import java.util.*;
class Candy{
  private String candyName;
  Candy()
  {
    candyName="";
  }
  Candy(String a)
  {
    candyName=a;
  }
  void setName(String a)
  {
    candyName=a;
  }
  String getName()
  {
    return candyName;
  }
  void printCandy()
  {
    System.out.println(candyName);
  }


}