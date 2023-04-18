import com.sun.jdi.IntegerValue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileRegistration {
    private List<Registration> registration_List;
    public FileRegistration(String file_path) throws IOException {
        var list= Files.readAllLines(Path.of(file_path));
        registration_List=new ArrayList<Registration>();
        for(var line:list){
            var splits=line.split("-");
            //var kayit = new Kayit(sanatciAdi, parcaAdi, tur);// bunun kısaltımışını hoca allta uygulamıştır.
            registration_List.add(new Registration(splits[0],splits[1],splits[2],splits[3]));
        }
    }
    public List<Registration> getRegistration_List(){
        return registration_List;
    }

    public List<Registration> Search_with_kind_name(String kind_name){
        var end_list= new ArrayList<Registration>();
        for(var i:registration_List){
            if(i.getKind_name().equals(kind_name)){
                end_list.add(i);
            }
        }
        return end_list;
    }

    public List<Registration> Search_with_type_name(String type_name){
        var end_list=new ArrayList<Registration>();
        for(var i:registration_List){
            if(i.getType_name().equals(type_name));
            end_list.add(i);
        }
        return end_list;
    }
    public List<Registration> Search_with_number_ofepisodes(int numbers_ofepisodes,String sign){
        var end_list=new ArrayList<Registration>();
        if(sign.equals("+")){
            for(var i:registration_List){
                if(Integer.valueOf(i.getEpisodes())>=numbers_ofepisodes){
                    end_list.add(i);
                }
            }
        }
        else{
            for(var i:registration_List){
                if(Integer.valueOf(i.getEpisodes())<=numbers_ofepisodes){
                    end_list.add(i);
                }
            }
        }
        return end_list;
    }
}
