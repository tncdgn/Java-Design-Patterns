public class Letter {

    private String header;
    private String content;

    public Letter(String header, String content) {
        this.header = header;
        this.content = content;
    }

    public LetterMemento save() {
        return new LetterMemento(content);
    }

    public void restore(LetterMemento letterMemento) {
        this.content = letterMemento.getContent();
    }

    @Override
    public String toString() {
        return "Content: " + content;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
