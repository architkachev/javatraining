package javase01.t06.main;

import javase01.t06.logic.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){

        NoteBook noteBook1 = new NoteBook();
        NoteBook nb = noteBook1;
        NoteBookManager manager = new NoteBookManager(noteBook1);
        //NoteBookManager manager = new NoteBookManager();



        manager.manage(noteBook1);

        manager.addNote("String0");
        manager.addNote("String1");
        manager.addNote("String2");
        manager.addNote("String3");
        manager.addNote("String4");
        manager.addNote("String5");
        manager.addNote("String6");
        manager.addNote("String7");

        printNotes(manager);

        NoteBook noteBook2 = new NoteBook();
        manager.manage(noteBook2);


        if (nb.equals(noteBook1)){
            System.out.println("true");
        }
        System.out.println(noteBook1.hashCode());
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

        manager.manage(noteBook1);

        printNotes(manager);

        if(manager.deleteNote(3)){
            System.out.println("Succesfull deleted");
        } else{
            System.out.println("Cant delete");
        }

        manager.manage(noteBook2);
        if(manager.deleteNote(3)){
            System.out.println("Succesfull deleted");
        } else{
            System.out.println("Cant delete");
        }
        manager.manage(noteBook1);
        printNotes(manager);
        manager.manage(noteBook2);
        printNotes(manager);
        manager.addNote("String0013");
        manager.addNote("String0014");
        manager.addNote("String0015");
        printNotes(manager);



    }

    public static void printNotes(NoteBookManager manager){
        for(Note note:manager.getUnmodifiableListNotes()){
            System.out.println("Note: \""+note.getNote()+ "\"\t" + "ID: "+note.getId());
        }
        System.out.println("-------------------------");
    }
}
