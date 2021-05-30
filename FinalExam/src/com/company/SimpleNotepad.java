package com.company;

import java.util.ArrayList;
import java.util.List;

public class SimpleNotepad implements INotepad {

    private List<Page> pages;

    public SimpleNotepad() {
        this.pages = new ArrayList<>();
    }


    @Override
    public void createPage(String title, String text) {
        Page page = new Page(title, text);
        pages.add(page);
        page.setPageNumber(this.pages.size());
    }

    @Override
    public void replaceText(int pageNumber, String text) throws PageNotFoundException {
        Page foundPage = findPage(pageNumber);
        foundPage.deleteText();
        foundPage.addText(text);
    }

    private Page findPage(int pageNumber) throws PageNotFoundException {
        for (Page page : pages) {
            if (page.getPageNumber() == pageNumber) {
                return page;
            }
        }
        throw new PageNotFoundException("There is no page with number " + pageNumber);
    }


        @Override
        public void deleteText ( int pageNumber) throws PageNotFoundException {
            Page foundPage = findPage(pageNumber);
            foundPage.deleteText();
        }

        @Override
        public void previewAllPages () {
            for (Page page : pages) {
                System.out.println(page.preview());
            }
        }
    }






