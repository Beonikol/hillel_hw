public class CarProcessor {

    Car[] cars;

    public void proc(String marck) {
        for (Car car : cars) {
            if (car.marck.equals(marck)) {
                result(car);
            }
        }
    }

    public void proc(String model, int year) {
        int yearnow = 2020;
        for (Car car : cars) {
            if (car.model.equals(model) & year < (yearnow - car.year)) {
                result(car);
            }
        }
    }

    public void proc(int year, int price) {
        for (Car car : cars) {
            if (car.year == year & price < car.price)
                result(car);
        }
    }

    private void result(Car cars) {
        System.out.println("id:" + cars.id + " " + cars.marck + " " + cars.model + " " +
                cars.year + "  " + cars.color + " " + cars.price + "€ " +
                cars.number);
    }
}
