package com.kenny.section03.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {
        /* Properties 에 대해 이해하고 사용할 수 있다. */
        Properties props = new Properties();

        /* DB 설정 정보를 Properties 객체에 저장한다. */
        props.setProperty("driver", "org.mariadb.jdbc.Driver");  // put을 쓰려면 쓸 수는 있지만 setProperty 사용
        props.setProperty("url", "jdbc:mariadb://localhost:3306/test");
        props.setProperty("user", "root");
        props.setProperty("password", "root");

        System.out.println("properties: " + props);

        try {
            props.store(new FileOutputStream("driver.properties"), "My Properties File");
            props.store(new FileWriter("driver.txt"), "My Properties File");
            props.storeToXML(new FileOutputStream("driver.properties.xml"), "My Properties File");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        /* 파일의 내용을 properties 객체에 읽어온다. */
        Properties props2 = new Properties();
        try {
            props2.load(new FileInputStream("driver.properties"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(props2.getProperty("driver"));
        System.out.println(props2.getProperty("url"));
        System.out.println(props2.getProperty("user"));
        System.out.println(props2.getProperty("password"));


    }
}
