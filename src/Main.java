
public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.startEngine();
        car.stopEngine();

        car.brand = "BMW";
        car.model = "7";
        car.year = 2023;

        System.out.println(car.brand);
        System.out.println(car.model);
        System.out.println(car.year);

        Calculator calc = new Calculator();
        int result = calc.addition(5, 6);
        System.out.println(result);
        int result2 = calc.addition(15, 60);
        System.out.println(result2);

        boolean result3 = calc.isGreater(8, 15);
        System.out.println(result3);
        boolean result4 = calc.isGreater(27, 15);
        System.out.println(result4);

        NumberManipulator manipulator = new NumberManipulator();

        int number = 42;
        System.out.println("Initial number = " + number);

        int incrementedNumber = manipulator.incrementByOne(number);
        System.out.println("Incremented number = " + incrementedNumber);

        int decrementedNumber = manipulator.decrementByOne(number);
        System.out.println("Decremented number = " + decrementedNumber);
    }
}