package screanswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreenSwing {

    private JFrame frame;
    private JTextField emailField;
    private JPasswordField passwordField;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                LoginScreenSwing window = new LoginScreenSwing();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public LoginScreenSwing() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Sign In to Your Account");
        frame.setBounds(100, 100, 300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());

        JLabel emailLabel = new JLabel("Email Address");
        frame.getContentPane().add(emailLabel);

        emailField = new JTextField();
        emailField.setColumns(10);
        frame.getContentPane().add(emailField);

        JLabel passwordLabel = new JLabel("Password");
        frame.getContentPane().add(passwordLabel);

        passwordField = new JPasswordField();
        frame.getContentPane().add(passwordField);

        JButton signInButton = new JButton("Sign In");
        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                System.out.println("Email: " + email);
                System.out.println("Password: " + password);
            }
        });
        frame.getContentPane().add(signInButton);

        JButton googleSignInButton = new JButton("Sign in with Google");
        frame.getContentPane().add(googleSignInButton);
    }
}
