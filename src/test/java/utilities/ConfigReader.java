package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //Önce properties dosyasındaki verileri okuyabilmek için java'dan properties class'ından bir obje oluştururuz
    public static Properties properties;

    //Herşeyden önce çalışması için static bloc içerisinde, oluşturmuş olduğum properties dosyasını tanımlar
    //ve atamasını yaparız. FileInputStream ile dosya yolunu akışa alırız.

    static {
        String dosyaYolu = "configuration.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            properties = new Properties(); //objeyi oluşturduk ve atamasını gerçekleştirdik
            properties.load(fis);//fis'in okuduğu bilgileri properties'e yükler
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //properties dosyasındaki key değerini alıp test methodumda kullanabilmek için bir method oluşturmalıyız
    public static String getProperty(String Key){//String bir değer döndürmesi için String bir parametre atarız
        /*
            Test method'undan gönderdiğimiz string key değerini alıp ConfigReader class'ından
        getProperty() methodunu kullanarak bu key'e ait value'yu bize getirir.
         */


        return properties.getProperty(Key);
    }



}
