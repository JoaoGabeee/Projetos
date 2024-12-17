import com.formdev.flatlaf.IntelliJTheme;

import java.awt.EventQueue;

public class Main {

    public static void main(String[] args) {
        IntelliJTheme.setup(Main.class.getClassLoader().getResourceAsStream("themes/frappe.theme.json"));

        EventQueue.invokeLater( () ->  new JanelaPrincipalJFrame().setVisible(true));
    }

}