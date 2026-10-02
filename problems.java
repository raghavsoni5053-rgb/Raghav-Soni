import java.util.Scanner;
public class problems {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // MULTIPLICATION TABLE OF ANY NUMBER

      /*   System.out.println("Enter a number here. ");
        int num = sc.nextInt();
        System.out.println();
        int n = 1;

        while(n<=10){
            System.out.println(num*n);
            n++;

        }*/
       
        // SUM OF ODD NUMBER 

       /*System.out.println("Welcome to odd sum.");
       System.out.println("Please enter your number = ");
       int num = sc.nextInt();
       int sum = oddSum(num);
       System.out.println("Odd sum till " + num + " is " + sum);
    }
public static int oddSum(int num){
    int sum = 0;
    int i = 1;
while(i<=num){
    sum = sum + i;
    i = i+2;
}


    return sum;*/

// FACTORIAL 
 /* System.out.println("Enter a number here. ");
 int a = sc.nextInt();
 int i = a;
 int fact = 1;

 while(i>0 ){
 fact = fact*i;
    System.out.println( fact);
    i--;

 }
 System.out.println("Final output =  " + fact);
 */

     /*System.out.println("Enter a number.");
     int a = sc.nextInt();
     int i=2;
     boolean prime = true;
     
while(i<a){
     if(a%i==0){
        
        prime = false;
        
     
     }

     i++;
    }
        if(prime){
        System.out.println("Prime");
     }
     else{
        System.out.println("Non Prime.");
     }
        */

int row = 1;

while (row <= 7) {

    int spaces;
    int plus;

    if (row <= 4) {
        spaces = 4 - row;
        plus = row;
    } else {
        spaces = row - 4;
        plus = 8 - row;
    }

    int i = 1;

    // spaces
    while (i <= spaces) {
        System.out.print("  ");
        i++;
    }

    // plus signs
    i = 1;
    while (i <= plus) {
        System.out.print("+ ");
        i++;
    }

    System.out.println();
    row++;
}
    }
}


        
        
    
