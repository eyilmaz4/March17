package march17Codes;

public class car_TEst {
    public static void main(String[] args) {
        car myCar=new car(2020, 1, 2, 30000, 24000);
        System.out.println(myCar.offer(2020));

        myCar.setBasePrice(10000);
        System.out.println(myCar.toString());
        car mySecond=new car(2016, 0, 0, 15000, 0);
        System.out.println(mySecond.toString());
    }
}
