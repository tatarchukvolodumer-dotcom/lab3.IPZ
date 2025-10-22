package work3.text;

/**
 * Демонстраційна версія існуючого класу TextElement.
 * У реальному завданні цей клас вже заданий і його змінювати не можна.
 *
 * Тут лише простий контейнер рядка з геттерами/сеттером.
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
     * Відображення — у реальному класі може робити щось інше.
     * Тут — заглушка (необов'язково використовувати).
     */
    public void display() {
        System.out.println("TextElement.display(): \"" + text + "\"");
    }
}
