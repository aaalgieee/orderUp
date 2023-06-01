import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class tableUser {
    public static void showUser() {
        // Read the JSON file
        JSONArray jsonArray = readJSONFile("src/users.json");

        // Create the main JFrame and JTable
        //JFrame frame = new JFrame("User Table");
        //JTable table = new JTable();

        // Create the table model
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Username");

        // Parse JSON data and add rows to the table model
        for (Object obj : jsonArray) {
            JSONObject jsonObject = (JSONObject) obj;
            String name = (String) jsonObject.get("name");
            String username = (String) jsonObject.get("username");
            model.addRow(new Object[]{name, username});
        }

        // Set the table model to the JTable
        manage.manageMode.tableUsers.setModel(model);

        // Add the JTable to a scroll pane and set it as the content pane of the frame
        //JScrollPane scrollPane = new JScrollPane(table);
        //frame.setContentPane(scrollPane);

        // Configure frame properties
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        //frame.setVisible(true);
    }

    // Helper method to read the JSON file
    private static JSONArray readJSONFile(String filename) {
        try {
            JSONParser parser = new JSONParser();
            FileReader fileReader = new FileReader(filename);
            Object obj = parser.parse(fileReader);
            fileReader.close();
            return (JSONArray) obj;
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONArray();
        }
    }
}
