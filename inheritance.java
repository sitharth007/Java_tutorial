// class Animal{
//     void eat(){
//         System.out.println("Eating");
//     }
// }
// class dog extends Animal{
//     void bark(){
//         System.out.println("Barking");
//     }
//     public static void main(String[] args){
//         dog d1=new dog();
//         d1.eat();
//         d1.bark();
//     }
// }


// class parent{
//     private String name;
//     private int age;
//     String getName(){
//         return name;
//     }
//     int getAge(){
//         return age;
//     }
//     void setName(String name){
//         this.name=name;
//     }
//     void setAge(int age){
//         this.age=age;
//     }

// }
// class child extends parent{
//     private int rollno;
//     int getRollno(){
//         return rollno;
//     }
//     void setRollno(int rollno){
//         this.rollno=rollno;
//     }

//     public static void main(String[] args){
//         child p1=new child();
//         p1.setName("Sitharth");
//         p1.setAge(20);
//         p1.setRollno(396);
//         System.out.println(p1.getName());
//         System.out.println(p1.getAge());
//         System.out.println(p1.getRollno());

//     }
// }



class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog{
    void weep(){
        System.out.println("Puppy is weeping");
    }
}

public class inheritance{
    public static void main(String[] args){
        Puppy p = new Puppy();

        p.eat();   
        p.bark();  
        p.weep();  
    }
}
