public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isBuzz = number % 5 == 0;
        boolean isFizz = number % 3 == 0;
        boolean isFizzBuzz = number % 3 == 0 && number % 5 == 0;
        if(isFizzBuzz) {
            return "FizzBuzz";
        }

        if(isFizz) {
            return "Fizz";
        }

        if(isBuzz)
            return "Buzz";

        return number + "";
    }
}
