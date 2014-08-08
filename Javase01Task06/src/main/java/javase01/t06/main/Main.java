package javase01.t06.main;

import javase01.t06.logic.Note;
import javase01.t06.logic.NoteBookManager;
import java.util.List;

public class Main {
    public static void main(String [] args){
        NoteBookManager manager = new NoteBookManager();
        manager.addNote("String0");
        manager.addNote("String1");
        manager.addNote("String2");
        manager.addNote("String3");
        manager.addNote("String4");
        manager.addNote("String5");
        manager.addNote("String6");
        manager.addNote("String7");
        manager.addNote("String8");
        manager.addNote("String9");
        manager.addNote("String10");
        manager.addNote("String11");
        manager.addNote("String12");


        //manager.getListNotes().get(2).




/*
        List<Note> ln = manager.getListNotes();

        for(Note note:manager.getListNotes()){
            System.out.println(note.getNote()+ "\t" + note.getID());
        }

        if(manager.deleteNote(3)){
            System.out.println("Succesfull deleted");
        } else{
            System.out.println("Cant delete");
        }

        if(manager.deleteNote("String5")){
            System.out.println("Succesfull deleted");
        } else{
            System.out.println("Cant delete");
        }

        manager.setNote(6, "newString6");
        manager.setNote("String9", "newString9");



        for(Note note:manager.getListNotes()){
            System.out.println(note.getNote()+ "\t" + note.getID());
        }


        System.out.println("---------------------------");
        System.out.println(manager.getNote(6).getNote());
        System.out.println(manager.getNote("String11").getNote());
    */


    }
}
