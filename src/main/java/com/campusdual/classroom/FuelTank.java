package com.campusdual.classroom;

public class FuelTank {

  private int actualFuel = 10;

  public void showDetails() {
    System.out.println("La capacidad actual es de " + this.actualFuel + " litros.");
  }

  public int getActualFuel() {
    return this.actualFuel;
  }

  public void setActualFuel(int fuel){
    if (fuel>=0){
      this.actualFuel=fuel;
    }else {
      System.out.println("El valor de gasolina es negativo");
    }
  }
}
