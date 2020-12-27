package behaviourpattern;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author twt
 * @description
 * @date 2020/12/23
 */
public class IteratorDesignPattern {

    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.remove(2);
//
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Integer e = iterator.next();
//            if (e.equals(2)){
//                iterator.remove();
//                System.out.println(iterator);
//            }
//        }
//        System.out.println(list);
        //链表测试
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator = list.iterator();
        list.remove(1);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
