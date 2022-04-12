package study.factoryMethodPattern.code0;

public class NotebookFactory {
    public Notebook createNoteBook(String type){
        Notebook notebook = null;

        switch (type){
            case "LG" :
                notebook = new LGNotebook();
                break;
            case "SamSung" :
                notebook = new SamsungNotebook();
                break;
        }
        return notebook;
    }
}
