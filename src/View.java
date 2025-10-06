import javax.swing.*;
import java.awt.*; // includes all awt
import java.awt.event.ActionListener;
import java.util.List;

public class View extends JFrame {
    private JTextArea textArea;
    private JLabel subtotalLabel;
    private JButton scanButton;

    public View() {
        setTitle("Cash Register");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // scanned items
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        // shows subtotal
        subtotalLabel = new JLabel("Subtotal: $0.00");
        scanButton = new JButton("Scan");

        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(subtotalLabel, BorderLayout.WEST);
        bottomPanel.add(scanButton, BorderLayout.EAST);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    public void setScanAction(ActionListener listener) {
        scanButton.addActionListener(listener);
    }

    public void updateDisplay(List<CashRegister.Product> items, double subtotal) {
        textArea.setText("");
        for (CashRegister.Product p : items) {
            textArea.append(p.toString() + "\n");
        }
        subtotalLabel.setText(String.format("Subtotal: $%.2f", subtotal));
    }
}
