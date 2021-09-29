package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import Entities.Client;
import Entities.OrderItem;
import Entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Client client = new Client("Maria","maria@gmail.com", sdf.parse("20/10/1995"));
		
		System.out.println(client);
		
		sc.close();
	}

}