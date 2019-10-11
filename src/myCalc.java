import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myCalc {
    String num;
    String op;
    int inputNum;
    int totalNum;

    public myCalc() {
        
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if(actionEvent.getActionCommand().equals(equalsButton.getText())){

                    if(op.equals(addButton.getText())){
                        textMain.setText(Integer.toString(totalNum + inputNum));
                    }
                    else if(op.equals(subtractButton.getText())){
                        textMain.setText(Integer.toString(totalNum - inputNum));
                    }
                    else if(op.equals(xButton.getText())){
                        textMain.setText(Integer.toString(totalNum * inputNum));
                    }
                    else if(op.equals(divButton.getText())){
                        textMain.setText(Integer.toString(totalNum / inputNum));
                    }
                }

                switch(actionEvent.getActionCommand()){
                    case "0":
                        textMain.append(a0Button.getText());
                        num = textMain.getText();
                        inputNum = Integer.parseInt(num);
                        break;
                        
                    case "1":
                        textMain.append(a1Button.getText());
                        num = textMain.getText();
                        inputNum = Integer.parseInt(num);
                        break;

                    case "2":
                        textMain.append(a2Button.getText());
                        num = textMain.getText();
                        inputNum = Integer.parseInt(num);
                        break;

                    case "3":
                        textMain.append(a3Button.getText());
                        num = textMain.getText();
                        inputNum = Integer.parseInt(num);
                        break;

                    case "4":
                        textMain.append(a4Button.getText());
                        num = textMain.getText();
                        inputNum = Integer.parseInt(num);
                        break;

                    case "5":
                        textMain.append(a5Button.getText());
                        num = textMain.getText();
                        inputNum = Integer.parseInt(num);
                        break;

                    case "6":
                        textMain.append(a6Button.getText());
                        num = textMain.getText();
                        inputNum = Integer.parseInt(num);
                        break;

                    case "7":
                        textMain.append(a7Button.getText());
                        num = textMain.getText();
                        inputNum = Integer.parseInt(num);
                        break;

                    case "8":
                        textMain.append(a8Button.getText());
                        num = textMain.getText();
                        inputNum = Integer.parseInt(num);
                        break;

                    case "9":
                        textMain.append(a9Button.getText());
                        num = textMain.getText();
                        inputNum = Integer.parseInt(num);
                        break;

                    case "+":
                        op = addButton.getText();
                        textMain.setText("");
                        totalNum = inputNum;
                        inputNum = 0;
                        break;

                    case "-":
                        op = subtractButton.getText();
                        textMain.setText("");
                        totalNum = inputNum;
                        inputNum = 0;
                        break;

                    case "x":
                        op = xButton.getText();
                        textMain.setText("");
                        totalNum = inputNum;
                        inputNum = 0;
                        break;

                    case "/":
                        op = divButton.getText();
                        textMain.setText("");
                        totalNum = inputNum;
                        inputNum = 0;
                        break;

                    case "CL":
                        textMain.setText("");
                        num = textMain.getText();
                        inputNum = 0;
                        totalNum = 0;
                        break;

                }

            }

        };
        a2Button.addActionListener(listener);
        a4Button.addActionListener(listener);
        a1Button.addActionListener(listener);
        a7Button.addActionListener(listener);
        a8Button.addActionListener(listener);
        a5Button.addActionListener(listener);
        clearButton.addActionListener(listener);
        a6Button.addActionListener(listener);
        a9Button.addActionListener(listener);
        equalsButton.addActionListener(listener);
        xButton.addActionListener(listener);
        subtractButton.addActionListener(listener);
        divButton.addActionListener(listener);
        a0Button.addActionListener(listener);
        a3Button.addActionListener(listener);
        addButton.addActionListener(listener);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("myCalc");
        frame.setContentPane(new myCalc().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel mainPanel;
    private JTextArea textMain;
    private JButton a0Button;
    private JButton xButton;
    private JButton a2Button;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton clearButton;
    private JButton equalsButton;
    private JButton subtractButton;
    private JButton addButton;
    private JButton divButton;
}
