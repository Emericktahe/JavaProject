package ci.pigier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BasedeDonnee {

    private static final String URL = "jdbc:mysql://localhost:3306/sakila";
    private static final String USER = "sakila";
    private static final String PASSWORD = "p_ssW0rd";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion à la base de données établie avec succès.");
        } catch (SQLException e) {
            System.err.println("Erreur lors de la connexion à la base de données : " + e.getMessage());
            // Optionnel : Vous pourriez logger l'exception complète avec e.printStackTrace()
            // ou utiliser un logger approprié à la place de System.err
        }
        return connection;
    }
}
