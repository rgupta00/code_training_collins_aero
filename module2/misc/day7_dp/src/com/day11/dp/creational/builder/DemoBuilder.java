package com.day11.dp.creational.builder;
class Food {
	private String name;
	private int unit;
	private int vitC;
	private int vitA;
	private int vitB12;
	private int vitB5;
	private int vitD;
	
	public Food(String name, int unit, int vitC, int vitA, int vitB12, int vitB5, int vitD) {
		this.name = name;
		this.unit = unit;
		this.vitC = vitC;
		this.vitA = vitA;
		this.vitB12 = vitB12;
		this.vitB5 = vitB5;
		this.vitD = vitD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public int getVitC() {
		return vitC;
	}
	public void setVitC(int vitC) {
		this.vitC = vitC;
	}
	public int getVitA() {
		return vitA;
	}
	public void setVitA(int vitA) {
		this.vitA = vitA;
	}
	public int getVitB12() {
		return vitB12;
	}
	public void setVitB12(int vitB12) {
		this.vitB12 = vitB12;
	}
	public int getVitB5() {
		return vitB5;
	}
	public void setVitB5(int vitB5) {
		this.vitB5 = vitB5;
	}
	public int getVitD() {
		return vitD;
	}
	public void setVitD(int vitD) {
		this.vitD = vitD;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Food [name=").append(name).append(", unit=").append(unit).append(", vitC=").append(vitC)
				.append(", vitA=").append(vitA).append(", vitB12=").append(vitB12).append(", vitB5=").append(vitB5)
				.append(", vitD=").append(vitD).append("]");
		return builder.toString();
	}

	//
}
class FoodBuilder{
	private String name;
	private int unit;
	private int vitC=100;
	private int vitA=20;
	private int vitB12=2000;
	private int vitB5=400;
	private int vitD=2000;
	
	public Food build() {
		return new Food(name, unit, vitC, vitA, vitB12, vitB5, vitD);
	}
	public FoodBuilder(String name, int unit) {
		this.name = name;
		this.unit = unit;
	}

	public FoodBuilder setVitC(int vitC) {
		this.vitC = vitC;
		return this;
	}

	public FoodBuilder setVitA(int vitA) {
		this.vitA = vitA;
		return this;
	}

	public FoodBuilder setVitB12(int vitB12) {
		this.vitB12 = vitB12;
		return this;
	}

	public FoodBuilder setVitB5(int vitB5) {
		this.vitB5 = vitB5;
		return this;
	}

	public FoodBuilder setVitD(int vitD) {
		this.vitD = vitD;
		return this;
	}
	
	
}
public class DemoBuilder {
	
	public static void main(String[] args) {
		
		Food food=new Food("parle g", 100, 2, 12, 1200, 34, 60000);
		
		Food food2=new FoodBuilder("parle g", 100)
				.setVitA(400)
				.setVitB5(3400)
				.build();
		
		System.out.println(food2);
		
	}

}
