import javax.swing.*;
import java.awt.event.*;

public class myCalc  {

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
    private JButton plusMinusButton;
    private JButton decimalButton;
    private JLabel opLabel;
    private JLabel firstNum;
    private JButton funTime;
    private JButton backSpaceButton;
    String num;
    String op = "";
    double inputNum;
    double totalNum;



    public myCalc() {


        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                switch (actionEvent.getActionCommand()) {
                    case "0":
                        numBtnPress(a0Button);
                        break;

                    case "1":
                        numBtnPress(a1Button);
                        break;

                    case "2":
                        numBtnPress(a2Button);
                        break;

                    case "3":
                        numBtnPress(a3Button);
                        break;

                    case "4":
                        numBtnPress(a4Button);
                        break;

                    case "5":
                        numBtnPress(a5Button);
                        break;

                    case "6":
                        numBtnPress(a6Button);
                        break;

                    case "7":
                        numBtnPress(a7Button);
                        break;

                    case "8":
                        numBtnPress(a8Button);
                        break;

                    case "9":
                        numBtnPress(a9Button);
                        break;

                    case "+":
                        opBtnPress(addButton);
                        break;

                    case "-":
                        opBtnPress(subtractButton);
                        break;

                    case "x":
                        opBtnPress(xButton);
                        break;

                    case "/":
                        opBtnPress(divButton);
                        break;

                    case "CL":
                        clrBtnPress();
                        break;

                    case "=":
                        equalBtnPress();
                        break;
                    case "+/-":
                        plusMinusBtnPress();
                        break;
                    case ".":
                        decimalBtnPress();
                        break;
                    case "<=":
                        backSpaceBtnPress();
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
        plusMinusButton.addActionListener(listener);
        decimalButton.addActionListener(listener);
        funTime.addActionListener(listener);
        backSpaceButton.addActionListener(listener);

        textMain.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_0){
                    numBtnPress(a0Button);
                }
                if(e.getKeyCode() == KeyEvent.VK_1){
                    numBtnPress(a1Button);
                }
                if(e.getKeyCode() == KeyEvent.VK_2){
                    numBtnPress(a2Button);
                }
                if(e.getKeyCode() == KeyEvent.VK_3){
                    numBtnPress(a3Button);
                }
                if(e.getKeyCode() == KeyEvent.VK_4){
                    numBtnPress(a4Button);
                }
                if(e.getKeyCode() == KeyEvent.VK_5){
                    numBtnPress(a5Button);
                }
                if(e.getKeyCode() == KeyEvent.VK_6){
                    numBtnPress(a6Button);
                }
                if(e.getKeyCode() == KeyEvent.VK_7){
                    numBtnPress(a7Button);
                }
                if(e.getKeyCode() == KeyEvent.VK_8){
                    numBtnPress(a8Button);
                }
                if(e.getKeyCode() == KeyEvent.VK_9){
                    numBtnPress(a9Button);
                }
                if(e.getKeyCode() == KeyEvent.VK_P){
                    opBtnPress(addButton);
                }
                if(e.getKeyCode() == KeyEvent.VK_MINUS){
                    opBtnPress(subtractButton);
                }
                if(e.getKeyCode() == KeyEvent.VK_X){
                    opBtnPress(xButton);
                }
                if(e.getKeyCode() == KeyEvent.VK_SLASH){
                    opBtnPress(divButton);
                }
                if(e.getKeyCode() == KeyEvent.VK_DELETE){
                    clrBtnPress();
                }
                if(e.getKeyCode() == KeyEvent.VK_EQUALS || e.getKeyCode() == KeyEvent.VK_ENTER){
                    equalBtnPress();
                }
                if(e.getKeyCode() == KeyEvent.VK_M){
                    plusMinusBtnPress();
                }
                if(e.getKeyCode() == KeyEvent.VK_PERIOD){
                    decimalBtnPress();
                }
                if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE){
                    backSpaceBtnPress();
                }
            }

        });

    }

        public static void main (String[]args){
        JFrame frame = new JFrame("myCalc");
        frame.setContentPane(new myCalc().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400, 300);
        frame.setVisible(true);

    }

        public void numBtnPress (JButton btn){
        textMain.append(btn.getText());
        num = textMain.getText();
        inputNum = Double.parseDouble(num);
    }

        public void opBtnPress (JButton btn){
        op = btn.getText();
        firstNum.setText(textMain.getText());
        textMain.setText("");
        opLabel.setText(btn.getText());
        totalNum = inputNum;
        inputNum = 0;
    }

        public void clrBtnPress () {
        textMain.setText("");
        opLabel.setText("");
        firstNum.setText("");
        firstNum.setText("");
        num = textMain.getText();
        inputNum = totalNum = 0;
    }

    public void equalBtnPress () {
        if (op.equals(addButton.getText())) {
            textMain.setText(Double.toString(totalNum + inputNum));
            opLabel.setText("");
            firstNum.setText("");
            inputNum = totalNum = 0;
        }
        else if (op.equals(subtractButton.getText())) {
            textMain.setText(Double.toString(totalNum - inputNum));
            opLabel.setText("");
            firstNum.setText("");
            inputNum = totalNum = 0;
        }
        else if (op.equals(xButton.getText())) {
            textMain.setText(Double.toString(totalNum * inputNum));
            opLabel.setText("");
            firstNum.setText("");
            inputNum = totalNum = 0;
        }
        else if (op.equals(divButton.getText())) {
            textMain.setText(Double.toString(totalNum / inputNum));
            opLabel.setText("");
            firstNum.setText("");
            inputNum = totalNum = 0;
        }
        else if (op.equals("")) {
            textMain.setText(textMain.getText());
            opLabel.setText("");
            firstNum.setText("");
            inputNum = totalNum = 0;
        }
    }

    public void plusMinusBtnPress() {
        if (textMain.getText().startsWith("-")) {
            textMain.setText(textMain.getText().replaceFirst("-", ""));
            num = textMain.getText();
            inputNum = Double.parseDouble(num);
        }
        else if(!textMain.getText().startsWith("-")){
            textMain.setText("-" + textMain.getText());
            num = textMain.getText();
            inputNum = Double.parseDouble(num);
        }

    }

    public void decimalBtnPress() {
        if(textMain.getText().contains(".")) {
            textMain.setText(textMain.getText().replace(".", ""));
            num = textMain.getText();
        }
        else if (!textMain.getText().contains(".")) {
            textMain.setText(textMain.getText() + ".");
            num = textMain.getText();
        }
    }

    public void backSpaceBtnPress() {
        textMain.setText(textMain.getText().substring(0, textMain.getText().length() -1));
        num = textMain.getText();
        inputNum = Double.parseDouble(num);
    }

}
