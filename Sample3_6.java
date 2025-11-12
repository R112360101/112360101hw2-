package CH3;

public class Sample3_6
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new Car();

        car1.setNum(1234);
        car1.setGas(20.5);
    }
}

// Car類別
class Car
{
    int num;
    double gas;

    void setNum(int n) // 接收 int 型別引數的參數
    {
        num = n;
        System.out.println("將車號設為" + num);
    }

    void setGas(double g) // 接收 double 型別引數的參數
    {
        gas = g;
        System.out.println("將汽油量設為" + gas);
    }
}
