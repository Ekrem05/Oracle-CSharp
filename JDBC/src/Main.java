import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/music";
    public static void main(String[] args) {

        try(Connection conn = DriverManager.getConnection(CONN_STRING,"root","Admin1234")){
            System.out.println("Connected to database");

            PreparedStatement stm = conn.prepareStatement("SELECT * FROM music.songs");
            ResultSet result = stm.executeQuery();
            for(int i = 1; i<result.getMetaData().getColumnCount()+1; i++){
                System.out.printf("%-25s ",result.getMetaData().getColumnLabel(i));
            }
            System.out.println();
            while(result.next()){

                for(int i = 1; i<result.getMetaData().getColumnCount()+1; i++){
                    System.out.printf("%-25s ",result.getString(i));
                }
                System.out.println();
//                int id = result.getInt("song_id");
//                int track_number = result.getInt("track_number");
//                String title = result.getString("song_title");
//                System.out.printf("ID: %d     Track Number: %d     Title: %s\n", id, track_number, title);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}