import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JFrame frame; //It's a window
    JPanel panel; //A rectangular region inside
    JPanel fillerPanel1;
    JPanel fillerPanel2;
    JPanel fillerPanel3;
    JPanel fillerPanel4;
    JLabel label;
    JLabel cost1;
    JLabel cost2;
    JLabel cost3;
    JLabel cost4;
    JLabel cost5;
    JLabel cost6;
    JLabel cost7;
    JLabel cost8;
    JLabel cost9;
    JLabel cost10;
    JLabel cost11;
    JButton blueyButton;
    JButton upgradeButton1;
    JButton upgradeButton2;
    JButton upgradeButton3;
    JButton upgradeButton4;
    JButton upgradeButton5;
    JButton upgradeButton6;
    JButton upgradeButton7;
    JButton upgradeButton8;
    JButton upgradeButton9;
    JButton upgradeButton10;
    JButton upgradeButton11;
    Game bluey;
    ActionListener guiUpdate;
    Timer updateTimer;

    public GUI() {
        this.bluey = new Game();
        frame = new JFrame();
        panel = new JPanel();
        fillerPanel1 = new JPanel();
        fillerPanel2 = new JPanel();
        fillerPanel3 = new JPanel();
        fillerPanel4 = new JPanel();
        label = new JLabel("Bluey Counter: ");
        cost1 = new JLabel("Bingo Upgrade Cost: " + bluey.upgrade1Cost);
        cost2 = new JLabel("Chilli Upgrade Cost: " + bluey.upgrade2Cost);
        cost3 = new JLabel("Bandit Upgrade Cost: " + bluey.upgrade3Cost);
        cost4 = new JLabel("Socks Upgrade Cost: " + bluey.upgrade4Cost);
        cost5 = new JLabel("Muffin Upgrade Cost: " + bluey.upgrade5Cost);
        cost6 = new JLabel("Jack Upgrade Cost: " + bluey.upgrade6Cost);
        cost7 = new JLabel("Pom Pom Upgrade Cost: " + bluey.upgrade7Cost);
        cost8 = new JLabel("Juno Upgrade Cost: " + bluey.upgrade8Cost);
        cost9 = new JLabel("Snickers Upgrade Cost: " + bluey.upgrade9Cost);
        cost10 = new JLabel("Lulu Upgrade Cost: " + bluey.upgrade10Cost);
        cost11 = new JLabel("Chloe Upgrade Cost: " + bluey.upgrade11Cost);
        blueyButton = new JButton(new ImageIcon("C:\\Users\\DanaVartanova\\Desktop\\Bluey_gday_family_and_friends_bluey-removebg-preview.png"));
        blueyButton.setBackground(new Color(114,191,237));
        upgradeButton1 = new JButton(new ImageIcon("C:\\Users\\DanaVartanova\\Desktop\\Bingo2.png"));
        upgradeButton1.setBackground(new Color(241,184,115));
        upgradeButton2 = new JButton(new ImageIcon("C:\\Users\\DanaVartanova\\Desktop\\Chilli.png"));
        upgradeButton2.setBackground(new Color(228,220,189));
        upgradeButton3 = new JButton(new ImageIcon("C:\\Users\\DanaVartanova\\Desktop\\uyczhaa0ijt81-removebg-preview.png"));
        upgradeButton3.setBackground(new Color(43,44,65));
        upgradeButton4 = new JButton(new ImageIcon("C:\\Users\\DanaVartanova\\Desktop\\Socks.png"));
        upgradeButton4.setBackground(new Color(64,64,102));
        upgradeButton5 = new JButton(new ImageIcon("C:\\Users\\DanaVartanova\\Desktop\\muffin-bluey-character-free-vector-removebg-preview.png"));
        upgradeButton5.setBackground(new Color(210,235,255));
        upgradeButton6 = new JButton(new ImageIcon("C:\\Users\\DanaVartanova\\Desktop\\images-removebg-preview.png"));
        upgradeButton6.setBackground(new Color(64,64,102));
        upgradeButton7 = new JButton(new ImageIcon("C:\\Users\\DanaVartanova\\Desktop\\Pom-Pom-fixed-removebg-preview.png"));
        upgradeButton7.setBackground(new Color(114,191,237));
        upgradeButton8 = new JButton(new ImageIcon("C:\\Users\\DanaVartanova\\Desktop\\Juno.png"));
        upgradeButton8.setBackground(new Color(43,44,65));
        upgradeButton9 = new JButton(new ImageIcon("C:\\Users\\DanaVartanova\\Desktop\\Snickers.png"));
        upgradeButton9.setBackground(new Color(228,220,189));
        upgradeButton10 = new JButton(new ImageIcon("C:\\Users\\DanaVartanova\\Desktop\\Lulu.png"));
        upgradeButton10.setBackground(new Color(210,235,255));
        upgradeButton11 = new JButton(new ImageIcon("C:\\Users\\DanaVartanova\\Desktop\\Chloe.png"));
        upgradeButton11.setBackground(new Color(237,204,111));

        blueyButton.addActionListener(this);
        upgradeButton1.addActionListener(e -> {
            bluey.buyUpgrade1();
        });
        upgradeButton2.addActionListener(e -> {
            bluey.buyUpgrade2();
        });
        upgradeButton3.addActionListener(e -> {
            bluey.buyUpgrade3();
        });
        upgradeButton4.addActionListener(e -> {
            bluey.buyUpgrade4();
        });
        upgradeButton5.addActionListener(e -> {
            bluey.buyUpgrade5();
        });
        upgradeButton6.addActionListener(e -> {
            bluey.buyUpgrade6();
        });
        upgradeButton7.addActionListener(e -> {
            bluey.buyUpgrade7();
        });
        upgradeButton8.addActionListener(e -> {
           bluey.buyUpgrade8();
        });
        upgradeButton9.addActionListener(e -> {
            bluey.buyUpgrade9();
        });
        upgradeButton10.addActionListener(e -> {
            bluey.buyUpgrade10();
        });
        upgradeButton11.addActionListener(e -> {
            bluey.buyUpgrade11();
        });

        guiUpdate = new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Bluey Counter: "+bluey.blueyCounter + "");//This is the only piece of code that does anything
                label.setForeground(Color.WHITE);

                cost1.setText("Bingo Upgrade Cost: " + bluey.upgrade1Cost);
                cost1.setForeground(Color.WHITE);

                cost2.setText("Chilli Upgrade Cost: " + bluey.upgrade2Cost);
                cost2.setForeground(Color.WHITE);

                cost3.setText("Bandit Upgrade Cost: " + bluey.upgrade3Cost);
                cost3.setForeground(Color.WHITE);

                cost4.setText("Socks Upgrade Cost: " + bluey.upgrade4Cost);
                cost4.setForeground(Color.WHITE);

                cost5.setText("Muffin Upgrade Cost: " + bluey.upgrade5Cost);
                cost5.setForeground(Color.WHITE);

                cost6.setText("Jack Upgrade Cost: " + bluey.upgrade6Cost);
                cost6.setForeground(Color.WHITE);

                cost7.setText("Pom Pom Upgrade Cost: " + bluey.upgrade7Cost);
                cost7.setForeground(Color.WHITE);

                cost8.setText("Juno Upgrade Cost: " + bluey.upgrade8Cost);
                cost8.setForeground(Color.WHITE);

                cost9.setText("Snickers Upgrade Cost: " + bluey.upgrade9Cost);
                cost9.setForeground(Color.WHITE);

                cost10.setText("Lulu Upgrade Cost: " + bluey.upgrade10Cost);
                cost10.setForeground(Color.WHITE);

                cost11.setText("Chloe Upgrade Cost: " + bluey.upgrade11Cost);
                cost11.setForeground(Color.WHITE);

            }
        };
            updateTimer = new Timer(500,guiUpdate); //delay, the thing to do.
            updateTimer.start();


            //first need to add the label to the panel
        //PROPERTIES
        panel.setLayout(new GridLayout(2,3));


        panel.add(blueyButton);
        panel.add(upgradeButton1);
        panel.add(upgradeButton2);
        panel.add(label);//each element needs to be added to our panel after creation
        panel.add(cost1);
        panel.add(cost2);
        panel.setBackground(new Color(48, 89, 138));
        panel.setSize(400,100);
        //next, we add the panel to the frame
        frame.add(panel);

        fillerPanel1.setLayout(new GridLayout(2,3));
        fillerPanel1.add(upgradeButton3);
        fillerPanel1.add(upgradeButton4);
        fillerPanel1.add(upgradeButton5);
        fillerPanel1.add(cost3);
        fillerPanel1.add(cost4);
        fillerPanel1.add(cost5);
        fillerPanel1.setBackground(new Color(114,191,237));
        fillerPanel1.setSize(400,400);
        frame.add(fillerPanel1);

        fillerPanel2.setLayout(new GridLayout(2,3));
        fillerPanel2.setBackground(new Color(226,122,55));
        fillerPanel2.add(upgradeButton6);
        fillerPanel2.add(upgradeButton7);
        fillerPanel2.add(upgradeButton8);
        fillerPanel2.add(cost6);
        fillerPanel2.add(cost7);
        fillerPanel2.add(cost8);
        fillerPanel2.setSize(400,400);
        frame.add(fillerPanel2);

        fillerPanel3.setLayout(new GridLayout(2,3));
        fillerPanel3.setBackground(new Color(241,184,115));
        fillerPanel3.add(upgradeButton9);
        fillerPanel3.add(upgradeButton10);
        fillerPanel3.add(upgradeButton11);
        fillerPanel3.add(cost9);
        fillerPanel3.add(cost10);
        fillerPanel3.add(cost11);
        fillerPanel3.setSize(400,400);
        frame.add(fillerPanel3);


        frame.setSize(600,400);
        frame.setLayout(new GridLayout(2,2));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        bluey.click();
        label.setText("Bluey Counter: "+bluey.blueyCounter+"");

    }

}
