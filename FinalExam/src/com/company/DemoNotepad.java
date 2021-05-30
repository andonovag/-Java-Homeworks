package com.company;

public class DemoNotepad {
    public static void main(String[] args) {

        INotepad abc = new SimpleNotepad();

        abc.createPage("Title1", "Text1");
        abc.createPage("Title2", "Text2");
        abc.createPage("Title3", "Text3");
        abc.createPage("Title4", "Text4");
        abc.createPage("Title5", "Text5");


        try {
            abc.replaceText(33, "ReplacedText");
        } catch (PageNotFoundException e) {
            e.printStackTrace();
        }

        try {
            abc.deleteText(10);
        } catch (PageNotFoundException e) {
            e.printStackTrace();
        }

        abc.previewAllPages();

    }
}
