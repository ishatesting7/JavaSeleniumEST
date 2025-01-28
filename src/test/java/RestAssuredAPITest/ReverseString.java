package RestAssuredAPITest;

public class ReverseString {

    public static void main(String args[])
    {
        //Input - Help Othere
        // Output -  sreh tOpleH
        String str = "Hello Java I am new to training";
        char[] input = str.toCharArray();
        char[] result = new char[input.length];
        //For Whitspace
        for(int i = 0; i<input.length; i++)
        {
            if(input[i] == ' ')
            {
                result[i] = ' ';
            }
        }
        int j = result.length - 1;
        for(int i = 0; i< input.length;i++)
        {
            if(input[i]!=' ')
            {
                if(result[j]==' ')
                {
                    j--;
                }
                result[j] = input[i];
                j--;
            }
        }
        System.out.println(String.valueOf(result));

    }

}

/*

Array - 31 and 39
Count the number of 3 which is repeating - 31, 32, 33, 34, 35, 36, 37, 38, 39

 */

//Reverse a string
//Reverse a string preserving the whitespace
