package examp;

import java.util.Random;
// tạo class
// Tạo phương thức createRandom Trả về mảng số nguyễn ngẫu nhiên từ 0 đến 100.
public class ArrayExample {
    public Integer[] createRandom() {
       Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }

}
