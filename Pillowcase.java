import java.util.*;
class Pillowcase{

  private ArrayList<Candy> candyTracker;
  private int candyCounter;

  Pillowcase()
  {
    candyTracker = new ArrayList<Candy>();
    candyCounter=0;
  }
  int getCounter()
  {
    return candyCounter;
  }
  void getCandy()
  {
    System.out.println("Trick or treat!");
    Random r=new Random();
    int randomInt=r.nextInt(100)+1;
    if(randomInt>=1&&randomInt<=10)
    {
      candyTracker.add(new Candy("M&M"));

    }
    else if(randomInt>=11&&randomInt<=30)
    {
      candyTracker.add(new Candy("Pink Starburst"));
    }
    else if(randomInt>=31&&randomInt<=47)
    {
      candyTracker.add(new Candy("Hershey's Bar"));
    }
    else if(randomInt>=48&&randomInt<=55)
    {
      candyTracker.add(new Candy("Milky Way"));
    }
    else if(randomInt>=56&&randomInt<=68)
    {
      candyTracker.add(new Candy("Twix"));
    }
    else if(randomInt>=69&&randomInt<=93)
    {
      candyTracker.add(new Candy("Reese's"));
    }
    else if(randomInt>=94&&randomInt<=100)
    {
      candyTracker.add(new Candy("Kit Kat"));
    }
    candyCounter++;
    System.out.println();

  }
  void printNumCandies()
  {
    int[] candyTypeCount= new int[7];
    String[] candyTypes={" M&M's"," Pink Starburst"," Hershey's Bar"," Milky Way"," Twix"," Reese's"," Kit Kats"};
    for(int i=0;i<candyTracker.size();i++)
    {
      if(candyTracker.get(i).getName().equals("M&M"))
      {
        candyTypeCount[0]++;
        
      }
      else if(candyTracker.get(i).getName().equals("Pink Starburst"))
      {
        candyTypeCount[1]++;
        
      }
      else if(candyTracker.get(i).getName().equals("Hershey's Bar"))
      {
        candyTypeCount[2]++;
        
      }
      else if(candyTracker.get(i).getName().equals("Milky Way"))
      {
        candyTypeCount[3]++;
        
      }
      else if(candyTracker.get(i).getName().equals("Twix"))
      {
        candyTypeCount[4]++;
        
      }
      else if(candyTracker.get(i).getName().equals("Reese's"))
      {
        candyTypeCount[5]++;
        
      }
      else if(candyTracker.get(i).getName().equals("Kit Kat"))
      {
        candyTypeCount[6]++;
        
      }
      
    }
    for(int i=0;i<candyTypeCount.length;i++)
    {
      if(candyTypeCount[i]!=0)
      {
        System.out.println("We got "+candyTypeCount[i]+candyTypes[i]);
      }

    }
  }


}