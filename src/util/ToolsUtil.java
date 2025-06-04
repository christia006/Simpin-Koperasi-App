package util;

import javax.swing.JOptionPane;

public class ToolsUtil {

    // Menampilkan pesan info
    public static void showInfoDialog(String message) {
        JOptionPane.showMessageDialog(null, message, "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }

    // Menampilkan pesan error
    public static void showErrorDialog(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
}

