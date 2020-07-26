package entities;

public class OutsourcedEmployee extends Employee{
	
	Double additionalCharge;
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	public Double getAdditionalcharge() {
		return additionalCharge;
	}

	public void setAdditionalcharge(Double additionalcharge) {
		this.additionalCharge = additionalcharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge*1.1;
	}

}
