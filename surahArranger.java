import java.util.ArrayList;
import java.util.Arrays;
public class surahArranger {
    static String surahLabeller(int countBack,boolean checkedResult,String indexedSurah) {

    //List<Integer> integerList = new ArrayList<>(Arrays.asList(Quran.madaniSurahs));
    //List<String> nameList = new ArrayList<>(Arrays.asList(Quran.surahNames));


    //String indexedSurah = Quran.surahNames[countBack - 1].toUpperCase();
    //boolean checkedResult = integerList.contains(countBack);

                    if (checkedResult) {
        if (countBack == 2) {
            return ("The " + countBack + "nd Surah is Suratul " + indexedSurah + " and is a Madani Surah.");
        } else if (countBack == 3) {
            return ("The " + countBack + "rd Surah is Suratul " + indexedSurah + " and is a Madani Surah.");
        } else {
            return ("The " + countBack + "th Surah is Suratul " + indexedSurah + " and is a Madani Surah.");
        }
    }
                    else {
        if (countBack == 1) {
            return ("The " + countBack + "st Surah is Suratul " + indexedSurah + " and is a Makki Surah.");
        } else {
            return ("The " + countBack + "th Surah is Suratul " + indexedSurah + " and is a Makki Surah.");
        }
    }
}
            }
        /*System.out.println("Buy the paid version");
        if (count%2==0) {
            label.setText("Even count");
        }else {
            label.setText("Odd count");
        }*/


