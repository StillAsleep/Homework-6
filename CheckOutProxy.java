
/**
 * Implements a proxy to check if you are person reading the book and not
 * a robot trying to copy a book
 */

import java.util.*;

public class CheckOutProxy implements Library {

    String captcha = "StillAsleep";

    @Override
    public void read() {
        System.out.println("-----------------");
        System.out.println(captcha);
        System.out.println("Please enter the captcha on the screen");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        if (text.equals(captcha)) {
            Library input = new CheckOutLibrary();
            input.read();
        } else {
            IncorrectInput input1 = new IncorrectInput();
            input1.read();
            scan.close();
        }
    }

}