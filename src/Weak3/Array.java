package Weak3;

public class Array {
    private int input;
    private int[] arr;

    public Array() {}

    public Array(int input) {
        this.input = input;
        this.arr = new int[input];
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
        this.arr = new int[input]; 
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
