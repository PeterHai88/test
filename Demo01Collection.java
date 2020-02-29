package cn.itcast.day15.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*
    java.util.Collection接口
    所有单列集合的最顶层的接口，里边定义了所有单列集合共性的方法
    任意的单列集合都可以使用Collection接口中的方法

    共性的方法：
        public boolean add(E e) //把给定的对象添加到当前集合中
        public void clean() //清空集合中的所有的元素
        public boolean remove(E e) //把给定的对象在当前集合中删除
        public boolean contains(E e) //判断当前集合中是否包含给定的对象
        public boolean isEmpty() //判断当前集合是否为空
        public int size() //返回集合中元素的个数
        public Object[] toArray() //把集合中的元素，存储到数组中
 */
public class Demo01Collection {

    public static void main(String[] args) {
        //创建集合对象，可以使用多态
        Collection<String> coll = new HashSet<>();
        System.out.println(coll);   //[] 重写了toString方法

        /*
        public boolean add(E e) //把给定的对象添加到当前集合中
        返回值是一个boolean值，一般都返回true，不用接收
         */
        coll.add("迪丽热巴");
        coll.add("古力娜扎");
        coll.add("玛尔扎哈");
        coll.add("玛尔扎哈");
        System.out.println(coll);   //[迪丽热巴, 古力娜扎, 玛尔扎哈]

        /*
        public boolean remove(E e) //把给定的对象在当前集合中删除
        返回值是一个boolean值，集合中存在元素，删除元素，返回true
        集合中不存在元素，删除失败，返回false
         */
        boolean b1 = coll.remove("玛尔扎哈");
        System.out.println(b1); //true
        boolean b2 = coll.remove("玛尔扎哈");
        System.out.println(b2); //false
        System.out.println(coll);   //[迪丽热巴, 古力娜扎]

        /*
         public boolean contains(E e) //判断当前集合中是否包含给定的对象
         包含返回true，不包含返回false
         */
        boolean b3 = coll.contains("迪丽热巴");
        System.out.println(b3); //true
        boolean b4 = coll.contains("玛尔扎哈");
        System.out.println(b4); //false

        /*
        public boolean isEmpty() //判断当前集合是否为空
        集合为空返回true 不为空返回false
         */
        boolean b5 = coll.isEmpty();
        System.out.println(b5); //false

        /*
         public int size() //返回集合中元素的个数
         */
        int size = coll.size();
        System.out.println(size); //2

        /*
        public Object[] toArray() //把集合中的元素，存储到数组中
         */
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); /*迪丽热巴
                                         古力娜扎*/
        }

        /*
        public void clean() //清空集合中的所有的元素,但是不删除集合，集合还存在
         */
        coll.clear();
        System.out.println(coll); //[]
        System.out.println(coll.isEmpty()); //true
    }
}
