import java.lang.Number;
import java.lang.String;
import java.awt.Canvas;


public class globals {
   public static String APP_NAME = "PlunkOS";
    public static String APP_VERSION = "2.0";

    public static Number CPU_CLOCK_INTERVAL = 100;
    public static  Number TIMER_IRQ = 0;
    public static Number KEYBOARD_IRQ = 1;

    cpu _Cpu = new cpu();
    memory _Mem = new memory();
    memoryManager _MemMam = new memoryManager();
    Canvas _Canvas = new Canvas();

    public static int _OSclock = 0;
    public static int _Mode = 0;


    public static int _DefaultFontSize = 13;
    public static int _FontHeightMargin = 4;
    public static String _DefaultFontFamily = "sans";

    public static Canvas _DrawingContext;


}
