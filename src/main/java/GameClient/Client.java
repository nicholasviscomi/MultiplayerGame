package GameClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Client extends JPanel implements MouseListener, MouseMotionListener, ActionListener, KeyListener {
    JFrame frame;
    int width = 1200, height = 600;
    JTextField addrInput;
    JLabel serverTitle;
    JButton join;

    public Client() {
        frame = new JFrame();
        frame.setContentPane(this);
        frame.getContentPane().setPreferredSize(new Dimension(width, height));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Multiplayer Game");
        frame.setSize(width, height);
        frame.setLayout(null);
        frame.pack();
        frame.setLocationRelativeTo(null);

        serverTitle = new JLabel("Server Address:");
        serverTitle.setFont(new Font("Serif", Font.BOLD, 50));
        Dimension d1 = serverTitle.getPreferredSize();
        serverTitle.setBounds(600-(d1.width/2), 300 - (d1.height) - 30, d1.width, d1.height);
        serverTitle.setOpaque(true);
        serverTitle.setVisible(true);

        //add stuff to frame here
        addrInput = new JTextField();
        addrInput.setFont(new Font("Serif", Font.PLAIN, 20));
        addrInput.setBounds(600-100, 300-25, 200, 50);
        addrInput.setOpaque(true);
        addrInput.setVisible(true);
        addrInput.addActionListener(this);

        join = new JButton("Join");
        join.setFont(new Font("Serif", Font.PLAIN, 20));
        Dimension d2 = join.getPreferredSize();
        join.setBounds(600 - (d2.width/2), 350, d2.width, d2.height);
        join.setOpaque(true);
        join.setVisible(true);
        join.addActionListener(this);

        frame.add(serverTitle);
        frame.add(addrInput);
        frame.add(join);
        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == join) {
            System.out.println("Joining " + addrInput.getText());
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
