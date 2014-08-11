package javase01.t06.main;

import javase01.t06.logic.Note;
import javase01.t06.logic.NoteBookManager;
import javase01.t06.logic.NoteBook;

public class Main {
    public static void main(String [] args){

        NoteBook noteBook1 = new NoteBook();

        NoteBookManager manager = new NoteBookManager(noteBook1);

        manager.addNote("String0");
        manager.addNote("String1");
        manager.addNote("String2");
        manager.addNote("String3");
        manager.addNote("String4");
        manager.addNote("String5");
        manager.addNote("String6");
        manager.addNote("String7");

        printNotes(manager);
        System.out.println("-------------------------");

        NoteBook noteBook2 = new NoteBook();
        manager.manage(noteBook2);

        manager.addNote("String0000");
        manager.addNote("String0001");
        manager.addNote("String0002");
        manager.addNote("String0003");
        manager.addNote("String0004");
        manager.addNote("String0005");
        manager.addNote("String0006");
        manager.addNote("String0007");
        manager.addNote("String0008");
        manager.addNote("String0009");
        manager.addNote("String0010");
        manager.addNote("String0011");
        manager.addNote("String0012");

        printNotes(manager);
        System.out.println("-------------------------");
        manager.manage(noteBook1);

        printNotes(manager);



/*
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

        if(manager.deleteNote("String5")){
            System.out.println("Succesfull deleted");
        } else{
            System.out.println("Cant delete");
        }

        manager.setNote(6, "newString6");
        manager.setNote("String9", "newString9");



        for(Note note:manager.getUnmodifiableListNotes()){
            System.out.println(note.getNote()+ "\t" + note.getID());
        }


        System.out.println("---------------------------");
        System.out.println(manager.getNote(6).getNote());
        System.out.println(manager.getNote("String11").getNote());
*/


    }

    public static void printNotes(NoteBookManager manager){
        for(Note note:manager.getUnmodifiableListNotes()){
            System.out.println("Note: \""+note.getNote()+ "\"\t" + "ID: "+note.getID());
        }
    }
}
