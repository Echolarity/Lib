package com.lib.lib;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Value;

@SpringBootApplication
public class Main implements CommandLineRunner {
    @Value("${server.port}")
    private String serverport;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Server port: " + serverport+"is running");
    }
}
