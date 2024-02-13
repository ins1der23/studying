package Controller;

import Model.iModel;
import Model.Domain.Note;
import Model.Domain.NoteParser;
import View.UiText;
import View.iView;


/**
 * Главный контролллер
 */
public class MainControl {
    
    private NoteParser noteParser;
    private iModel fModel;
    private iView cView;
    private UiText uiText;

    public MainControl(iModel fModel, iView cView) {
        this.fModel = fModel;
        this.cView = cView;
        this.uiText = new UiText();
        noteParser = new NoteParser();
    }

    public void Run() {
        Boolean flag = true;

        while (flag) {

            String input = cView.getString(uiText.inputData, true);
            if (input.toUpperCase().equals("QUIT"))
                return;
            noteParser.setNote(input);
            cView.pressEnter(uiText.pressEnter);
            Note note = noteParser.getNote();
            if (note.getSurname() != null) {
                System.out.println(note);
                if (fModel.add(note))
                    cView.showString(uiText.successSave, true);
                cView.pressEnter(uiText.pressEnter);
            }
        }
    }
}
