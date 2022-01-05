import java.util.HashMap;
import java.util.Map;

public class RecursiveFibonacci implements Fibonacci{

    private Map<Integer, Long> cache = new HashMap<>();
    @Override
    public long calculate(int ent) {
        if (cache.containsKey(ent)){
            return cache.get(ent);
        }
        if (ent == 1) return 1;

        if (ent == 0) return 0;

        else{
            long ret = calculate(ent-1) + calculate(ent-2);
            cache.put(ent, ret);
            return ret;
        }
    }
}
