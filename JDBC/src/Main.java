import java.sql.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/music";
    public static void main(String[] args) {

        try(Connection conn = DriverManager.getConnection(CONN_STRING,"root","Admin1234")){
            System.out.println("Connected to database");

            System.out.print("Enter song id: ");
            Scanner scanner = new Scanner(System.in);
            String id = scanner.nextLine();

            PreparedStatement stm = conn.prepareStatement("SELECT * FROM music.songs WHERE song_id = ?");
            stm.setString(1, id);
            ResultSet result = stm.executeQuery();
            printTable(result);



        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void printTable(ResultSet result) throws SQLException {
        System.out.println("==============================================");
        for(int i = 1; i<result.getMetaData().getColumnCount()+1; i++){
            System.out.printf("%-25s ",result.getMetaData().getColumnLabel(i));
        }
        System.out.println();
        while(result.next()){

            for(int i = 1; i<result.getMetaData().getColumnCount()+1; i++){
                System.out.printf("%-25s ",result.getString(i));
            }
            System.out.println();
        }
    }
}