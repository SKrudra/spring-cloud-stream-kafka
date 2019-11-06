package com.example.springcloudstream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import com.example.springcloudstream.beans.Book;

@SpringBootApplication
@EnableBinding(Sink.class)
public class SpringcloudstreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudstreamApplication.class, args);
	}

//	@StreamListener(Sink.INPUT)
//	public void handle(Book book) {
//		System.out.println("Received: " + book);
//	}
}
