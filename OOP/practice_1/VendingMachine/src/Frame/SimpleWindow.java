package Frame;



import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SimpleWindow extends JFrame {

    private JTextField sumField;;

    public SimpleWindow(String name, String priceList) {
        super(name);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        Box box1 = Box.createHorizontalBox();
        JLabel sumLabel = new JLabel("Введите сумму: ");
        sumField = new JTextField(10);
        box1.add(sumLabel);
        box1.add(Box.createHorizontalStrut(6));
        box1.add(sumField);



        Box box2 = Box.createVerticalBox();
        JLabel priceLabel = new JLabel(priceList);
        box2.add(priceLabel);


        Box box3 = Box.createHorizontalBox();
        JButton ok = new JButton("Купить продукт");
        JButton cancel = new JButton("Отмена");
        box3.add(Box.createHorizontalGlue());
        box3.add(ok);
        box3.add(Box.createHorizontalStrut(12));
        box3.add(cancel);




        
        Box leftBox = Box.createVerticalBox();
        leftBox.setBorder(new EmptyBorder(12, 12, 12, 12));
        leftBox.add(box2);
        leftBox.add(box1);
        leftBox.add(box3);
   
        Box mainBox = Box.createVerticalBox();
        mainBox.add(leftBox);
        

        setContentPane(mainBox);

    }
}