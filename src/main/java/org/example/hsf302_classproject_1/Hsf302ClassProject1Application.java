package org.example.hsf302_classproject_1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@SpringBootApplication
public class Hsf302ClassProject1Application {

    public static void main(String[] args) {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee_manager");
        System.out.println("EMF tao thanh cong!");

    }

}
