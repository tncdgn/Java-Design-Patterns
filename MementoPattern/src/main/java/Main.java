public class Main {
    public static void main(String[] args) {

        Letter letter = new Letter("Dear Mr. Jonas", "Hello");
        letter.setContent("How are you?");

        LetterMemento memento = letter.save();

        letter.setContent("I hope, you are fine");

        System.out.println(letter);

        letter.restore(memento);

        System.out.println(letter);
    }
}
