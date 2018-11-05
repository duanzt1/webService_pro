package com.duan.file;

public class FileTest {
    public static void main(String[] args) {
        FileUtils fileUtils = new TextFileUtils();
        fileUtils.createFile("D:test.txt");
    }
}
