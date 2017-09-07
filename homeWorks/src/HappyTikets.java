import java.util.ArrayList;
import java.util.List;

/**
 * Created by onedell on 07.09.2017.
 */
public class HappyTikets {

    ArrayList<String> emptyElementTemplate = new ArrayList<String>();
    ArrayList<String> template = (ArrayList<String>) elementTemplateCreating();

    ArrayList<ArrayList<String>> templateList = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> fullTemplateList = (ArrayList) listEmptyTemplateCreating();

    String numTikets = "0";
    int index = 0;


    public List elementTemplateCreating(){
        for(int i=0; i<6; i++){
            String e = "0";
            emptyElementTemplate.add(e);
        }
        return emptyElementTemplate;
    }

    public List listEmptyTemplateCreating(){
        for (int i = 0; i<=999999; i++){
            templateList.add(i, template);
        }
        System.out.println(templateList.get(999999));
        return templateList;
    }

    public int findIndex(int index, int numTikets){
        switch (numTikets){
            case 1: if(numTikets>=1) index = 5;
                break;
            case 2: if(numTikets>=10) index = 4;
                break;
            case 3: if(numTikets>=100) index = 3;
                break;
            case 4: if (numTikets>=1000)index = 3;
                break;
            case 5: if (numTikets>=10000)index = 2;
                break;
            case 6: if (numTikets>=100000)index = 1;
                break;
            case 7: if (numTikets>=1000000)index = 0;
                break;
            default: System.out.print("Something went wrong :( ");
        }
        System.out.print("Index is: " + index );
        return index;
    }
    public void tiketsListCreating(){
        for(ArrayList<String> e : fullTemplateList){

            e.add(index, numTikets);


        }
        List listTikets = listEmptyTemplateCreating();


    }
}
