import java.util.ArrayList;
import java.util.List;

import mp3.Student;

public class HotelReservation {

	private final String[]roomNumbers = {"100A" , "101A", "102A", "103A", "104A", "105A"};
 	private Reservation [] rooms;
 	private ArrayList<String> waitList;
 	
 	public HotelReservation() {
 		rooms = new Reservation [6];
 		waitList = new ArrayList <String>();
 	}
 	
 	public Reservation requestRoom (String name)
 	{
 		
 		for(int a = 0; a < rooms.length; a++)
 		{
 			if (rooms[a] == null)
 			{
 				Reservation newroom = new Reservation (name, roomNumbers[a]);
 				rooms[a] = newroom;
 				return newroom;
 			}
 			else {
 				waitList.add(name);
 			}
 		}
 		return null;
 	}
 	
 	public Reservation cancelReassign (String name)
 	{
 		for(int a = 0; a < rooms.length; a++)
 		{
 			if(rooms[a].getName() == name && waitList.size() != 0)
 			{
 				waitList.remove(0);
 				Reservation n = new Reservation(name, rooms[a].getRoomNumber());
 				rooms[a] = n;
 				return n;
 			}
 			if (waitList.size() == 0)
 			{
 				rooms[a] = null;
 				return null;
 			}
 			if(rooms[a].getName() == null)
 			{
 				return null;
 			}

 		}
 		return null;
 		
 	}
 	
 	public String toString () {
 		String z = "";
 		for (int a = 0; a < roomNumbers.length; a++)
 		{
 			z += roomNumbers[a] + " | ";
 		}
 		z += "\n";
 		for (int b = 0; b < rooms.length; b++)
 		{
 			z += rooms[b] + " | ";
 	
 		}
 		z += "\n";
 		z += waitList;
 		return z;
 		
 	}

}
