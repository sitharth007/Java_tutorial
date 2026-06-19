// // class Student{
// //     private String name;
// //     private int age;

// //     public String getName(){
// //         return name;
// //     }
// //     public int getAge(){
// //         return age;
// //     }
// //     public void setName(String newName) {
// //         this.name = newName;
// //     }

// //     public void setAge(int newAge) {
// //         this.age = newAge;
// //     }
// // }
// // public class encapsulation {
// //     public static void main(String[] args){
// //         Student s1=new Student();
// //         s1.setName("Sitharth");
// //         s1.setAge(20);
// //         System.out.println(s1.getName());
// //         System.out.println(s1.getAge());
// //     }
// // }


// class bankDetail{
//     private int accno;
//     private int balance;

//     public int getAccno(){
//         return accno;
//     }
//     public int getBalance(){
//         return balance;
//     }
//     public void setAccno(int newAccno){
//         this.accno=newAccno;
//     }
//     public void setBalance(int newBalance){
//         this.balance=newBalance;
//     }
// }
// public class encapsulation{
//     public static void main(String[] args){
//         bankDetail b1=new bankDetail();
//         b1.setAccno(1001);
//         b1.setBalance(5000);
//         System.out.println(b1.getAccno());
//         System.out.println(b1.getBalance());
//     }
// }


// VALIDATION

class salaryValidation{
    private int salary;

    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        if(salary<=0){
            System.out.println("Salary must be greater than zero.");
        }
        else{
            this.salary=salary;
        }
    }
}
public class encapsulation{
    public static void main(String[] args){
        salaryValidation s1=new salaryValidation();
        s1.setSalary(10000);
        System.out.println(s1.getSalary());
        s1.setSalary(0);
        }
}