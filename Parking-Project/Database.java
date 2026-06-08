package Parking;
import java.util.*;
import java.time.LocalTime;

public interface Database {
   HashMap<Vehicle_Type,LocalTime> f1_Bike = new HashMap<>();
   HashMap<Vehicle_Type,LocalTime> f2_Bike = new HashMap<>();
   
   HashMap<Vehicle_Type,LocalTime> f1_Car= new HashMap<>();
   HashMap<Vehicle_Type,LocalTime> f2_Car = new HashMap<>();
   
   
}
