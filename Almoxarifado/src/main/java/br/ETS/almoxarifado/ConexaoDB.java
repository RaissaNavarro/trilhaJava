package Almoxarifado.src.main.java.br.ETS.almoxarifado;

import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class ConexaoDB {
    public static void main(String[] args) {


        try {
            DriverManager.getConnection("jdbc:mysql://localhost:3306/almoxarifado?user=root&password=root\n" +
                    " ");
            System.out.println("Conexão realizada com sucesso!");
        } catch (SQLDataException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
