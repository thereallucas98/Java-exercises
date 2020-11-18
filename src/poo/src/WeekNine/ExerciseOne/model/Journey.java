package WeekNine.ExerciseOne.model;

public class Journey {
	public int totalHours;
	public float dayPay;
	
	public Journey() {}
	
	public Journey(int totalHours, float dayPay) {
		this.totalHours = totalHours;
		this.dayPay = dayPay;
	}
	
	public int getTotal() {
		return this.totalHours;
	}
	
	public float getDayPay() {
		return this.dayPay;
	}
	
	public void setTotal(int newTotal) {
		this.totalHours += newTotal;
	}
	
	public void setDayPay(float newPayment) {
		this.dayPay = newPayment;
	}
	
	public float getResult() {
		return this.totalHours * this.dayPay;
	}
		
}
