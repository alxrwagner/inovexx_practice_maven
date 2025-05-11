package lesson_11.service;

import lesson_11.model.Buyer;
import lesson_11.model.Product;
import lombok.Data;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;


@Data
public class Service {
    private SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

    public List<Product> showProductsByPerson(String name){
        List<Product> products = new ArrayList<>();
        try (Session session = factory.openSession()) {
            Buyer buyer = session.load(Buyer.class, name);
            products = buyer.getProducts();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return products;
    }
}
