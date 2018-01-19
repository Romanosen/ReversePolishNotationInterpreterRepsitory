package com.reversedpnotation.pack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;



    public class ConvertationBaseAlgoritm {

        public static void run(String[] args) throws IOException {


// String reader exzample
/*

            System.out.println("Enter something here : ");

            try {

                String s = bufferRead.readLine();

                System.out.println(s);
                int a;
                System.out.println("enter integer");
                a = Integer.parseInt(bufferRead.readLine());
                System.out.println(a);
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }

*/

            int n;
            String[] rezult=null;

// this is dublicate of operand from convert method
//        char[] q = new char[400];
//        char[] stack = new char[400];
//        char[] str = new char[400];
//        char ch;
//        int n, top, i, front;

            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Please enter inpud data in format t [the number of expressions <= 100]\n" +
                    "expression [length <= 400]\n" +
                    "[other expressions]\n or paste filepath with data in specified order\n");

            String firstLine="";
            String regularExpressionFilePath="([a-zA-Z]:)?(\\[a-zA-Z0-9_-]+)+\\?";

            firstLine=bufferRead.readLine();

            Pattern pattern = Pattern.compile(regularExpressionFilePath);
            if (Pattern.matches("([a-zA-Z]:)?(\\[a-zA-Z0-9_-]+)+\\?",firstLine))
            {
//working with file




            }

            else{
                //working with system in

                n=Integer.parseInt(firstLine);
                rezult= ConvertingUtilites.convertFromSysIn(bufferRead,n);
                //ConvertingUtilites obj=new ConvertingUtilites();
//obj.convertFromSysIn(bufferRead,n);


            }



            // n = 1;

            // str = new String("(a+(b*c))").toCharArray();


            for(int i=0;i<rezult.length;i++)
                System.out.println(rezult[i]);




        }
    }

