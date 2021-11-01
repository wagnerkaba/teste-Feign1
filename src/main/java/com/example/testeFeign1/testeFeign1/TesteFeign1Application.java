package com.example.testeFeign1.testeFeign1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteFeign1Application {


//************************************************************
//		PROJETO PARA TESTAR O SPRING CLOUD OPEN FEIGN
//		https://spring.io/projects/spring-cloud-openfeign
//
//		INSTRUÇÕES:
//
//   	Execute o projeto testeFeign1 (este projeto).
//   	Ele está configurado para funcionar na porta 8080
// 		Execute o projeto testeFeign2, que está configurado para
// 		funcionar na porta 3000
//		Ao entrar no endereço http://localhost:3000/agenda
//		o testeFeign2 irá consumir os dados fornecidos pelo
//		testeFeign1
//************************************************************

	public static void main(String[] args) {
		SpringApplication.run(TesteFeign1Application.class, args);
	}

}
