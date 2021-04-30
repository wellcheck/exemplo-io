package com.algarworks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class GravandoEmails {

	public static void main(String[] args) {
		String[] emails = { "wellington@wellingtom", "melissa@melissa", "teste@teste" };

		// Metodo para gravar arquivos e adicionar mais informaçoes no arquivo
		// try (BufferedWriter writer = new BufferedWriter(new FileWriter("exemplo.txt",
		// true))) { // o True é para
		try (PrintStream writer = new PrintStream("email2.txt")) { // adicionar mais
			// informações
			for (String email : emails) {
				// writer.write(email);
				// writer.newLine();
				writer.println(email);
			}

		} catch (IOException e) {

			e.printStackTrace();
			System.err.println("Não foi possivel gravar o arquivo" + e.getMessage());
		}
	}
}
