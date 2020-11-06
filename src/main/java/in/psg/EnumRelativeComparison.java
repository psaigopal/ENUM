package in.psg;

/*
Created by Saigopal 
for project java-enum
06-11-2020 15:39
*/

public class EnumRelativeComparison {

   public static void main(String[] args) {
      CrewMember sai = new CrewMember(FlightCrewJob.PILOT,"saigopal");
      CrewMember deepak = new CrewMember(FlightCrewJob.FLIGHT_ATTENDANT,"deepak");

      whoIsInCharge(sai,deepak);

      FlightCrewJob[] jobs = FlightCrewJob.values();
      for (FlightCrewJob job : jobs) {
         System.out.println(job);
      }

      FlightCrewJob job = FlightCrewJob.valueOf("PILOT");
      System.out.println(job);

   }

   static void whoIsInCharge(CrewMember member1,CrewMember member2) {
      CrewMember theBoss = member1.getFlightCrewJob().compareTo(member2.getFlightCrewJob()) > 0
                           ? member1 : member2;

      System.out.println(theBoss.getName()+" "+"is the boss");
   }
}
