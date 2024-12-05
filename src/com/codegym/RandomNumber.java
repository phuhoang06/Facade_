package com.codegym;
import java.util.ArrayList;
import java.util.List;

public class RandomNumber {
    // Tạo một số nguyên ngẫu nhiên trong khoảng min và max
    public int generateInteger(int min, int max) {
        double randomDouble = Math.random();
        int randomInteger = (int) (randomDouble * (max - min + 1) + min);
        return randomInteger;
    }

    // Tạo một danh sách số ngẫu nhiên
    public List<Integer> generateList(int size, int min, int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(generateInteger(min, max)); // Sử dụng phương thức generateInteger để tạo số ngẫu nhiên
        }
        return list;
    }
}