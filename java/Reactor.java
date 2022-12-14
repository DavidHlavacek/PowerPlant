import java.util.HashSet;
import java.util.Iterator;

public class Reactor {
    private HashSet<Core> cores;

    public Reactor() {
        this.cores = new HashSet<Core>();
    }

    public void addCore(Core core) {
        this.cores.add(core);
    }

    //passing it an iterator for better encapsulation
    public Iterator<Core> getCores() {
        Iterator<Core> it = cores.iterator();
        return it;
    }

}
