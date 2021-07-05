package com.digitinary.training.builder;

/**
 * 
 * Jul 5, 2021
 * @author Salah Abu Msameh
 */
public class BuilderTest {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			
			//HouseBuilder currentHouseBuilderObj = new House.HouseBuilder(12);
			//HouseBuilder currObj = currentHouseBuilderObj.withFloor();
			//House h = currObj.build();
			
			House house = new House.HouseBuilder(12)
					.withFloor()
					.withPillers(10)
					.withCeiling()
					.withDecore()
					.calWindowsNo()
					.build();//final call
			
			System.out.println(house);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
