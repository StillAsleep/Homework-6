/**
 * Implements the interface and lets you read your book
 */
public class CheckOutLibrary implements Library {

    @Override
    public void read() {
        System.out.println("You can now read your book ");
    }

}