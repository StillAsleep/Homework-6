/**
 * If you wrote down the wrong captcha it prompts you
 */
public class IncorrectInput implements Library {

    @Override
    public void read() {
        System.out.println("You might be a robot. We cant allow you to checkout our books");

    }

}