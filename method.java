// class employee{
//     int empID;
//     String empName;
//     void display(){
//         System.out.println(empID);
//         System.out.println(empName);
//     }
// }
// public class method {
//     public static void main(String[] args){
//         employee e1=new employee();
//         e1.empID=101;
//         e1.empName="Sitharth";
//         e1.display();
//     }
    
// }


class rectangle{
    int length;
    int breadth;

    void area(){
        System.out.println("Area: "+length*breadth);
    }
}
public class method{
    public static void main(String[] args){
        rectangle r1=new rectangle();
        r1.length=10;
        r1.breadth=5;
        r1.area();
    }
}