import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SurahList {
    static String name = "Qur'an Al-Kareem";
    static String author = "Allah";
    static int numberOfChapters = 114;
    static int numberOfPages = 604;
    static Integer[] madaniSurahs = new Integer[] {2,3,4,5,8,9,13,22,24,33,47,48,49,55,57,58,59,60,61,62,63,64,65,66,76,
            98,99,110};
    static String[] surahNames = new String[] {"al-Fatihah","al-baqarah","Aal-e-imran","an-nisa'","al-ma'idah",
            "al-an'am","al-a'raf","al-anfal","at-taubah","yunus","hud","yusuf","ar-ra'd", "ibrahim","al-hijr",
            "an-nahl", "al-isra'","al-kahf","maryam","ta ha","al-anbiya","al-hajj","al-mu'minun","an-nur",
            "al-furqan","ash-shu'ara'","an-naml","al-qasas","al-'ankabut","ar-rum","luqman","as-sajdah",
            "al-ahzab","saba'","fatir","ya sin","as-saffat","sad","az-zumar","ghafir","fussilat","ash-shura",
            "az-zukhruf","ad-dukhan","al-jathiyah","al-ahqaf","Muhammad","al-fath","al-hujurat","qaf",
            "adh-dhariyat","at-tur","an-najm","al-qamar","ar-Rahman","al-waqi'ah","al-hadid","al-mujadila",
            "al-hashr","al-mumtahanah","as-saf","al-jumu'ah","al-munafiqun","at-tagabun","at-talaq","at-tahrim",
            "al-mulk","al-qalam","al-haqqah","al-ma'arij","nuh","al-jinn","al-muzzammil","al-muddaththir",
            "al-qiyamah","al-insan","al-mursalat","an-naba'","an-nazi'at","'abasa","at-takwir","al-infitar",
            "al-mutaffifin","al-inshiqaq","al-buruj","at-tariq","al-A'la","al-ghashiyah","al-fajr","al-balad",
            "ash-shams","al-layl","ad-duhaa","ash-sharh","at-tin","al-'alaq","al-qadr","al-bayyinah","az-zalzalah",
            "al-'adiyat","al-qari'ah","at-takathur","al-'asr","al-humazah","al-fil","quraish","al-ma'un",
            "al-kawthar","al-kafirun","an-nasr","al-masad","al-ikhlas","al-falaq","an-nas"};

    static String surahLabeller(int countBack,boolean checkedResult,String indexedSurah) {



        if (checkedResult) {
            if (countBack%10 == 1) {
                return ("   The " + countBack + "st Surah is Surah " + indexedSurah + " and is a Madani Surah.");
            } else if (countBack%10 == 2) {
                return ("   The " + countBack + "nd Surah is Surah " + indexedSurah + " and is a Madani Surah.");
            } else if (countBack%10 == 3 && (countBack != 13)) {
                return ("   The " + countBack + "rd Surah is Surah " + indexedSurah + " and is a Madani Surah.");
            } else {
                return ("   The " + countBack + "th Surah is Surah " + indexedSurah + " and is a Madani Surah.");
            }
        }
        else {
            if (countBack%10 == 1 && (countBack != 11) && (countBack != 111)) {
                return ("   The " + countBack + "st Surah is Surah " + indexedSurah + " and is a Makki Surah.");
            } else if (countBack%10 == 2 && (countBack != 12)  && (countBack != 112)) {
                return ("   The " + countBack + "nd Surah is Surah " + indexedSurah + " and is a Makki Surah.");
            } else if (countBack%10 == 3 && (countBack != 113)) {
                return ("   The " + countBack + "rd Surah is Surah " + indexedSurah + " and is a Makki Surah.");
            }else {
                return ("   The " + countBack + "th Surah is Surah " + indexedSurah + " and is a Makki Surah.");
            }
        }
    }
    static String surahLabellerPro (int countSurah) {

        if (countSurah < 115) {

            List<Integer> integerList = new ArrayList<>(Arrays.asList(madaniSurahs));

            String indexedSurah = surahNames[countSurah - 1].toUpperCase();
            boolean checkedResult = integerList.contains(countSurah);
            return surahLabeller(countSurah, checkedResult, indexedSurah);

        } else {
            int remainder = countSurah % 114;
            if (remainder == 0) {
                return "   The 114th Surah is Surah AN-NAS and is a Makki Surah.";

            } else {
                List<Integer> integerList = new ArrayList<>(Arrays.asList(madaniSurahs));

                String indexedSurah = surahNames[remainder - 1].toUpperCase();
                boolean checkedResult = integerList.contains(remainder);
                return surahLabeller(remainder, checkedResult, indexedSurah);

            }
        }
    }



    }

