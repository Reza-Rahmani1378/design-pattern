package com.hami.design_pattern.composite;

public class HtmlElement extends HtmlTag{

    private String tagName;
    private String startTag;
    private String endTag;
    private String tagBody;

    public String getStartTag() {
        return startTag;
    }

    public String getEndTag() {
        return endTag;
    }

    public String getTagBody() {
        return tagBody;
    }

    public HtmlElement(String tagName) {
        this.tagName = tagName;
    }
    @Override
    public String getTagName() {
        return tagName;
    }

    @Override
    public void setStartTag(String startTag) {
        this.startTag = startTag;
    }

    @Override
    public void setEndTag(String endTag) {
        this.endTag = endTag;
    }

    @Override
    public void setTagBody(String tagBody) {
        this.tagBody = tagBody;
    }

    @Override
    public void generateHtml() {
        System.out.println(startTag + "" + tagBody + endTag);
    }
}
