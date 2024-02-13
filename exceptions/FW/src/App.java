
import Controller.MainControl;
import Model.iModel;
import Model.Sevice.FileModel;
import View.ConsoleView;
import View.iView;

public class App {
    public static void main(String[] args) {
      
        // строка для тестов:
        // "Васин 23.08.1982 79221700106 M Василий Сергеевич"
        
        
        iModel fModel = new FileModel("Notes");
        iView cView = new ConsoleView();

        MainControl control = new MainControl(fModel, cView);
        control.Run();

    }
}
