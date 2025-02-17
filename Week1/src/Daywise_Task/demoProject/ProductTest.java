package demoProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class ProductTest {
	 public static void main(String[] args) throws IOException {
	        FileReader f1 = new FileReader("C:\\Users\\JanakiramKilumu\\OneDrive - Insight Global, LLC\\Desktop\\Products.txt");
	        BufferedReader b = new BufferedReader(f1);
	        String line = null;
	        ProductService productService = new ProductService();

	        // Read the product data from the file and store it in the productList
	        while ((line = b.readLine()) != null) {
	            String[] productData = line.split(",");
	            if (productData.length == 4) {
	                Integer id = Integer.parseInt(productData[0].trim());
	                String name = productData[1].trim();
	                Integer qty = Integer.parseInt(productData[2].trim());
	                Double price = Double.parseDouble(productData[3].trim());

	                Product product = new Product(id, name, qty, price);
	                productService.addProduct(product);
	            }
	        }


			ProductService ps=new ProductService();
			Scanner in=new Scanner(System.in);
			int i=0;
			int id;
			while(i!=-1) {
				String s="""
						1.get price of the product by giving product id.
						2.get the full details of the product from the product id.
						3.Remove product from product id.
						4.Update product from product id.
						press -1 to exit.
						""";
				System.out.println(s);
				i=in.nextInt();
				switch(i) {
				case 1:
					System.out.println("Enter id");
					id=in.nextInt();
					System.out.println(ps.getPriceById(id));
					
					break;
				case 2:
					System.out.println("Enter id");
					id=in.nextInt();
					System.out.println(ps.getProductById(id));
					break;
				case 3:
					System.out.println("Enter id");
					id=in.nextInt();
					ps.removeProduct(id);
					break;
				case 4:
					System.out.println("Enter id");
					id=in.nextInt();
					System.out.println("Enter Name");
					String name = in.nextLine();
					System.out.println("Enter price");
					Double price = in.nextDouble();
					ps.updateProduct(id,name,price);
					break;
				case -1:

					break;
				}
	    }
	 }
}
