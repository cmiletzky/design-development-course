package exer7;

public class PrintingVisitor implements FileVisitor{
    String output="";
    @Override
    public void visit(DocxFileDetails details) {
        output+= details.getName()+'\n';
    }

    @Override
    public void visit(HtmlFileDetails details) {
        output+= details.getName()+'\n';
    }

    @Override
    public void visit(JpgFileDetails details) {
        output+= details.getName()+'\n';
    }

    @Override
    public void visit(DirectoryDetails details) {
        for(FileDetails component : details.getContent()){
            component.accept(this);
        }
        output+= details.getName()+'\n';
    }

    @Override
    public void visit(PptxFileDetails details) {
        output+= details.getName()+'\n';
    }

    @Override
    public void visit(Mp3FileDetails details) {
        output+= details.getName()+'\n';
    }

    @Override
    public void visit(TxtFileDetails details) {
        output+= details.getName()+'\n';
    }
}
