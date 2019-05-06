package part01.lesson06.task02;

import java.util.Random;

/**
 * @author indira
 */
public class FileManager {
    /**
     * Задание 2. Создать генератор текстовых файлов, работающий по следующим правилам:
     * <p>
     * Предложение состоит из 1<=n1<=15 слов. В предложении после произвольных слов могут находиться запятые.
     * <p>
     * Слово состоит из 1<=n2<=15 латинских букв
     * <p>
     * Слова разделены одним пробелом
     * Предложение начинается с заглавной буквы
     * Предложение заканчивается (.|!|?)+" "
     * <p>
     * Текст состоит из абзацев. в одном абзаце 1<=n3<=20 предложений. В конце абзаца стоит разрыв
     * строки и перенос каретки.
     * Есть массив слов 1<=n4<=1000. Есть вероятность probability вхождения одного из слов
     * этого массива в следующее предложение (1/probability).
     * Необходимо написать метод getFiles(String path, int n, int size, String[] words, int probability),
     * который создаст n файлов размером size в каталоге path. words - массив слов, probability - вероятность.
     */

    private static final String alphaString = "abcdefghijklmnopqrstuvxyz";
    private static final String marks = ".!?";
    private static final int maxWordsAndLettersNumber = 15;
    private static final int maxSentencesNumber = 20;
    private static final int maxSizeOfWordsArray = 1000;
    private static final int maxParagraphsNumber = 5;

    /**
     * @param path        of file
     * @param n           number of files
     * @param size        size of file
     * @param words       array of words
     * @param probability
     */
    public boolean getFiles(String path, int n, int size, String[] words, int probability) {
        return false;
    }


    /**
     * Method generates word with a-z 1-15 letters.
     *
     * @return generated word
     */
    private String generateWord(boolean isFirstWordOfSentence, boolean isLastWordOfSentence) {
        int wordSize = new Random().nextInt(maxWordsAndLettersNumber) + 1;
        StringBuilder word = new StringBuilder(wordSize);

        for (int i = 0; i < wordSize; i++) {
            int index = (int) (alphaString.length() * Math.random());
            word.append(isFirstWordOfSentence && i == 0 ? Character.toUpperCase(alphaString.charAt(index)) : alphaString.charAt(index));
        }
        return isLastWordOfSentence ? word.toString() : word.append(" ").toString();
    }


    /**
     * Method generates sentence by using method generateWord(). Sentence contains 1<=n1<=15 words.
     * Words in sentence divided by spaces. Sentence begins with a capital letter and ends with (.|!|?) + " ".
     *
     * @return generated sentence
     */
    private String generateSentence() {
        StringBuilder sentence = new StringBuilder(generateWord(true, false));
        int wordsNumber = new Random().nextInt(maxWordsAndLettersNumber) + 1;
        int commaPosition = new Random().nextInt(wordsNumber);
        for (int i = 0; i < wordsNumber; i++) {
            sentence.append(generateWord(false, false));
            if (i == commaPosition && commaPosition != wordsNumber - 1 && new Random().nextBoolean()) {
                sentence.setLength(sentence.length() - 1);
                sentence.append(", ");
            }
        }
        int index = (int) (marks.length() * Math.random());
        String mark = String.valueOf(marks.charAt(index));
        sentence.append(generateWord(false, true)).append(mark);
        return sentence.toString();
    }

    /**
     * method generates sentence by using method generateWord(). Paragraph contains 1<=n3<=25 sentences.
     *
     * @return generated sentence
     */
    private String generateParagraph(boolean isLastParagraph) {
        StringBuilder paragraph = new StringBuilder();
        int sentencesNumber = new Random().nextInt(maxSentencesNumber) + 1;
        for (int i = 0; i < sentencesNumber; i++) {
            paragraph.append(generateSentence()).append(" ");
        }
        return paragraph.append(isLastParagraph ? " " : "\n\r").toString();
    }

    public String[] generateWordsArray() {
        String[] words = new String[new Random().nextInt(maxSizeOfWordsArray) + 1];
        for (int i = 0; i < words.length; i++) {
            words[i] = generateWord(false, true);
        }

        return words;
    }

    public String generateText() {
        StringBuilder text = new StringBuilder();
        int paragraphsNumber= new Random().nextInt(maxParagraphsNumber) + 1;
        for(int i = 0; i < paragraphsNumber; i ++) {
            text.append(generateParagraph(i == paragraphsNumber - 1));
        }
        return text.toString();
    }
}
