import java.util.Scanner;

class ques1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        // -----------Question one--------------
        // Addition and subtraction of two numbers
        double score = sc.nextDouble();
        if(score > 80 && score < 90){
            score += 5;
        }
        System.out.println(score);
    }
}