package io.cyberia.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
//@ImportResource(locations = {"classpath*:messaging/context.xml"})
@SuppressWarnings("PMD")
public class Application {
  public static void main(String[] args) {
    TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    SpringApplication.run(Application.class, args);
  }
}