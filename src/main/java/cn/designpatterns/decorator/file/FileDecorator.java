package cn.designpatterns.decorator.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDecorator {
    public static void main(String[] args) throws IOException {
        //这里说明一下jdk里面的文件流也使用到这个模式
        BufferedReader reader = new BufferedReader(new FileReader("fileName.text"));
        String s = reader.readLine();
    }
}
