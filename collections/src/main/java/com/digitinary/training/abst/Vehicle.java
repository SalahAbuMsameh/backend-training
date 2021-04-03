package com.digitinary.training.abst;

import java.time.LocalDate;

/**
 * 
 * Apr 3, 2021
 * @author Salah Abu Msameh
 */
public interface Vehicle {

	/**
	 * return manufacture date.
	 * @return
	 */
	LocalDate getManufactureDate();
	
	/**
	 * start vehicle engine.
	 * @return
	 */
	boolean startEngine();
}

//write abstract class BaseVehicle
//implement function getManufactureDate inside BaseVehicle
//Create two concrete classes (Car & Train)
//car1.startEngine should print "car engine started" then return true
//train1.startEngine should print "train engine started" then return true
//another concrete class GmcCar from Car and override startEngine should print "GMC Car engine started" then return true
