

public class calculator
{
    int num1;
    int num2;
       int result;
       void add()
       {
        result=num1+num2;
        System.out.println("add result is " +result);
       }
       void mul()
       {
        result=num1*num2;
        System.out.println("mult result is " +result);
       }

    public static void main(String[] args) 
    {
       calculator cal = new calculator();
       cal.num1=4;
       cal.num2=5;
       cal.add();
       cal.mul();

    }
}