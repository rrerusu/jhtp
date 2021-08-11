package org.erusu.jhtp.chapter16.examples;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties table = new Properties();

        table.setProperty("color", "blue");
        table.setProperty("width", "200");

        System.out.printf("After setting properties\n");
        listProperties(table);

        table.setProperty("color", "red");

        System.out.printf("After replacing properties\n");
        listProperties(table);

        saveProperties(table);

        table.clear();

        System.out.printf("After clearing properties\n");
        listProperties(table);

        loadProperties(table);

        Object value = table.getProperty("color");

        if(value != null)
            System.out.printf("Property color's value is %s\n", value);
        else
            System.out.printf("Property color is not in table\n");
    }

    private static void saveProperties(Properties props) {
        try {
            FileOutputStream output = new FileOutputStream(
                "E:\\myCode\\Java\\jhtp_9th\\src\\org\\erusu\\jhtp\\chapter16\\examples\\examplesprops.dat"
            );
            props.store(output, "Sample Properties");
            output.close();
            System.out.printf("After saving properties\n");
            listProperties(props);
        } catch(IOException ioException) {
            ioException.printStackTrace();
        }
    }

    private static void loadProperties(Properties props) {
        try {
            FileInputStream input = new FileInputStream(
                "E:\\myCode\\Java\\jhtp_9th\\src\\org\\erusu\\jhtp\\chapter16\\examples\\examplesprops.dat"
            );
            props.load(input);
            input.close();
            System.out.printf("After loading properties\n");
            listProperties(props);
        } catch(IOException ioException) {
            ioException.printStackTrace();
        }
    }

    private static void listProperties(Properties props) {
        Set<Object> keys = props.keySet();

        for(Object key : keys)
            System.out.printf("%s\t%s\n", key, props.getProperty((String) key));
    }
}