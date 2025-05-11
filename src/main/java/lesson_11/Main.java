package lesson_11;

import lesson_11.service.Service;

public class Main {
    public static void main(String[] args) {
        //QUERY
//        CREATE TABLE buyers (
//                id SERIAL PRIMARY KEY,
//                name VARCHAR(50)
//        );
//
//        CREATE TABLE products (
//                id SERIAL PRIMARY KEY,
//                title VARCHAR(150),
//                price NUMERIC(10, 2)
//        );
//
//        CREATE TABLE basket (
//                id SERIAL PRIMARY KEY,
//                id_buyer BIGINT REFERENCES buyers (id),
//                id_product BIGINT REFERENCES products (id)
//        );
//
//        ALTER TABLE basket ADD COLUMN price NUMERIC (10, 2);
//        UPDATE basket b
//        SET price = (SELECT p.price FROM products p WHERE p.id = b.id_product);
//
//        SELECT * FROM basket;

        Service service = new Service();
        service.showProductsByPerson("John").forEach(System.out::println);
    }
}
