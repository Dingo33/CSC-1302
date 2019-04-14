package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class gui extends JFrame implements ActionListener {
    JButton use;
    JLabel L;

    gui(String title){
        super(title);
        setLayout (new FlowLayout());
        setBounds (50,50, 100, 200);
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        L = new JLabel("Label L");
        add(L);
        use = new JButton("USE");
        add(use);

        use.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {

    }
}

public class GUI {

}
