package dev.heb.springmongodb;

import dev.heb.springmongodb.models.User;
import dev.heb.springmongodb.repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMongoDbApplication  {


    public static void main(String[] args) {
        SpringApplication.run(SpringMongoDbApplication.class, args);

    }


}
