package work3.gui;

/**
 * Коротка демонстрація Bridge: створюємо Button/Window/Checkbox з QtRenderer і GtkRenderer.
 */
public class GuiDemo {
    public static void main(String[] args) {
        System.out.println("=== GuiDemo ===");

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
    }
}
