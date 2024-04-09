import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Updated_Rules extends JFrame implements ActionListener {

    String name;
    JButton start, back;

    Updated_Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 105, 710, 400);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
                "<html>" +
                        "<div style='text-align: justify;'>" +
                        "<h1>Quiz Rules</h1>" +
                        "<p>Welcome to the Ultimate Java Quiz! Please take a moment to review the rules before you begin.</p>" +
                        "<ul>" +
                        "<li><b>General Conduct:</b> Be respectful to the quiz environment. Any form of dishonesty or disruption will result in immediate disqualification.</li>" +
                        "<li><b>Quiz Structure:</b> The quiz consists of 35 multiple-choice questions. Each question must be answered within 60 seconds.</li>" +
                        "<li><b>Scoring:</b> Each correct answer awards you 10 points. There are no penalties for incorrect answers, so guess if you're unsure!</li>" +
                        "<li><b>Review and Feedback:</b> After completing the quiz, you will be able to review your answers and see the correct solutions.</li>" +
                        "<li><b>Re-attempts:</b> Participants are allowed to retake the quiz, but only your latest score will be considered for any rankings or prizes.</li>" +
                        "<li><b>Technical Issues:</b> In case of a technical glitch, please report it immediately. Provisions for re-attempts can be made in genuine cases.</li>" +
                        "<li><b>Play Fair:</b> Attempt the quiz without external help. Let’s keep the competition fair and fun for everyone.</li>" +
                        "</ul>" +
                        "<p>Good luck, and may the best Java enthusiast win!</p>" +
                        "</div>" +
                        "</html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(250, 520, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400, 520, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800, 700);
        setLocation(330, 80);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            // Assuming the Quiz class is prepared to receive the participant's name and start the quiz
            setVisible(false);
            new Quiz(name); // Make sure there is a constructor in Quiz that accepts a String parameter
        } else {
            // Assuming the Login class has a no-argument constructor that brings up the login screen
            setVisible(false);
            new Login(); // Make sure the Login class is ready to be instantiated like this
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
