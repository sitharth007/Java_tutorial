// class practice{
//     public static void main(String arg[]){
//         int age=19;
//         int binary=0b1011;            //binary
//         int hex=0x7E;                 //hexadecimal
//         int zero=100_00_00_000;       //1000000000=100_00_00_000
//         System.out.println("Hello World!");
//         System.out.println("Its me Sitharth R");
//         System.out.println("I am "+age+" years old.");
//         System.out.println("The value of binary is:"+binary);
//         System.out.println("The value of hex is:"+hex);
//         System.out.println("100_00_00_000 is same as:"+zero);
        

//     }
// }

// EVEN ODD
// import java.util.Scanner;
// class practice{
//     public static void main(String arg[]){
//         Scanner inp = new Scanner(System.in);
//         System.out.print("Enter a number:");
//         int a=inp.nextInt();
//         if(a%2==0)
//             System.out.println(a+" is an even number.");
//         else
//             System.out.println(a+" is a odd number.");
//     }
// }

import java.util.Scanner;
class practice{
    public static void main(String arg[]){
    
        Scanner sc = new Scanner(System.in);
        double num=sc.nextDouble();
        float f=sc.nextFloat();
        System.out.printf("%.2f\n",num);
        System.out.printf("%.3f",f);
    }
}
