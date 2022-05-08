package exer7;

public class CountingVisitor implements FileVisitor{
int count=0;


    @Override
    public void visit(DirectoryDetails details) {
        for (FileDetails compenent : details.getContent()){
            compenent.accept(this);
        }

    }

    @Override
    public void visit(DocxFileDetails details) {
        count++;
    }

    @Override
    public void visit(HtmlFileDetails details) {
     count++;
    }

    @Override
    public void visit(JpgFileDetails details) {
     count++;
    }

    @Override
    public void visit(Mp3FileDetails details) {
     count++;
    }

    @Override
    public void visit(PptxFileDetails details) {
     count++;
    }

    @Override
    public void visit(TxtFileDetails details) {
     count++;
    }
}
