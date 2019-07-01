package datastructures.arrays;

/**
 * @Author liliang
 * @Date 2019/7/1 9:36
 * @Description  创建一个动态数组，支持泛型
 **/
public class Array<E> {

    private E [] data;
    private int size;

    // 构造函数，传入数组的容量capacity，构造Array
    public Array(int capacity){
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    // 获取动态数组的容积
    public int getCapacity(){
        return data.length;
    }

    // 获取动态数组中元素的总个数
    public int getSize(){
        return size;
    }

    // 判断数组是否为空
    public boolean isEmpty(){
        return size==0;
    }

    // 在index位置插入一个新元素
    public void add(int index,E e){
        if (index<0 || index>size){
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
        }

        if (size == data.length){
            throw new IllegalArgumentException("Add failed. Array is full.");
        }
        for (int i=size;i>index;i--){
            data[i]=data[i-1];
        }
        data[index] = e;
        size++;

    }

    // 在数组头部插入一个新元素
    public void addFirst(E e){
        add(0,e);
    }

    // 在数组的尾部插入一个新元素
    public void addLast(E e){
        add(size,e);
    }

    // 获取index位的元素
    public E get(int index){
        if (index <0 || index>size){
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
        }
        return data[index];
    }

    // 修改index位置的元素
    public void set(int index,E e){
        if (index <0 || index>size){
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
        }
        data[index] = e;
    }

}
