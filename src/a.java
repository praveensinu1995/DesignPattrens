public class a {
    private static a instance;
    private a(){

    }
    public static a getInstanceOfA(){
        if(instance==null){
            instance=new a();
        }
        return instance;
    }
}
