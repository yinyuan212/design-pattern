package com.example.designpattern.structural.decorator.example1;

import java.io.*;

public class FileDataSource implements DataSource{

    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }
    @Override
    public void writeData(String data) {
        File file = new File(name);
        try(FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }
}
