package Main;

public class Main {
    public static void main(String[] args) {
        StringBuffer text = new StringBuffer("Today is such a wonderful day. Oh no, today is the last day to pass the laboratory on operating systems. Well, then I will cry and sit down to make code in my favorite c++.");
        StringOperation op = new StringOperation();
        op.sortSentences(text);
    }
}