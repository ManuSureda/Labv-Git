import java.util.ArrayList;
import java.util.List;

public class GenericArray <T extends Comparable>  {
    private List<T> list;

    public GenericArray() {
        this.list = new ArrayList<T>();
    }

    public List<T> getList() {
        return list;
    }

    public void setList(ArrayList<T> list) {
        this.list = list;
    }

    public void add(T element)
    {
        this.list.add(element);
    }

    public boolean exist(T element){
        boolean ans=false;
        for (T e : this.list ) {
            if(e.equals(element)){
                ans = true;
            }
        }
        return ans;
    }

    public T max(){
        if(!this.list.isEmpty()){
            T ans = list.get(0);
            for(T e : this.list){
                if(ans.compareTo(e)<0){
                    ans = e;
                }
            }
            return ans;
        }else{
            return null;
        }
    }

    public T min(){
        if(!this.list.isEmpty()){
            T ans = list.get(0);
            for(T e : this.list){
                if(ans.compareTo(e)>0){
                    ans = e;
                }
            }
            return ans;
        }else{
            return null;
        }
    }

    public T removeLastItem(){
        T ans = list.get(list.size()-1);
        list.remove(list.size()-1);
        return ans;
    }

}
