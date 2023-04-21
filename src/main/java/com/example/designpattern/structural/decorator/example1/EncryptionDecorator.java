package com.example.designpattern.structural.decorator.example1;

import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator {


    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    /**
     * 在這邊先呼叫encode，
     * 就可以在DataSource的writeData前先encode
     */
    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    /**
     * 在DataSource的readData完後，做decode
     */
    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
}
