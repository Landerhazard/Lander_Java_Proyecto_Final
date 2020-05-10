package proyecto_final_lander;

public class Proyecto_final_lander {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            userform crypto = new userform();
            crypto.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}