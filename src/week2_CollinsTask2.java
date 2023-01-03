public class week2_CollinsTask2 {
    public static void main(String[] args) {

        String divisible3 = "";
        String divisible5 = "";
        String divisible15 = "";

        for (int i = 1; i <= 100 ; i++) {
            if(i%15==0){//checks to see if divisible by 3, 5 and 15. If yes adds to String divisible by 15
                divisible15+=i+", ";
            }else if(i%5==0){//checks to see if divisible by 5. If yes adds to String divisible by 5, if divisible by 15, it gets added above so no need to add additional requirement to check here.
                divisible5+=i+", ";
            }else if(i%3==0){//checks to see if divisible by 3. If yes adds to String divisible by 3, if divisible by 5 and 15, it gets added above so no need to add additional requirement to check here.
                divisible3+=i+", ";
            }

        }
        System.out.println("Divisible by 3: "+ divisible3);
        System.out.println("Divisible by 5 = " + divisible5);
        System.out.println("divisible by 15 = " + divisible15);


    }
}
