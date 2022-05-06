package com.springmongodb.springmongodb.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import com.springmongodb.springmongodb.domain.Post;
import com.springmongodb.springmongodb.domain.User;
import com.springmongodb.springmongodb.repository.PostRepository;
import com.springmongodb.springmongodb.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        Post p1 = new Post(null, sdf.parse("21/03/2018"), "Partil viagem", "Vou viajar para São Paulo! Abs", maria);
        Post p2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia!", "Acordei feliz hoje", maria);

        userRepository.saveAll(Arrays.asList(maria, alex, bob));
        postRepository.saveAll(Arrays.asList(p1, p2));

    }

}
