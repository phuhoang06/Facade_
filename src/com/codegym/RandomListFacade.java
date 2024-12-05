package com.codegym;

import java.util.List;

public class RandomListFacade {
    private RandomNumber randomNumber;
    private ListFilter listFilter;
    private ListPrinter listPrinter;

    public RandomListFacade() {
        randomNumber = new RandomNumber();
        listFilter = new ListFilter();
        listPrinter = new ListPrinter();
    }

    public void processList(int size, int minValue, int maxValue) {
        // Tạo danh sách số ngẫu nhiên với các tham số size, minValue, maxValue
        List<Integer> list = randomNumber.generateList(size, minValue, maxValue);

        // Lọc các số lẻ (chỉ lấy số chẵn)
        List<Integer> filteredList = listFilter.filterOdd(list);

        // In danh sách các số chẵn
        listPrinter.printList(filteredList);
    }
}
