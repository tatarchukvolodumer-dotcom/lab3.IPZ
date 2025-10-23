package work3.text;

/**
 * TextDemo — демонстрація використання TextElementAdapter та декораторів.
 * Показує 4 варіанти:
 *  - базовий текст без ефектів,
 *  - текст у верхньому регістрі,
 *  - текст з додаванням нової строки,
 *  - комбінований (верхній регістр + нова строка).
 */
public class TextDemo {
    public static void main(String[] args) {
        System.out.println("=== TextDemo ===");

        TextElement raw = new TextElement("Hello, Decorator!");
        TextComponent base = new TextElementAdapter(raw);

        // 1) Базовий текст
        System.out.println("--- Базовий ---");
        base.display();
        System.out.println("Опис: " + base.getDescription());

        // 2) Верхній регістр
        System.out.println("\n--- Uppercase ---");
        TextComponent up = new UppercaseDecorator(base);
        up.display();
        System.out.println("Опис: " + up.getDescription());

        // 3) Додавання нової строки
        System.out.println("\n--- Newline ---");
        TextComponent nl = new NewlineDecorator(base);
        nl.display();
        System.out.println("Опис: " + nl.getDescription());

        // 4) Комбінований
        System.out.println("\n--- Combined (Uppercase + Newline) ---");
        TextComponent combo = new NewlineDecorator(new UppercaseDecorator(base));
        combo.display();
        System.out.println("Опис: " + combo.getDescription());
    }
}
