package RegularExpression;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class AgeAssignment {
    public static void main(String[] args) {
        int age = 21; 

        try {
            if (age < 18) {
                throw new InvalidAgeException("Candidate is not eligible to vote");
            } else {
                System.out.println("Candidate is eligible to vote");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

