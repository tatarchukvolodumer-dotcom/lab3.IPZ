package work3.text;

/**
 * Демонстраційна версія існуючого класу TextElement.
 * У завданні цей клас вже заданий і його змінювати не можна.
 */
public class TextElement {
    private final String text;

    public TextElement(String text) {
        this.text = text;
    }

    /**
     * Повертає сирий текст елемента.
     * @return текст
     */
    public String getText() {
        return text;
    }

    /**
     * Заглушка.
     */
    public void display() {
        System.out.println("TextElement.display(): \"" + text + "\"");
    }
}
