


package com.company;
import java.util.Scanner;
public class Main {

    public static boolean is_crawl(int a,int b,int c,int x,int y){ //идентификатор доступа, функция является статичной, тип возвращаемого значения, имя функции без параметров
        int min_value;
        char min_variable;

        if(a < b){
            if(a < c){
                min_variable = 'a';
                min_value = a;
            }
            else{
                min_variable = 'c';
                min_value = c;

            }
        } else {
            if(b < c){

                min_variable = 'b';
                min_value = b;
            }
            else{
                min_variable = 'c';
                min_value = c;

            }

        }

        int second_min;
        if(min_variable == 'a'){
            second_min = Math.min(b, c);
        }
        else if(min_variable == 'b'){
            second_min = Math.min(a, c);
        }
        else{
            second_min = Math.min(a ,b);
        }

        if((Math.min(x , y) >= min_value) && (Math.max(x ,y) >= second_min)){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean is_3_in_nxn(int n){
        int n_char;
        for (;n>0;n /=10){
            n_char = n%10;
            if(n_char == 3){
                return true;
            }

        }
        return false;
    }
    public static int reverse_int(int n){
        String s=Integer.toString(n);

        String reverse_s = new StringBuilder(s).reverse().toString();

        int result = Integer.parseInt(reverse_s);
        return  result;



    }
    public static int swap_first_and_last(int n){

        String s=Integer.toString(n);



        int result = Integer.parseInt(s);
        return  result;


    }
    public static int add_ones(int n){

        String s=Integer.toString(n);
        StringBuffer sb = new StringBuffer(s);
        sb.insert(0,"1");
        sb.insert(sb.length(),"1");

        String str = sb.toString();

        int result = Integer.parseInt(str);
        return  result;

    }
    public static int swap_first_last(int n){

        String s=Integer.toString(n);
        int length = s.length();

        if (length <= 1) {
            return Integer.parseInt(s);
        } else {
            return Integer.parseInt(s.charAt(length - 1) + s.substring(1, length - 1) + s.charAt(0));
        }


    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        System.out.printf("Enter i Value:  ");
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//
//        int x = in.nextInt();
//        int y = in.nextInt();
        int a = 5;
        int b = 6;
        int c = 1324;

        int x = 8;
        int y = 5;
        System.out.println(is_crawl(a, b ,c ,x ,y));
        System.out.println();
        System.out.println(is_3_in_nxn(c));
        System.out.println(reverse_int(c));
        System.out.println(add_ones(c));
        System.out.println(swap_first_last(c));



    }
}
