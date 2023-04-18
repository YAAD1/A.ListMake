public class Registration{
    private String kind_name;
    private String name;
    private String type_name;
    private String episodes;
    public Registration(String kind_name,String name,String type_name,String episodes){
        this.kind_name=kind_name;
        this.name=name;
        this.type_name=type_name;
        this.episodes=episodes;
    }
    public String print_register(){
        return "TV_type:"+kind_name+" -\s Name:"+name+" -\sType name:"+type_name+" -\s Episodes:"+episodes ;
    }
    public String getname(){
        return name;
    }
    public String getKind_name(){
        return kind_name;
    }
    public String getType_name(){
        return type_name;
    }
    public String getEpisodes(){
        return episodes;
    }


}