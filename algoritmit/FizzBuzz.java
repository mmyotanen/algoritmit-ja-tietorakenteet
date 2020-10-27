

public class FizzBuzz {

    public void fizzBuzz() {
        for (int i=1; i < 101; i++) {
            // 3 ja 5 jaollinen
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            // 3 jaollinen
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            // 5 jaollinen
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
