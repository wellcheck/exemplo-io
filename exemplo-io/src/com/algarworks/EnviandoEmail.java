package com.algarworks;

import java.io.BufferedReader;
import java.io.FileReader;

public class EnviandoEmail {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("email2.txt"))) {
			
			String email = reader.readLine();
			while(email != null && !email.trim().equals("")) {
				System.out.println("Enviando e-mail para: " + email);
				email = reader.readLine();
			}
			
		} catch (Exception e) {
			System.out.println("Erro ao ler o arquivo" + e.getMessage());
			
			
		}

	}

}
