import java.awt.*;
import javax.swing.*;

class TableDemo {
    String[] colHeads = { "Name", "Extension", "ID#" };
    Object[][] data = {
            { "ram", "45", "1234" },
            { "sita", "78", "5678" },
            { "hari", "12", "9876" },
            { "gita", "34", "4567" },
            { "shyam", "90", "2345" },
            { "rita", "67", "8765" },
            { "nabin", "23", "3456" },
            { "sabina", "56", "6543" },
            { "krishna", "81", "1122" },
            { "maya", "39", "7788" },

            { "dipak", "72", "9900" },
            { "anita", "28", "2233" },
            { "roshan", "65", "4455" },
            { "suman", "49", "6677" },
            { "bikash", "31", "8899" },
            { "rekha", "84", "1010" },
            { "ashok", "53", "2020" },
            { "sunita", "77", "3030" },
            { "manish", "19", "4040" },
            { "laxmi", "60", "5050" },

            { "kiran", "41", "6060" },
            { "puja", "88", "7070" },
            { "sagar", "36", "8080" },
            { "nisha", "55", "9090" },
            { "ramesh", "22", "1111" },
            { "sarita", "69", "2222" },
            { "arjun", "47", "3333" },
            { "binita", "74", "4444" },
            { "deepa", "58", "5555" },
            { "prakash", "83", "6666" },

            { "kamal", "26", "7777" },
            { "seema", "91", "8888" },
            { "raj", "37", "9999" },
            { "neha", "64", "1357" },
            { "alok", "52", "2468" },
            { "sonam", "70", "3691" },
            { "amit", "33", "4826" },
            { "tina", "85", "5937" },
            { "vijay", "44", "6148" },
            { "rubi", "29", "7259" },

            { "suresh", "62", "8360" },
            { "meena", "48", "9471" },
            { "pawan", "75", "1593" },
            { "anjali", "27", "2684" },
            { "ravi", "66", "3795" },
            { "kavita", "54", "4806" },
            { "dinesh", "38", "5917" },
            { "hema", "80", "6028" },
            { "ganesh", "21", "7139" },
            { "bina", "59", "8240" }
    };

    public TableDemo() {
        JFrame jframe = new JFrame("Table demo");
        jframe.setSize(200, 200);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTable table = new JTable(data, colHeads);
        JScrollPane jsp = new JScrollPane(table);
        jframe.add(jsp);  
        jframe.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TableDemo();
            }
        });
    }
}