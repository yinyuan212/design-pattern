package com.example.designpattern.structural.decorator.example1;

public class DecoratorClient {

    /**
     * 在不改FileDataSource.java的條件下，來改變程式碼的行為
     * 透過在dataSource加wrapper
     *
     */
    public static void main(String[] args) {

        String data = "Hello, I am a great engineer.";
        String filePath = System.getProperty("user.dir") + "/src/main/resources/decorator.txt";

        DataSource dataSource = new FileDataSource(filePath);
        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(dataSource);
        CompressionDecorator compressionDecorator = new CompressionDecorator(encryptionDecorator);
        compressionDecorator.writeData(data);

        DataSource plain = new FileDataSource(filePath);
        System.out.println("===========input===========");
        System.out.println(data);
        System.out.println("===========encode===========");
        System.out.println(plain.readData());
        System.out.println("===========decode===========");
        System.out.println(compressionDecorator.readData());
        System.out.println("===========end===========");




    }
}
