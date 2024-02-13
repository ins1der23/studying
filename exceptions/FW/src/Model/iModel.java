package Model;

import java.util.HashMap;

import Model.Domain.Note;


/**
 * Инерфейс для Model
 */
public interface iModel {

    HashMap<String, String> getNotes();

    Boolean add(Note note);
}
