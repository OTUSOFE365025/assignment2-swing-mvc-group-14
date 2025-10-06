public class Controller {
    private CashRegister model; // references cashRegister
    private View view; // references view
    private Scanner scanner; // references scanner

    public Controller(CashRegister model, View view, Scanner scanner) {
        this.model = model;
        this.view = view;
        this.scanner = scanner;

        view.setScanAction(e -> handleScan());
    }

    // gets random upc code
    private void handleScan() {
        String upc = scanner.scan();
        model.addItem(upc);
        view.updateDisplay(model.getScannedItems(), model.getSubtotal()); // update with subtotal
    }
}

