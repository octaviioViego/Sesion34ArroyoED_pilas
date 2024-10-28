import java.util.Stack;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       //pilas
Stack<Integer>  pilaArroyo = new Stack<>();

pilaArroyo.push(100);
pilaArroyo.push(150);
pilaArroyo.push(230);
pilaArroyo.push(10);
pilaArroyo.push(160);

JOptionPane.showMessageDialog(null,  "Pilas Arroyo"+pilaArroyo);
    }
}
