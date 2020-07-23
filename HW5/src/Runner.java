public class Runner {

    public static void main(String[] args) {
        CarProcessor Mycar = new CarProcessor();
        Mycar.cars = new Car[5];
        Mycar.cars[0] = new Car(0, "Honda", "Civic", 1999, "Red", 4000, "2089");
        Mycar.cars[1] = new Car(1, "BMW", "X5", 2000, "Black", 5500, "hr5478kl");
        Mycar.cars[2] = new Car(2, "Toyota", "Camry", 2005, "Green", 5100, "XY 1JK45");
        Mycar.cars[3] = new Car(3, "Citroën", "C4", 2010, "White", 6000, "XYZ 12JK");
        Mycar.cars[4] = new Car(3, "Peugeot", "308", 2010, "Black", 5500, "XYZ 48JK");


        Mycar.proc("BMW");
        Mycar.proc("Camry", 5);
        Mycar.proc(2010, 4500);

    }
}
