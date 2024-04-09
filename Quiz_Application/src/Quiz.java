import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {

    String questions[][] = new String[35][5];
    String answers[][] = new String[35][2];
    String useranswers[][] = new String[35][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;

    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;

    String name;

    Quiz(String name) {
        this.name = name;
        setBounds(50, 0, 1230, 770);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1230, 370);
        add(image);

        qno = new JLabel();
        qno.setBounds(50, 420, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);

        question = new JLabel();
        question.setBounds(50, 450, 800, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);

        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

        questions[10][0] = "Which of these access specifiers can be used for an interface?";
        questions[10][1] = "public";
        questions[10][2] = "private";
        questions[10][3] = "protected";
        questions[10][4] = "None of the above";

        questions[11][0] = "What is the size of char in Java?";
        questions[11][1] = "16 bits";
        questions[11][2] = "8 bits";
        questions[11][3] = "32 bits";
        questions[11][4] = "64 bits";

        questions[12][0] = "What does the expression float a = 35 / 0 return?";
        questions[12][1] = "0";
        questions[12][2] = "Infinity";
        questions[12][3] = "Not a Number";
        questions[12][4] = "Run time exception";

        questions[13][0] = "Which method of the Class.class is used to determine the name of a class represented by the class object as a String?";
        questions[13][1] = "getName()";
        questions[13][2] = "getSimpleName()";
        questions[13][3] = "toString()";
        questions[13][4] = "getClass()";

        questions[14][0] = "Which of the following is true about the final keyword?";
        questions[14][1] = "final methods can be overridden";
        questions[14][2] = "final classes can be extended";
        questions[14][3] = "final variable values can be changed";
        questions[14][4] = "final variable can be initialized only once";

        questions[15][0] = "Which of these is not a bitwise operator?";
        questions[15][1] = "&";
        questions[15][2] = "&&";
        questions[15][3] = "|";
        questions[15][4] = "^";

        questions[16][0] = "Which exception is thrown when trying to access an element with an index that is out of bounds?";
        questions[16][1] = "ArrayIndexOutOfBoundsException";
        questions[16][2] = "IndexOutOfBoundsException";
        questions[16][3] = "Exception";
        questions[16][4] = "RuntimeException";

        questions[17][0] = "Which of these keywords is used to manually throw an exception?";
        questions[17][1] = "throw";
        questions[17][2] = "throws";
        questions[17][3] = "try";
        questions[17][4] = "catch";

        questions[18][0] = "Which of these is not a valid entry point for a java program?";
        questions[18][1] = "main()";
        questions[18][2] = "start()";
        questions[18][3] = "run()";
        questions[18][4] = "init()";

        questions[19][0] = "What is the default value of a local variable?";
        questions[19][1] = "null";
        questions[19][2] = "0";
        questions[19][3] = "Depends on type";
        questions[19][4] = "Not assigned";

        questions[20][0] = "Which of the following is not a Java feature?";
        questions[20][1] = "Dynamic";
        questions[20][2] = "Architecture Neutral";
        questions[20][3] = "Use of pointers";
        questions[20][4] = "Object-oriented";

        questions[21][0] = "What does the 'static' keyword in a method signature mean?";
        questions[21][1] = "The method belongs to the class, not a specific instance";
        questions[21][2] = "The method can't be changed";
        questions[21][3] = "The method is finalized";
        questions[21][4] = "The method is synchronized";

        questions[22][0] = "What is not a component of Java's non-access modifiers?";
        questions[22][1] = "final";
        questions[22][2] = "abstract";
        questions[22][3] = "synchronized";
        questions[22][4] = "protected";

        questions[23][0] = "Which collection class allows you to grow or shrink its size and provides indexed access to its elements, but is not synchronized?";
        questions[23][1] = "java.util.ArrayList";
        questions[23][2] = "java.util.Vector";
        questions[23][3] = "java.util.HashSet";
        questions[23][4] = "java.util.LinkedHashSet";

        questions[24][0] = "Which of these lifecycle methods of the Applet class is called only once in its lifetime?";
        questions[24][1] = "init()";
        questions[24][2] = "start()";
        questions[24][3] = "stop()";
        questions[24][4] = "destroy()";

        questions[25][0] = "The process of converting a primitive type to a reference type is known as?";
        questions[25][1] = "Boxing";
        questions[25][2] = "Unboxing";
        questions[25][3] = "AutoBoxing";
        questions[25][4] = "None of the above";

        questions[26][0] = "Which operator is used to allocate memory for an object?";
        questions[26][1] = "new";
        questions[26][2] = "malloc";
        questions[26][3] = "alloc";
        questions[26][4] = "memory";

        questions[27][0] = "Which of these is a legal identifier in Java?";
        questions[27][1] = "$identifier";
        questions[27][2] = "-identifier";
        questions[27][3] = "*identifier";
        questions[27][4] = "+identifier";

        questions[28][0] = "What is the range of short data type in Java?";
        questions[28][1] = "-32,768 to 32,767";
        questions[28][2] = "-128 to 127";
        questions[28][3] = "0 to 65,535";
        questions[28][4] = "-2,147,483,648 to 2,147,483,647";

        questions[29][0] = "Which method can be defined only once in a program?";
        questions[29][1] = "main method";
        questions[29][2] = "finalize method";
        questions[29][3] = "static method";
        questions[29][4] = "private method";

        questions[30][0] = "Which of these is not a function of the Object class?";
        questions[30][1] = "toString()";
        questions[30][2] = "finalize()";
        questions[30][3] = "equals()";
        questions[30][4] = "clone()";

        questions[31][0] = "Which of the following is not a Java modifier?";
        questions[31][1] = "public";
        questions[31][2] = "protected";
        questions[31][3] = "transient";
        questions[31][4] = "main";

        questions[32][0] = "Which of these values can a boolean variable contain?";
        questions[32][1] = "True and False";
        questions[32][2] = "0 and 1";
        questions[32][3] = "Any integer value";
        questions[32][4] = "None of the above";

        questions[33][0] = "Which of the following is a reserved word in Java?";
        questions[33][1] = "interface";
        questions[33][2] = "String";
        questions[33][3] = "Float";
        questions[33][4] = "unsigned";

        questions[34][0] = "Which of the following is true about a do-while loop?";
        questions[34][1] = "Executes at least once";
        questions[34][2] = "Executes zero or more times";
        questions[34][3] = "Is the same as a while loop";
        questions[34][4] = "None of the above";

//        questions[35][0] = "What is the output of 'System.out.println(1 + 2 + \"3\");' ?";
//        questions[35][1] = "33";
//        questions[35][2] = "123";
//        questions[35][3] = "6";
//        questions[35][4] = "None of the above";

        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";
        answers[10][1] = "public";
        answers[11][1] = "16 bits";
        answers[12][1] = "Infinity";
        answers[13][1] = "getName()";
        answers[14][1] = "final variable can be initialized only once";
        answers[15][1] = "&&";
        answers[16][1] = "ArrayIndexOutOfBoundsException";
        answers[17][1] = "throw";
        answers[18][1] = "start()";
        answers[19][1] = "Not assigned";
        answers[20][1] = "Use of pointers";
        answers[21][1] = "The method belongs to the class, not a specific instance";
        answers[22][1] = "protected";
        answers[23][1] = "java.util.ArrayList";
        answers[24][1] = "init()";
        answers[25][1] = "Boxing";
        answers[26][1] = "new";
        answers[27][1] = "$identifier";
        answers[28][1] = "-32,768 to 32,767";
        answers[29][1] = "main method";
        answers[30][1] = "clone()";
        answers[31][1] = "main";
        answers[32][1] = "True and False";
        answers[33][1] = "interface";
        answers[34][1] = "Executes at least once";
//        answers[35][1] = "33";

        opt1 = new JRadioButton();
        opt1.setBounds(150, 500, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(150, 540, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(150, 580, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(150, 620, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);

        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);

        next = new JButton("Next");
        next.setBounds(900, 500, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        lifeline = new JButton("50-50 Lifeline");
        lifeline.setBounds(900, 580, 200, 40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);

        submit = new JButton("Submit");
        submit.setBounds(900, 660, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

//        JButton checkScore = new JButton("Check Score");
//        checkScore.setBounds(900, 710, 200, 40); // Adjust the position as needed
//        checkScore.setFont(new Font("Tahoma", Font.PLAIN, 22));
//        checkScore.setBackground(new Color(30, 144, 255));
//        checkScore.setForeground(Color.WHITE);
//        checkScore.addActionListener(this);
//        add(checkScore);


        start(count);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            if (count == 8) {
//                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
//            lifeline.setEnabled(false);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

//            for (int i = 0; i < useranswers.length; i++) {
//                    if (useranswers[i][0].equals(answers[i][1])) {
//                        score += 10;
//                    }
            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0] != null && useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                }
                    else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));

        if (timer > 0) {
            g.drawString(time, 900, 450);
        } else {
            g.drawString("Times up!!", 900, 450);
        }

        timer--; // 14

        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 33) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 33) { // submit button
                if (groupoptions.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }

                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }

    }

    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        groupoptions.clearSelection();
    }

    public static void main(String[] args) {
        new Quiz("User");
    }
}