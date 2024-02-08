/**
 * Created by rafal on 16.11.2016.
 */
public class Adapter {
    OldLogger ol;
    public Adapter(OldLogger ol){
        this.ol=ol;
    }
    public void newLog(String s){
        ol.log(s.getBytes());
    }
}
