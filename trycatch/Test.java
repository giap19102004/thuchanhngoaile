package trycatch;

import java.util.Scanner;

public class Test {
    public static void main(String args[]){
        Scanner scn  = new Scanner(System.in);
        try {
            int n = Integer.parseInt(scn.nextLine());

            if (99 % n == 0)
                System.out.println(n + " is a factor of 99");
        }
       catch (NumberFormatException | ArithmeticException ex)
        {
                System.out.println("Exception encountered " + ex);
        }

}
}
// trong đoạn mã trên có 2 khối cacth
// khi nhập GeeksforGeeks ta được kết quả Number Format Exception java.lang.NumberFormatException: For input string: "GeeksforGeeks"
//cho thấy giá trị nhập vào không đúng(Vì là kí tự) với điều kiện và được đưa vào ngoại lệ
// khi nhập sô 0 vào thì ta nhận kết quả Arithmetic java.lang.ArithmeticException: / by zero thấy rằng số 0 không đúng điều kiện(số nhập vào không thể là số 0)
//và được đưa vào ngoại lệ
// khi thay đổi dòng code thì các câu trả lời vẫn như thế 

