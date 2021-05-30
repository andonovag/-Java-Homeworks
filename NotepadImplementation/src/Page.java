public class Page {
    private String title;
    private String text;
    private int pageNumber;



    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Page(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public void addText(String text) {
        this.text = this.text + text;
    }

    public void deleteText() {
        this.text = "";
    }

    String preview() {
        return this.title + "\n" + this.text;
    }

}
