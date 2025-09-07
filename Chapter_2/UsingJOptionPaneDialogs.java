import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        // first it will ask ur user's name
        String name = JOptionPane.showInputDialog("What is your name?");

        // in this program here it will ask for confirmation
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to proceed?","Confirmation",JOptionPane.YES_NO_OPTION);

          // if yes it will show the name 
        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
        }
    }
}
