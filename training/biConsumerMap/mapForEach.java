package biConsumerMap;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class mapForEach {
    public static void main(String[] args) {

        // make HashMap
        HashMap <String, Car> hmap = new HashMap< >();
        hmap.put("OY-1", new Car("Volvo", "S90"));
        hmap.put("ABC-131", new Car("Toyota", "Corolla"));
        hmap.put("UFO-999", new Car("Volkswagen", "Beetle")); 

        // as anonymous class
        BiConsumer<String, Car> printCar = new BiConsumer < String, Car > () {

            @Override
            public void accept(String register, Car car) {
                System.out.println(car.getMake() + " " + car.getModel());
            }
        };
        hmap.forEach(printCar);
        
        // as lambda function
        hmap.forEach((register, car) -> {
            System.out.println(car.getMake() + " " + car.getModel());
        });
    }
}
