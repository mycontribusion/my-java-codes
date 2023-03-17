import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Trying1 implements ActionListener {
    private int count = 0;
    private int countSurah = 0;
    private JButton button;
    private JLabel label;

    private JFrame frame;
    private JPanel panel;
    private JTextField text;

    public Trying1() {
        frame = new JFrame();

        button = new JButton("CLICK!");
        button.addActionListener(this);
        label = new JLabel("Type below or Click above. READY? Start!");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("SANS_SERIF",Font.BOLD,35));

        panel = new JPanel();
        text = new JTextField(10);
        text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                Integer surahEnteredByUser = Integer.parseInt(text.getText());
                List<Integer> integerList = new ArrayList<>(Arrays.asList(Quran.madaniSurahs));
                String indexedSurah = Quran.surahNames[surahEnteredByUser - 1].toUpperCase();
                boolean checkedResult = integerList.contains(surahEnteredByUser);
                String returnedText = surahArranger.surahLabeller(surahEnteredByUser,checkedResult,indexedSurah);
                label.setText(returnedText);

            }catch (Exception f) {
                    label.setText("Enter an Integer From 1-114 ONLY");
                }
            }
        });
        text.setToolTipText("Enter Surah Number");
        text.setMargin(new Insets(5,10,5,10));

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        panel.add(text);
        panel.setBackground(Color.BLACK);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("About Surahs");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Trying1();

    }


    public void actionPerformed(ActionEvent e) {

        countSurah++;
        count++;
        if (countSurah<115) {
            //int noOfSurahForward = 1;
            //System.out.println(noOfSurahForward + "asd");

            List<Integer> integerList = new ArrayList<>(Arrays.asList(Quran.madaniSurahs));
            //System.out.println(noOfSurahForward + "asdf");
            String indexedSurah = Quran.surahNames[countSurah - 1].toUpperCase();
            boolean checkedResult = integerList.contains(countSurah);
            String returnedText = surahArranger.surahLabeller(countSurah, checkedResult, indexedSurah);
            label.setText(returnedText);
        }else {
            int remainder = countSurah%114;
            if (remainder==0) {
                label.setText("The 114th Surah is Suratul NAS and is a Makki Surah.");
            }
            else {
            List<Integer> integerList = new ArrayList<>(Arrays.asList(Quran.madaniSurahs));
            //System.out.println(noOfSurahForward + "asdf");
            String indexedSurah = Quran.surahNames[remainder - 1].toUpperCase();
            boolean checkedResult = integerList.contains(remainder);
            String returnedText = surahArranger.surahLabeller(remainder, checkedResult, indexedSurah);
            label.setText(returnedText);
        }}

    }}