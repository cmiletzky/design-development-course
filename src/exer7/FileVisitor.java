package exer7;

public interface FileVisitor {
    public void visit(DocxFileDetails details);
    public void visit(HtmlFileDetails details);
    public void visit(JpgFileDetails details);
    public void visit(DirectoryDetails details);
    public void visit(PptxFileDetails details);
    public void visit(Mp3FileDetails details);
    public void visit(TxtFileDetails details);
}

