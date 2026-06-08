package Observer;

public interface Amazon {
     void change_state(String p, String s);
     void add(String p, String s, String e);
     void remove(String p, String e);
     void notifie(String o, String n);
}
