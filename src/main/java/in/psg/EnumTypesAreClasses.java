package in.psg;

/*
Created by Saigopal 
for project java-enum
06-11-2020 16:00
*/

public class EnumTypesAreClasses {

   public static void main(String[] args) {
      ICrewMember vicky = new ICrewMember(IFlightCrewJob.PILOT,"vicky");
      ICrewMember adi = new ICrewMember(IFlightCrewJob.COPILOT,"adi");

      whoIsInCharge(vicky,adi);
   }

   static void whoIsInCharge(ICrewMember member1,ICrewMember member2) {
      ICrewMember theBoss = member1.getJob().compareTo(member2.getJob()) > 0
         ? member1 : member2;

      System.out.println(theBoss.getJob().getTitle()+" "+theBoss.getName()+" is the boss");
   }
}
