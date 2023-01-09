import entities.Product;
import java.util.HashMap;
import java.util.Map;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("=========================================");

    //nesse program eu tenho meu stok de produtos que e o Map<Product, Double>
    //e abaixo eu instanciei 3 produtos p1, p2, p3
    Map<Product, Double> stock = new HashMap<>();
    Product p1 = new Product("Tv", 900.0);
    Product p2 = new Product("Notebook", 1200.0);
    Product p3 = new Product("Tablet", 400.0);

    stock.put(p1, 10000.0);
    stock.put(p2, 20000.0);
    stock.put(p3, 15000.0);
    //aki eu vou fazer o seginte no meu map que e o stock eu inserir esses valor acima

    Product ps = new Product("Tv", 900.0);
    //para testar aki ei fiz o seginte criei um product ps recebendo new Product("Tv", 900.0);
    // e igual os dados que eu enserir acima

    System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    //aki eu to fazendo o text sera que no meu map contei uma chave igual pruduto ps

    System.out.println("=========================================");
  }
}
