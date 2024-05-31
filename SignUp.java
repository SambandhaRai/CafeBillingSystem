import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    JLabel fname, lname, gender, address, contact, email, password;
    JTextField n1, n2, adr, con, e1, pw;
    JRadioButton male, female;
    JButton sign,back;
    ImageIcon background;

    MyFrame() {
        setTitle("Registration Form");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Load the background image
        background = new ImageIcon("/Users/sambandharai/Downloads/12F758EB-1D52-4037-8D32-C2EA31E778E1.JPEG");

        // Custom panel with background image
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background colour
                g.setColor(Color.decode("#F9E8DE"));
                g.fillRect(0, 0, getWidth(), getHeight());
                if (background != null){
                g.drawImage(background.getImage(), 350, 40, 450, 360, this);
                }
            }
        };
        panel.setLayout(null);

        fname = new JLabel("First Name");
        fname.setBounds(90, 50, 100, 20);
        panel.add(fname);

        n1 = new JTextField();
        n1.setBounds(170, 50, 200, 20);
        panel.add(n1);

        lname = new JLabel("Last Name");
        lname.setBounds(90, 100, 100, 20);
        panel.add(lname);

        n2 = new JTextField();
        n2.setBounds(170, 100, 200, 20);
        panel.add(n2);

        gender = new JLabel("Gender");
        gender.setBounds(90, 150, 100, 20);
        panel.add(gender);

        male = new JRadioButton("Male");
        male.setBounds(170, 150, 80, 20);
        panel.add(male);

        female = new JRadioButton("Female");
        female.setBounds(250, 150, 80, 20);
        panel.add(female);

        ButtonGroup gen = new ButtonGroup();
        gen.add(male);
        gen.add(female);

        address = new JLabel("Address");
        address.setBounds(90, 200, 100, 20);
        panel.add(address);

        adr = new JTextField();
        adr.setBounds(170, 200, 200, 20);
        panel.add(adr);

        contact = new JLabel("Contact No.");
        contact.setBounds(90, 250, 200, 20);
        panel.add(contact);

        con = new JTextField();
        con.setBounds(170, 250, 200, 20);
        panel.add(con);

        email = new JLabel("Email");
        email.setBounds(90, 300, 100, 20);
        panel.add(email);

        e1 = new JTextField();
        e1.setBounds(170, 300, 200, 20);
        panel.add(e1);

        password = new JLabel("Password");
        password.setBounds(90, 350, 100, 20);
        panel.add(password);

        pw = new JTextField();
        pw.setBounds(170, 350, 200, 20);
        panel.add(pw);

        sign = new JButton("Sign Up");
        sign.setBounds(200, 400, 80, 20);
        panel.add(sign);

        back = new JButton("Back");
        back.setBounds(10,14,50,20);
        panel.add(back);

        setContentPane(panel);
        setVisible(true);
    }
}

class SignUp {
    public static void main(String[] args) {
        new MyFrame();
    }
}