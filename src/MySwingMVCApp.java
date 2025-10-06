import javax.swing.*;

public class MySwingMVCApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                CashRegister model = new CashRegister("products.txt");
                Scanner scanner = new Scanner("products.txt"); // scans products
                View view = new View();
                new Controller(model, view, scanner);

                view.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}


