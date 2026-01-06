package Methods;

public class Students{
    public static void main(String[] args) {
        System.out.println("welcome");
        Students s=new Students();
        s.hello();
        Students.greet();
        System.out.println(s.sum(1,4));
        System.out.println( s.Isodd(7));
       s.checkOddEven(12);
        System.out.println(s.isEven(10));
        System.out.println(s.multiply(10,20));
    }
    void hello(){
        System.out.println("instance method");
    }
    static void greet(){
        System.out.println("Static method");
    }
    int sum(int a, int b){
        return a+b;
    }
    boolean Isodd(int num){
            return num%2 !=0;
    }
    void checkOddEven(int num){
        if(num%2==0)
            System.out.println("even");
        else
        System.out.println("odd");
    }
    boolean isEven(int num){
        return num%2==0;
    }
    int multiply(int a,int b){
        return a*b;
    }
}
