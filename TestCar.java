package code.on.work.files;

import java.io.File;

	public class TestCar {

		public static void main(String[] args) {
			
			try {
				Car c1 = new Car("K001",2015,0,20000);
				Car c2 = new Car("K002",2017,0,120500);
				Car c3= new Car("K003",2018,0,10500);
				Car c4= new Car("K004",2019,0,230000);
				Car c5= new Car("K005",2020,0,144000);
				Car c6= new Car("K006",2021,0,3100000);
				Car c7= new Car("K008",2015,0,45000);
				Car c8= new Car("K007",015,0,10000);
				Car c9= new Car("K09",2018,0,250000);
				Car c10= new Car("K10",2013,0,60000);
				
				Car[] cars= new Car[] {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};
				
				File f= new File("car.txt");
				f.delete();
				
				CarList carlist = new CarList("car.txt");
				
				for(Car c: cars) {
					carlist.addCar(c);
				}
				System.out.println("New Cars:"+carlist.countNewCars());
				System.out.println("Most expensive Car : " +carlist.mostExpensiveCar());
			
			
			}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		}	
	}

