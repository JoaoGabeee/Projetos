package evangelismoCrud;

import com.formdev.flatlaf.IntelliJTheme;
import java.awt.EventQueue;
import evangelismoCrud.main.JanelaPrincipalJFrame;

public class EvangelismoCrud {

    public static void main(String[] args) {
        IntelliJTheme.setup(EvangelismoCrud.class.getClassLoader().getResourceAsStream("themes/frappe.theme.json"));

        EventQueue.invokeLater(() -> new JanelaPrincipalJFrame().setVisible(true));
    }
}
