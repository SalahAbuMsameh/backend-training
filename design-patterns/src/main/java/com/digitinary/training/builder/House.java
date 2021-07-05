package com.digitinary.training.builder;

/**
 * 
 * Jul 5, 2021
 * @author Salah Abu Msameh
 */
public class House {

	private int bases;
	private boolean floor;
	private boolean ceiling;
	private int pillers;
	private boolean decore;
	private int walls;
	private int windows;
	
	private House() {}//its not a mandatory
	
	public int getBases() {
		return bases;
	}

	public void setBases(int bases) {
		this.bases = bases;
	}

	public boolean isFloor() {
		return floor;
	}

	public void setFloor(boolean floor) {
		this.floor = floor;
	}

	public boolean isCeiling() {
		return ceiling;
	}

	public void setCeiling(boolean ceiling) {
		this.ceiling = ceiling;
	}

	public int getPillers() {
		return pillers;
	}

	public void setPillers(int pillers) {
		this.pillers = pillers;
	}

	public boolean isDecore() {
		return decore;
	}

	public void setDecore(boolean decore) {
		this.decore = decore;
	}

	public int getWalls() {
		return walls;
	}

	public void setWalls(int walls) {
		this.walls = walls;
	}

	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}
	
	@Override
	public String toString() {
		return String.format("Bases: %d, Floor: %b, Pillers: %d, Ceiling: %b, Decoration: %b", 
				bases, floor, pillers, ceiling, decore);
	}

	/**
	 * builder class
	 * Jul 5, 2021
	 * @author Salah Abu Msameh
	 */
	public static class HouseBuilder {
		
		private int bases;
		private boolean floor;
		private boolean ceiling;
		private int pillers;
		private boolean decore;
		private int walls;
		private int windows;
		
		public HouseBuilder(int bases) {
			this.bases = bases;
		}
		
		public HouseBuilder withFloor() {
			this.floor = true;
			return this;//current instance
		}
		
		public HouseBuilder withPillers(int pillers) {
			this.pillers = pillers;
			return this;
		}
		
		public HouseBuilder withCeiling() throws Exception {
			
			if(this.pillers == 0) {
				throw new Exception("Can't build house without pillers");
			}
			
			this.ceiling = true;
			return this;
		}
		
		public HouseBuilder withDecore() {
			this.decore = true;
			return this;
		}
		
		public HouseBuilder calWindowsNo() {
			this.windows = walls;
			return this;
		}
		
		public House build() {
			
			House house = new House();
			
			house.setBases(bases);
			house.setFloor(floor);
			house.setPillers(pillers);
			house.setCeiling(ceiling);
			house.setDecore(decore);
			house.setWalls(walls);
			house.setWindows(windows);
			
			return house;
		}
	}
}
