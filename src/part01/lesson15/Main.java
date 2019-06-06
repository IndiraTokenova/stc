package part01.lesson15;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        try (Connection con = ConnectionManager.getConnection()) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
