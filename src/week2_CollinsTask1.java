public class week2_CollinsTask1 {
    public static void main(String[] args) {

        //Swapping two variables without using a third variable
        int a = 10;
        int b = 15;

        System.out.println("---VariablesBeforeSwap-----------------------------");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a=a+b;//here you add both variables together and assign to a. a is 10 at first, and at the end a=25
        b=a-b;//at the start a=25 b=15. After going through the equation, a=25 b=10
        a=a-b;//at the start a=25 b=10(output from equation on line 9). After the equation a=15 and b=10 swapped variables.
        System.out.println("--------------VariableAfterSwap-----------------------");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
