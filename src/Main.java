public class Main {
    public static void main(String[] args) {
        //Завдання 1:
        System.out.println("Завдання 1:");
        int a=11;
        int b=3;
        double c=(double) a/b;
        int d=a%b;
        System.out.println(c);
        System.out.println(d);

        //Завдання 2:
        System.out.println("Завдання 2:");
        int a1=35;
        int first=a1/10;
        System.out.println("Перше число:"+first);
        int second=a1%10;
        System.out.println("Друге число:"+second);
        int sum=first+second;
        System.out.println("Сума:"+sum);

        //Завдання 3:
        System.out.println("Завдання 3:");
        double number=34.3;
        double roundedNumber=Math.round(number);
        System.out.println(roundedNumber);




    }
}