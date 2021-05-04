package com.algarworks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class LendoArquivoItenPedido {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("intes_pedido.txt")))) {
			scanner.useDelimiter(";");
			Locale LocaleBrasil = new Locale("pt", "BR");
			scanner.useLocale(LocaleBrasil);

			NumberFormat formatador = NumberFormat.getCurrencyInstance(LocaleBrasil);

			while (scanner.hasNext()) {
				String produto = scanner.next();
				int quantidade = scanner.nextInt();
				double valor = scanner.nextDouble();
				scanner.nextLine();

				System.out.printf("Produto: %s. Quantidade: %d. Por: %s\n ", produto,  quantidade, formatador.format(valor));
			}
		} catch (IOException e) {
			System.out.println("Erro ao abrir o arquivo" + e.getMessage());
		}
	}
}
