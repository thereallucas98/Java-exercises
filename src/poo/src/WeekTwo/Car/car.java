package WeekTwo.Car;

public class Car {

	private String model;
	private String color;
	private String chassi;
	private String ownerCar;
	private int maxGear;
	private int numberGears = 0;
	private int maxSpeed;
	private int year;
	private int nowSpeed;
	private int numberPorts;
	private boolean solarRoof;
	private boolean manualGear;
	private boolean carStatus;
	private Double fuelAmount;
	
	// CONSTRUCTOR
	
	public Car(String model, String color, String chassi, String ownerCar , int maxGear, int numberGears,
			int maxSpeed, int year, int nowSpeed, int numberPorts,
			boolean solarRoof, boolean manualGear, boolean carStatus,
			Double fuelAmount) {
		this.model = model;
		this.color = color;
		this.chassi = chassi;
		this.ownerCar = ownerCar;
		this.maxSpeed = maxSpeed;
		this.year = year;
		this.nowSpeed = nowSpeed;
		this.numberPorts = numberPorts;
		this.numberGears = numberGears;
		this.maxGear = maxGear;
		this.carStatus = carStatus;
		this.solarRoof = solarRoof;
		this.manualGear = manualGear;
		this.fuelAmount = fuelAmount;
	}
	
	// METHODS
	
	
	// GET
	public String getModel() {
		return this.model;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getChassi() {
		return this.chassi;
	}
	
	public String getOwnerCar() {
		return this.ownerCar;
	}
	
	public int getMaxGear() {
		return this.maxGear;
	}
	
	public int getNumberGears() {
		return this.numberGears;
	}
	
	public int getMaxSpeep() {
		return this.maxSpeed;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public int getNowSpeed() {
		return this.nowSpeed;
	}

	public int getNumberPorts() {
		return this.numberPorts;
	}

	
	public String getSolarRoof() {
		if (this.solarRoof == true) {
			return String.format("Possui teto Solar");
		} else {
			return String.format("Não possui teto Solar");
		}
	}
	
	public boolean getManualGear() {
		return this.manualGear;
	}
	
	public boolean getCarStatus() {
		return this.carStatus;
	}

	public Double getFuelAmount() {
		return this.fuelAmount;
	}
	
	
	// SET
	
	public void setModel(String newModel) {
		this.model = newModel;
	}
	
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	public void setChassi(String newChassi) {
		this.chassi = newChassi;
	}
	
	public void setName(String newOwner) {
		this.ownerCar = newOwner;
	}
	
	public void setGears(int newGear) {
		this.maxGear = newGear;
	}
	
	public void setGearUp() {
		if (this.maxGear == 3) {
			this.numberGears = 3;
		} else {
			if (this.numberGears < this.maxGear) {
				this.numberGears += 1;
			}
		}
	}
	
	public void setGearDown() {
		if (this.maxGear == 3) {
			this.numberGears -= 1;
		} else {
			if (this.numberGears > 0) {
				this.numberGears -= 1;
			}
		}
	}
	
	public void setYear(int newYear) {
		this.year = newYear;
	}
	
	public void setNumberPorts(int newNumberPorts) {
		this.numberPorts = newNumberPorts;
	}
	
	public void setSpeed() {
		if (this.nowSpeed < 200) {
			this.nowSpeed += 1;
		}
	}
	
	public void setSpeedZero() {
		this.nowSpeed = 0;
	}
	
	
	public void setSolarRoof(boolean newSolarRoof) {
		if (this.solarRoof == false) {
			this.solarRoof = newSolarRoof;
		} else {
			this.solarRoof = newSolarRoof;
		}
	}
	
	public void setManualGear(boolean newGear) {
		if (this.manualGear == false) {
			this.manualGear = newGear;
		} else {
			this.manualGear = newGear;
		}
	}
	
	public void setStatus() {
		if (this.carStatus == false) {
			this.carStatus = true;
		} else {
			this.carStatus = false;
		}
	}
	
	
	// this.status = (this.status) ? (false) : (true);
	
	// TOSTRING
	
	public String toString() {
		if (this.manualGear == true && this.solarRoof == true) {
			return String.format("Olá sr(a): %s, seu carro é do modelo: %s possui a cor %s.\n"
					+ "Chassi: %s\n"
					+ "O veículo possui cambio automático e teto solar.", this.ownerCar, this.model, this.model, this.chassi);
		} else if (this.manualGear == true && this.solarRoof == false) {
			return String.format("Olá sr(a): %s, seu carro é do modelo: %s possui a cor %s.\n"
					+ "Chassi: %s\n"
					+ "O veículo possui cambio automático e teto solar.", this.ownerCar, this.model, this.model, this.chassi);
		} else if (this.manualGear == false && this.solarRoof == true) {
			return String.format("Olá sr(a): %s, seu carro é do modelo: %s possui a cor %s.\n"
					+ "Chassi: %s\n"
					+ "O veículo possui cambio automático e teto solar.", this.ownerCar, this.model, this.model, this.chassi);
		} else {
			return String.format("Olá sr(a): %s, seu carro é do modelo: %s possui a cor %s.\n"
					+ "Chassi: %s\n"
					+ "O veículo possui cambio automático e teto solar.", this.ownerCar, this.model, this.model, this.chassi);
		}
	}
	
	
	
}
