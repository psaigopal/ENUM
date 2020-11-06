package in.psg;

/*
Created by Saigopal 
for project java-enum
06-11-2020 15:23
*/

public class BasicEnumTest {

   public static void main(String[] args) {
      FlightCrewJob job1 = FlightCrewJob.FLIGHT_ATTENDANT;
      FlightCrewJob job2 = FlightCrewJob.COPILOT;
      FlightCrewJob job3 = FlightCrewJob.PILOT;

      if(job1 == FlightCrewJob.FLIGHT_ATTENDANT)
         System.out.println("job1 is FLIGHT_ATTENDANT");
      if(job2 != job3)
         System.out.println("job2 and job3 are different");

      displayJobResponsibilities(job1);
      displayJobResponsibilities(job2);
      displayJobResponsibilities(job3);
   }


   public static void displayJobResponsibilities(FlightCrewJob flightCrewJob) {
      switch (flightCrewJob) {
         case FLIGHT_ATTENDANT:
            System.out.println("Assure passenger safety");
            break;
         case COPILOT:
            System.out.println("Assist in flying the plane");
            break;
         case PILOT:
            System.out.println("Flies the plane");
            break;
      }
   }


}
