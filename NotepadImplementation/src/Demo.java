public class Demo {

    public static void main(String[] args) {
        INotepad myNotepad = new SimpleNotepad();

        myNotepad.createPage("Title1", "Text1");
        myNotepad.createPage("Title2", "Text2");
        myNotepad.createPage("Title3", "Text3");
        myNotepad.createPage("Title4", "Text4");
        myNotepad.createPage("Title5", "Text5");


        try {
            myNotepad.replaceText(33, "ReplacedText");
        } catch (PageNotFoundException e) {
            e.printStackTrace();
        }

        try {
            myNotepad.deleteText(10);
        } catch (PageNotFoundException e) {
            e.printStackTrace();
        }

        myNotepad.previewAllPages();


    }
}
