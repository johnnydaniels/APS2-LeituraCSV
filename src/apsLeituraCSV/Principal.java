package apsLeituraCSV;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) throws IOException {
		System.out.print("Digite o caminho do arquivo: ");
		Scanner leTexto = new Scanner(System.in);
		String caminho = leTexto.nextLine();

		BufferedReader br = null;
		String linha = "";
		String separador = ",";
		System.out.println("Lista de contatos: ");
		try {

			br = new BufferedReader(new FileReader(caminho));
			while ((linha = br.readLine()) != null) {


				String[] contatos = linha.split(separador);
				System.out.println("\nNome: " + contatos[0] + "\nEmail: " + contatos[1]);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}