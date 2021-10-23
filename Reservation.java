public class Reservation {
	private String name;
	private String roomNum;
	
  public Reservation( String n, String rn)
	{
		name = n;
		roomNum = rn;
	}
	
  public String getRoomNumber()  
	{
		return roomNum;
	}
  
  public String getName() 
  {
	  return name;
  }
  
  public String toString() 
  {
	  return "Name: " + name + ", Room Number: " + roomNum;
  }

}
