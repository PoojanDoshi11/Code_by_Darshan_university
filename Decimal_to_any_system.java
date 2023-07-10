import java.util.Scanner;
import java.util.Stack;


/**
 * Number_system
 */
public class Decimal_to_any_system{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:\s");
        int num = sc.nextInt();
        System.out.print("Enter the base:\s");
        int base = sc.nextInt();

        Stack <Integer> why = convert(num, base);
        Stack <Integer> answer = reverse(why);

        System.out.println("Answer of number "+num+" base is"+base+"is following");

        while(!answer.isEmpty())
        {
            int y = answer.pop();
            
            if(y>=10)
            {
                System.out.print((char)(y+55));
            }

            else
            {
            System.out.print((y));

            }
        }

       
    }


    // store reminder function to stack

    public static Stack<Integer> convert(int num, int base)
    {
        Stack <Integer> st = new Stack<>();

        if(num<base)
        {
            st.push(num);
            return st;
        }

        st=convert(num/base,base);
        st.push(num%base);
        return st;
    }

    // revise the stack

    public static Stack<Integer> reverse (Stack<Integer>result)
    {
        Stack <Integer> st = new Stack<>();

        while(!result.isEmpty())
        {
            st.push(result.pop());
        }

        return st;
    } 
}   