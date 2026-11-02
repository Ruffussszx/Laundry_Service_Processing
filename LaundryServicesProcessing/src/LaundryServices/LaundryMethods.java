/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LaundryServices;

import javax.swing.JOptionPane;

public class LaundryMethods{

    public static String searchTransaction(
            String id,
            LaundryMethods.LaundryOrder[] records,
            int totalRecords) {

        for (int i = 0; i < totalRecords; i++) {

            if (records[i].transactionID.equalsIgnoreCase(id)) {

                LaundryMethods.LaundryOrder order = records[i];

                return "TRANSACTION FOUND!\n\n"
                        + "Transaction ID: " + order.transactionID
                        + "\nCustomer Name: " + order.customerName
                        + "\nWeight: " + order.weight + " kg"
                        + "\nStatus: " + order.status;
            }
        }

        return "Transaction ID not found.";
    }
}