package main.java.datass;

public class ContentCreationIsHard {
    private final String contents;
    private final int contentsLength;
    private final String contenttype;

    public ContentCreationIsHard(String contentment, String contentmenttype) {
        contents = contentment;
        contentsLength = contentment.length();
        contenttype = contentmenttype;
    }

    public int getContentsLength() {
        return contentsLength;
    }

    public String getContents() {
        return contents;
    }

    public String getContenttype() {
        return contenttype;
    }

    @Override
    public String toString() {
        return "Content-Type:" + contenttype + "\n" + //Type of content :P
                "Content-Length: " + contentsLength + "\n" +  //Length of the thingy in BITES and CHOMPS and YUMMMMMS snake brrrrrrrrrrrr:0
                "\n" +
                contents;
    }
}
