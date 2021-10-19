
public class Flight extends Employee{
	String FlightName;
	String FlightModel;
	public Flight(String FlightName,String FlightModel) {
		
		this.FlightName=FlightName;
		this.FlightModel=FlightModel;
		
	}
public Flight(String FlightName) {
		
		this.FlightName=FlightName;
		
		
	}
public void getInfoFlight() {
	System.out.println("Flight Name is=:"+FlightName +"FlightModel is:"+FlightModel);
	
}
}
