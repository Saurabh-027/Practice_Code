package Java8_features;
interface Intern {

    //void m4();
    void add(int a, int b);
}

/*
class Demo implements Intern {
    public void m4(){
        System.out.println("Hello");
    }
}
*/

public class functionalLambda {
    public static void main(String[] args){
        //Demo d = new Demo();
        //Intern d = new Demo();
        //d.m4();

        //using lambda to implement the functional interface.
        //Intern i = () -> System.out.println("Hello ..using the lambda expression");
        //We need i.m1 to print the lambda expression. So we can say that without functional Interface we cannot print lambda/.
        //i.m4();
       // i.m4();

        Intern i = (a,b) -> System.out.println("Sum of a and b: "+ (a+b));
        i.add(3,4);
        i.add(4,8);
    }
}
