package data;

import java.util.ArrayList;
import java.util.List;

public class KNode<T> {
    private T value;
    private List<KNode<T>> children = new ArrayList<>();
    private KNode<T> parent;


    public KNode(T value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public KNode(KNode<T> node) {
        this.value = node.getValue();
        children = new ArrayList<>();
    }


    public void addChild(KNode<T> child) {
        child.setParent(this);
        children.add(child);
    }

    public void addChildAt(int index, KNode<T> child) {
        child.setParent(this);
        this.children.add(index, child);
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public KNode<T> getParent() {
        return this.parent;
    }

    public void setParent(KNode<T> parent) {
        this.parent = parent;
    }

    public List<KNode<T>> getChildren() {
        return this.children;
    }


    @Override
    public String toString() {
        return value + " ";
    }
}
