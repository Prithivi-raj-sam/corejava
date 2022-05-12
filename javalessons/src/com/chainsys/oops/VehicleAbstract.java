package com.chainsys.oops;

	public abstract class VehicleAbstract implements IVehicle{
		@Override
		public void start() {
			System.out.println("Vehicle.Start");
		}
		public abstract void init();
		
	}

 class summa{
	 public static void main(String[] args) {
		 VehicleAbstract v=new VehicleCar();
	}
 }
