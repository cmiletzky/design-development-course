package exer7;

public class StatisticsVisitor implements FileVisitor{
    String output="";

    @Override
    public void visit(DocxFileDetails details) {
        output += "The file "+details.getName()+" has an average of "+round(details.getWords()/(float)details.getNumOfPages())+" words per page.\n";
    }

    @Override
    public void visit(HtmlFileDetails details) {
        output += "The file "+details.getName()+" contains "+details.getLines()+" lines.\n";
    }

    @Override
    public void visit(JpgFileDetails details) {
        output += "The picture "+details.getName()+" has an average of "
                +round(details.getSize()/(float)(details.getHeight()*details.getWidth()))+" bytes per pixel.\n";
    }

    @Override
    public void visit(DirectoryDetails details) {
        for(FileDetails component : details.getContent()){
            component.accept(this);
        }
        output += "Directory "+details.getName()+" has "+details.getContent().size()+" files.\n";
    }

    @Override
    public void visit(PptxFileDetails details) {
        output += "The average slide size in Presentation "+details.getName()+" is "+round(details.getSize()/(float)details.getSlides())+".\n";
    }

    @Override
    public void visit(Mp3FileDetails details){
        output += "The bitrate of "+details.getName()+
                " is "+round(details.getSize()/ (float)details.getLengthSec())+" bytes per second.\n";
    }

    @Override
    public void visit(TxtFileDetails details) {
        output += "The file "+details.getName()+" contains "+details.getWords()+" words.\n";
    }

    private int round(float val){
        return (int)(val+0.5);
    }
}
