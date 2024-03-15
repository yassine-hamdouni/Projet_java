package com.example.projet_freelance;

import utils.MaConnexion;

import java.sql.SQLException;

public class MainClass {

    public static void main(String[] args) {
        MaConnexion cn1 = MaConnexion.getInstance();
        // ReclamationService reclamationService = new ReclamationService();

        if (cn1.getCnx() != null) {
            System.out.println("All records from the reclamation table:");
            //reclamationService.update(reclamationService.readById(10));


        } else {
            System.out.println("Failed to establish a database connection.");
        }
    }
}