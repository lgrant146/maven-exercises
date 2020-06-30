import util.Input;
import org.apache.commons.lang3.StringUtils;


public class StringManipulation {
    public class Exercise {
        public void main(String[] args) {
            Input input = new Input();

            System.out.println("Enter a number: ");
            System.out.println("StringUtils.isNumeric(input.getString()) = " + StringUtils.isNumeric(input.getString()));

            System.out.println("Enter your name: ");
            System.out.println("StringUtils.swapCase(input.getString()) = " + StringUtils.swapCase(input.getString()));

            System.out.println("Enter your city: ");
            System.out.println("StringUtils.reverse(input.getString()) = " + StringUtils.reverse(input.getString()));
        }

    }
}
