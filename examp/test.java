package examp;

import java.util.Scanner;
//Tạo hàm main cho phép người dùng nhập vào chỉ số của một phần tử bất kỳ đồng thời
// tìm kiếm giá trị phần tử theo chỉ số đó dựa trên mảng vừa tạo
public class test {
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner scaner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scaner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }

    }}
