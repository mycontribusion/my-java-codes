import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class QuranApp implements ActionListener {

    private int countSurah = 0;
    private JButton refreshButton;
    private JButton button;
    private JButton prevButton;
    private JLabel surahLabel;
    private JLabel detailLabel;
    private JFrame frame;
    private JTextField text;
    private JTextField startFromText;
    private JPanel clickTextPanel;
    private JPanel labelPanel;
    private JPanel detailsPanel;
    private JPanel clickPanel;
    private JPanel textPanel;
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;


    public void addComponentsToPane(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }


        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        if (shouldFill) {
            //natural height, maximum width
            c.fill = GridBagConstraints.HORIZONTAL;
        }

        prevButton = new JButton("Prev");
        if (shouldWeightX) {
            c.weightx = 0.5;
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(prevButton, c);


        text = new JTextField();
        text.setToolTipText("Enter Surah Number");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        pane.add(text, c);


        button = new JButton("Next");
        button.addActionListener(this);
        //prevButton.addActionListener(this);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        pane.add(button, c);

        surahLabel = new JLabel();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.0;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(surahLabel, c);

        refreshButton = new JButton("Refresh");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;       //reset to default
        c.weighty = 1.0;   //request any extra vertical space
        c.anchor = GridBagConstraints.PAGE_END; //bottom of space
        c.insets = new Insets(10,0,0,0);  //top padding
        c.gridx = 1;       //aligned with button 2
        c.gridwidth = 2;   //2 columns wide
        c.gridy = 2;       //third row
        pane.add(refreshButton, c);
    }

    public QuranApp() {

        frame = new JFrame();
        frame.setTitle("About Quran");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponentsToPane(frame.getContentPane());
        frame.pack();
        frame.setSize(440,170);
        frame.setResizable(false);

        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    if (countSurah>1) {
                        countSurah--;
                        surahLabel.setText(SurahList.surahLabellerPro(countSurah));
                    }
                    else {
                        surahLabel.setText("   You are at the 1st Surah.");
                    }
                }catch (Exception f) {
                    surahLabel.setText("   You are at the 1st Surah.");
                }

            }
        });
        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countSurah = 0;
                surahLabel.setText("Start");
            }
        });
        text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Integer surahEnteredByUser = Integer.parseInt(text.getText());
                    if (surahEnteredByUser<115) {
                        countSurah= surahEnteredByUser;
                        surahLabel.setText(SurahList.surahLabellerPro(countSurah));
                    }
                    else {
                        surahLabel.setText("   Enter an Integer From 1-114 ONLY.");
                    }
                }catch (Exception f) {
                    surahLabel.setText("   Enter an Integer From 1-114 ONLY.");
                }
            }
        });
    }
    public static void main(String[] args) {
        new QuranApp();
    }
    public void actionPerformed(ActionEvent e) {
        countSurah++;

        surahLabel.setText(SurahList.surahLabellerPro(countSurah));


    }
  }



