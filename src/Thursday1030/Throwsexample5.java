package Thursday1030;

import java.io.IOException;
import java.sql.SQLException;

public class Throwsexample5 {

    public static void riskyMethod() throws IOException, SQLException{
        throw new IOException("File Error");
    }

    static void main(String[] args) {
        try{
            riskyMethod();
        }catch (IOException e) {
            System.out.println("Caught IO: " + e.getMessage());
        }catch (SQLException e) {
            System.out.println("Caught SQL: " + e.getMessage());
        }
    }
}
