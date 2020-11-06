package in.psg;

/*
Created by Saigopal 
for project java-enum
06-11-2020 15:55
*/

public enum IFlightCrewJob {
   FLIGHT_ATTENDANT("Flight Attendant"),
   COPILOT("First Officer"),
   PILOT("Captain");

   private String title;

   public String getTitle() {
      return title;
   }

   IFlightCrewJob(String title) {
      this.title = title;
   }
}
