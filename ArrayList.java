package com.company;

/**
 * Created by Polina on 09.05.17.
 */
public class ArrayList {
    public static class MyArrayList<T>
    {
        private final int INIT_SIZE = 16;
        private final int CUT_RATE = 4;
        private Object[] array = new Object[INIT_SIZE];
        private int pointer = 0;

        public void addAtTheEnd(T value)
        {
            if(pointer == array.length-1)
                resize(array.length*2); // увеличу в 2 раза, если достигли границ
            array[pointer++] = value;
        }
        public void addOnIndex(int index, T value)
        {    for (int i =0; i<index; i++)
                array[pointer-i] = array[pointer-(i+1)];
            array[index] = value;
            if(pointer == array.length-1)
                resize(array.length*2);

        }


        public T get(int index) {
            return (T) array[index];
        }

        public void remove(int index) {
            for (int i = index; i<pointer; i++)
                array[i] = array[i+1];
            array[pointer] = null;
            pointer--;
            if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
                resize(array.length/2); // если элементов в CUT_RATE раз меньше чем
            // длина массива, то уменьшу в два раза
        }
        /*Возвращает количество элементов в списке*/
        public int size() {
            return pointer;
        }

        /*Вспомогательный метод для масштабирования.*/
        private void resize(int newLength) {
            Object[] newArray = new Object[newLength];
            System.arraycopy(array, 0, newArray, 0, pointer);
            array = newArray;
        }
        public void listIsEmpty()
        {
            if(pointer!=0)
                System.out.println("Список не пустой");
        }
        void show()
        {

            for (int i = 0; i<=pointer; i++)
            {
                System.out.println(" " + array[i]);
            }
        }
    }

    public static void main(String[] args) {

        MyArrayList<Integer> list = new MyArrayList<>();
        list.addAtTheEnd(1);
        list.addAtTheEnd(2);
        list.addAtTheEnd(3);
        list.addAtTheEnd(4);
        list.addAtTheEnd(5);
        list.show();
        list.addOnIndex(3,8);
        list.show();
      int a =  list.get(3);
        System.out.println("a = " + a);
}
}
