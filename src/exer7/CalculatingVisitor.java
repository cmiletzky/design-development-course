package exer7;

public class CalculatingVisitor implements FileVisitor{
    int size=0;
    @Override
    public void visit(DocxFileDetails details) {
        size+= details.getSize();
    }

    @Override
    public void visit(HtmlFileDetails details) {
        size+= details.getSize();
    }

    @Override
    public void visit(JpgFileDetails details) {
        size+= details.getSize();    }

    @Override
    public void visit(DirectoryDetails details) {
        for(FileDetails component : details.getContent()){
            component.accept(this);
        }
    }

    @Override
    public void visit(PptxFileDetails details) {
        size+= details.getSize();
    }

    @Override
    public void visit(Mp3FileDetails details) {
        size+= details.getSize();
    }

    @Override

    public void visit(TxtFileDetails details) {
        size+= details.getSize();
    }
}
