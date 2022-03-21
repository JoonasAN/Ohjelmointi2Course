package abstractClass.exercise;

import java.lang.reflect.Method;

public class ItemMain {

    public static void main(String[] args) {
        //(new Book("Introduction to algorithms", 1312)).printInfo();
        // System.out.println();
        // (new Disc("Trainspotting", 95)).printInfo();
        	
        for(Method m : BorrowableItem.class.getDeclaredMethods()) {
            System.out.println(m.getName());
        }

        //(new Disc("Introduction to algorithms", 1312)).name();
        //System.out.println(Disc.class.getSimpleName());
        

    }
}