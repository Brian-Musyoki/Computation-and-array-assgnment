public class FibonacciSequence {
    public static void main(String[] args){
        int PreviousNumber = 1;
        int CurrentNumber = 2;
        int MaximumNumber = 4000000;
        int Sum = 2;

        while (CurrentNumber <= MaximumNumber){
            int Nextnumber = PreviousNumber + CurrentNumber;
            PreviousNumber = CurrentNumber;
            CurrentNumber = Nextnumber;

            if (CurrentNumber % 2 == 0){
                Sum += CurrentNumber;
            }
        }
        System.out.println("The sum of all even-valued terms in the fibonacci sequence is " + Sum);
    }
    
}
