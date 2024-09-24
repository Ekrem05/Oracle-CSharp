import java.sql.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/music";
    public static void main(String[] args) {

        try(Connection conn = DriverManager.getConnection(CONN_STRING,"root","Admin1234")){
            System.out.println("Connected to database");

            System.out.print("""
                    Select an action:
                    1. Print songs
                    2. Add song
                    3. Delete song
                    """);
            Scanner sc = new Scanner(System.in);
            Integer action = sc.nextInt();
            if(action == 1){
                System.out.print("Enter song id: ");
                Scanner scanner = new Scanner(System.in);
                String id = scanner.nextLine();

                PreparedStatement stm = conn.prepareStatement("SELECT * FROM music.songs WHERE song_id = ?");
                stm.setString(1, id);
                ResultSet result = stm.executeQuery();
                printTable(result);
            }
            else if(action == 2){
                System.out.print("Enter track number: ");
                Scanner scanner = new Scanner(System.in);
                int track = scanner.nextInt();
                System.out.print("Enter song title: ");
                Scanner titlescanner = new Scanner(System.in);
                String title = titlescanner.nextLine();
                System.out.print("Enter album id: ");
                Scanner albumscanner = new Scanner(System.in);
                int albumId = albumscanner.nextInt();
                 PreparedStatement stm = conn.prepareStatement("Insert into music.tracks(track_number, song_title,album_id) values(?,?,?)");
                 stm.setInt(1, track);
                 stm.setString(2, title);
                 stm.setInt(3, albumId);
                int rowsAffected = stm.executeUpdate();
                System.out.println(rowsAffected + " row(s) inserted.");

            }




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