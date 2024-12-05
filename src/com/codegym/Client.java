package com.codegym;

public class Client {
    public static void main(String[] args) {
        // Khởi tạo RandomListFacade
        RandomListFacade randomListFacade = new RandomListFacade();

        // Xử lý danh sách với 10 phần tử ngẫu nhiên, giá trị từ 0 đến 100
        randomListFacade.processList(10, 0, 100);
    }
}

