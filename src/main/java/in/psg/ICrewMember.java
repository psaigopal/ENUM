package in.psg;

/*
Created by Saigopal 
for project java-enum
06-11-2020 16:02
*/

public class ICrewMember {

   IFlightCrewJob job;
   String name;

   public ICrewMember(IFlightCrewJob job, String name) {
      this.job = job;
      this.name = name;
   }

   public IFlightCrewJob getJob() {
      return job;
   }

   public void setJob(IFlightCrewJob job) {
      this.job = job;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
