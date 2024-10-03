import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String result;
        result = JOptionPane.showInputDialog("Hay nhap ten cua ban");
        JOptionPane.showMessageDialog(null,"Xin chao " + result + "!");
    }
}