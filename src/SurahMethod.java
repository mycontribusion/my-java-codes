
/*import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SurahMethod {
    static String surahLabeller(int countBack,boolean checkedResult,String indexedSurah) {



        if (checkedResult) {
            if (countBack == 2) {
                return ("The " + countBack + "nd Surah is Surah " + indexedSurah + " and is a Madani Surah.");
            } else if (countBack == 3) {
                return ("The " + countBack + "rd Surah is Surah " + indexedSurah + " and is a Madani Surah.");
            } else {
                return ("The " + countBack + "th Surah is Surah " + indexedSurah + " and is a Madani Surah.");
            }
        }
        else {
            if (countBack == 1) {
                return ("The " + countBack + "st Surah is Surah " + indexedSurah + " and is a Makki Surah.");
            } else {
                return ("The " + countBack + "th Surah is Surah " + indexedSurah + " and is a Makki Surah.");
            }
        }
    }

    static String surahLabellerPro (int countSurah) {
        if (countSurah < 115) {


            List<Integer> integerList = new ArrayList<>(Arrays.asList(SurahList.madaniSurahs));
            //System.out.println(noOfSurahForward + "asdf");
            String indexedSurah = SurahList.surahNames[countSurah - 1].toUpperCase();
            boolean checkedResult = integerList.contains(countSurah);
            String returnedText = surahLabeller(countSurah, checkedResult, indexedSurah);
            return returnedText;
            //label.setText(returnedText);
        }
        else {
            int remainder = countSurah % 114;
            if (remainder == 0) {
                return "The 114th Surah is Surah AN-NAS and is a Makki Surah.";
                //label.setText("The 114th Surah is Surah AN-NAS and is a Makki Surah.");
            } else {
                List<Integer> integerList = new ArrayList<>(Arrays.asList(SurahList.madaniSurahs));
                //System.out.println(noOfSurahForward + "asdf");
                String indexedSurah = SurahList.surahNames[remainder - 1].toUpperCase();
                boolean checkedResult = integerList.contains(remainder);
                String returnedText = surahLabeller(remainder, checkedResult, indexedSurah);
                return returnedText;
                //label.setText(returnedText);
            }
        }

    }



}

*/
