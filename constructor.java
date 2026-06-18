//NON-PARAMETRIZED CONSTRUCTOR

// class welcome{
//      welcome(){
//         System.out.println("Welcome to JAVA!");
//     }
// }
// public class constructor {
//     public static void main(String[] agrs){
//         welcome w1=new welcome();
//     }
// }


// class bankaccount{
//      int balance;

//     bankaccount(){
//         balance=1000;
//     }
//     void display(){
//         System.out.println("Balance: "+balance);
//     }
// }
// public class constructor{
//     public static void main(String[] args){
//         bankaccount b1=new bankaccount();
//         b1.display();
//     }
// }


//PARAMETERIZED CONSTRUCTOR

// class studentDetail{
//     String name;
//     int age;
//     studentDetail(String name,int age){
//         System.out.println(name);
//         System.out.println(age);
//     }
// }
// public class constructor{
//     public static void main(String[] args){
//         studentDetail s1=new studentDetail("Sitharth", 20);
//     }
// }


// class empdetail{
//     int id;
//     String name;
//     double salary;

//     empdetail(int id,String name,double salary){
//         this.id=id;
//         this.name=name;
//         this.salary=salary;
//     }
//     void display(){
//         System.out.println("EmpID: "+id);
//         System.out.println("Name: "+name);
//         System.out.println("salary: "+salary);
//     }
// }
// public class constructor{
//     public static void main(String[] args){
//         empdetail e1=new empdetail(396, "Sitharth", 125000);
//         e1.display();
//     }
// }

//CONSTRUCTOR OVERLOADING

class Student{
    String name;
    int age;
    Student(){
        System.out.println("No parameter.");
    }
    Student(String name){
        System.out.println("1. "+name);
    }
    Student(String name,int age){
        System.out.println("2. "+name);
        System.out.println("2. "+age);
    }
}
public class constructor{
    public static void main(String[] args){

        Student s1=new Student("sitharth",20);
        Student s2=new Student("sitharth");
        Student s3=new Student();
    }
}