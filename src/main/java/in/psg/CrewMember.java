package in.psg;

/*
Created by Saigopal 
for project java-enum
06-11-2020 15:38
*/

public class CrewMember {
   FlightCrewJob flightCrewJob;
   String name;

   public CrewMember(FlightCrewJob flightCrewJob, String name) {
      this.flightCrewJob = flightCrewJob;
      this.name = name;
   }

   public FlightCrewJob getFlightCrewJob() {
      return flightCrewJob;
   }

   public void setFlightCrewJob(FlightCrewJob flightCrewJob) {
      this.flightCrewJob = flightCrewJob;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
