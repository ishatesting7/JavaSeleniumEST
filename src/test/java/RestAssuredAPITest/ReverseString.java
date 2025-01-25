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


//Reverse a string
//Reverse a string preserving the whitespace
