/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textanalyzer;

import javax.swing.JComboBox;

/**
 *
 * @author komal
 */
public class TextAnalyzer2Helper {
    
    private String inputString;
    
    private int textLength;
    private int wordsCount;
    private int lineCount;
    private int tabCount;
    private int spaceCount;
    private int charCount;
    private int specificWordCount=0;

    public int getSpecificWordCount() {
        return specificWordCount;
    }
    public int getSpaceCount() {
        return spaceCount;
    }

    private String uniqueCharText;

    public int getTextLength() {
        return textLength;
    }

    public int getWordsCount() {
        return wordsCount;
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getTabCount() {
        return tabCount;
    }

    public String getUniqueCharText() {
        uniqueCharText="";
        for(int i=0;i<inputString.length();i++){
            if(!uniqueCharText.contains(String.valueOf(inputString.charAt(i)))){
                uniqueCharText+=inputString.charAt(i);
            }
        }
        return uniqueCharText;
    }

    public TextAnalyzer2Helper(String inputString, String string) {
        this.inputString = inputString;
        analyze();
    }

    public int getCharCount() {
        return charCount;
    }
    
    void getCharOrWordsCount(String text,String str){
            String[] totalWords = inputString.split("[\n\t\s]",-1);
            specificWordCount=0;
            wordsCount=0;
            for (String totalWord : totalWords) {
                if (totalWord.length() > 0) {
                    wordsCount++;
                    charCount+=totalWord.length();
                }
                if(str.length()>0 &&str.equals(totalWord)){
                    specificWordCount++;
                }
            }
    }

    public String getInputString() {
        return inputString;
    }
    
    private void analyze(){
        textLength=inputString.length();
        lineCount=textLength>0?inputString.split("\n",-1).length:0;
        tabCount=inputString.split("\t",-1).length-1;
        spaceCount=inputString.split("\s",-1).length-1;
        getCharOrWordsCount(inputString,"");
        uniqueCharText=getUniqueCharText();
        String[] list=uniqueCharText.split("");
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TextAnalyzer2Helper textSample=new TextAnalyzer2Helper("a\na\nnk", "");
       // System.out.println(textSample);
    }

    @Override
    public String toString() {
        return "TextAnalyzer2Helper{" + "inputString=" + inputString + ", textLength=" + textLength + ", wordsCount=" + wordsCount + ", lineCount=" + lineCount + ", tabCount=" + tabCount + ", spaceCount=" + spaceCount + ", charCount=" + charCount + ", specificWordCount=" + specificWordCount + ", uniqueCharText=" + uniqueCharText + '}';
    }


    
}
