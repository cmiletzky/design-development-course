package exer7;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// TODO: Implement Composite (change this file).
public class DirectoryDetails extends FileDetails {
    public List<FileDetails> content=null;

    public List<FileDetails> getContent() {return content;}

    protected DirectoryDetails(String path, String name){
        super(path,name);
        content = new LinkedList<>();
    }
    public void addFile(FileDetails fileDetails){
        content.add(fileDetails);
    }
    @Override
    public void accept(FileVisitor visitor){visitor.visit(this);}
}