package application;

import dominio.Pessoa;

public class Program {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(1, "P1", "p1@gmail.com");
        Pessoa p2 = new Pessoa(2, "P2", "p2@gmail.com");
        Pessoa p3 = new Pessoa(3, "P3", "p3@gmail.com");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
