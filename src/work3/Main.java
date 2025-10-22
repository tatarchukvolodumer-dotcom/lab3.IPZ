package work3;

import work3.text.*;
import work3.gui.*;

/**
 * Головний запуск (Main) для пакету work3.
 * Послідовно виконує демонстрації:
 *  - текстові елементи (Decorator)
 *  - GUI елементи (Bridge)
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== work3 Main: Decorator (Text) demo ===");

        TextElement raw = new TextElement("Hello, Decorator!");
        TextComponent base = new TextElementAdapter(raw);

        System.out.println("\n-- Базовий текст --");
        base.display();
        System.out.println("Опис: " + base.getDescription());

        System.out.println("\n-- Верхній регістр --");
        TextComponent up = new UppercaseDecorator(base);
        up.display();
        System.out.println("Опис: " + up.getDescription());

        System.out.println("\n-- Додавання нової строки --");
        TextComponent nl = new NewlineDecorator(base);
        nl.display();
        System.out.println("Опис: " + nl.getDescription());

        System.out.println("\n-- Комбінований (Uppercase + Newline) --");
        TextComponent combo = new NewlineDecorator(new UppercaseDecorator(base));
        combo.display();
        System.out.println("Опис: " + combo.getDescription());

        System.out.println("\n=== work3 Main: Bridge (GUI) demo ===");

        GUIRenderer qt = new QtRenderer();
        GUIRenderer gtk = new GtkRenderer();

        Button btnQt = new Button(qt, "OK", 10, 10, 80, 30);
        btnQt.draw();
        System.out.println(btnQt.getDescription());
        btnQt.click();

        Window winGtk = new Window(gtk, "Main Window", 0, 0, 640, 480);
        winGtk.draw();
        System.out.println(winGtk.getDescription());
        winGtk.save();

        Checkbox cbQt = new Checkbox(qt, "Accept terms", 15, 50, false);
        cbQt.draw();
        cbQt.toggle();
        cbQt.draw();

        System.out.println("\n=== work3 Main finished ===");
    }
}
