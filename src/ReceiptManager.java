import java.util.Map;
import java.util.TreeMap;

public class ReceiptManager {
    private Map<Integer, Receipt> receiptLists = new TreeMap<>();

    public void addNewReceipt(Receipt receipt) {
        int key = receipt.getClientID();
        receiptLists.put(key, receipt);
    }

    public int getTotalMoneyById(int clientId) {
        Receipt receipt = receiptLists.get(clientId);
        if (receipt == null) return 0;
        else return receipt.getTotalMoney();
    }


    public void displayAll() {
        System.out.println(receiptLists);
    }
}
