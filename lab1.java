import java.util.Scanner;

/**
 * lab1
 */
public class lab1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Question number to perform at particular lab: ");
        int Q = sc.nextInt();

        if(Q==1)
        {
            areaOfCircle(sc.nextDouble());
        }

        else if(Q == 2)
        {
            oddOReven(sc.nextInt());
        }

        else if (Q==3)
        {
            checkVowel(sc.next().charAt(0));
        }

        else if (Q==4)
        {
            factorialLoop(sc.nextInt());
        }

        else if(Q==5)
        {
            System.out.println(factorialRecurssion(sc.nextInt()));
        }

        else if (Q == 6)
        {
            power(sc.nextInt(),sc.nextInt());
        }

        else if(Q==7)
        {
            factors(sc.nextInt());
        }
        
        else if(Q==8)
        {
            prime(sc.nextInt());
        }
        
    }


    // area of circle...
    public static void areaOfCircle(double radius)
    {
        System.out.println(Math.PI*radius*radius);
    }

    // odd or even
    public static void oddOReven(int num)
    {
        if(num%2==0)
        {
            System.out.println("even");
        }

        else
        {
            System.out.println("false");
        }
    }

    // vowel or not
    public static void checkVowel (char c)
    {
        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        {
            System.out.println("Vowel");
        }

        else
        {
            System.out.println("consonent");
        }
    }

    // factorial using loop
    public static void factorialLoop(int num)
    {
        int answer = 1;

        for (int i=1; i<=num; i++)
        {
            answer = answer*i;
        }

        System.out.println(answer);
    }

    // factorial using recursion
    public static int factorialRecurssion(int num)
    {
        if (num==1 || num == 0)
        {
            return 1;
        }

        else
        {
            return factorialRecurssion(num-1)*num;
        }
    }

    // power using loop
    public static void power(int num, int base)
    {
        int power = 0;
        while(num!=1)
        {
            power++;
            num = num/base;
        }

        System.out.println(power);
    }

    // factors
    public static void factors(int num)
    {
        for (int i=1; i<=num; i++)
        {
            if (num%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }

    // prime
    public static void prime(int num)
    {
        boolean flag = true;

        for (int i=2; i<num; i++)
        {
            if (num%i==0)
            {
                flag = false;
                break;
            }
        }

        if (flag == true)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
}