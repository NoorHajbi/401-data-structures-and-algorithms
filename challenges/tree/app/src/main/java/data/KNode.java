package data;

import java.util.ArrayList;
import java.util.List;

public class KNode<T> {
    private T value;
    private List<KNode<T>> children;
    private KNode<T> parent;


    public KNode(T value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public KNode() {
        super();
        this.children = new ArrayList<>();
    }


    public void addChild(KNode<T> child) {
        child.setParent(this);
        children.add(child);
    }


    public void addChildAt(int index, KNode<T> child) {
        child.setParent(this);
        this.children.add(index, child);
    }

    public void setChildren(List<KNode<T>> children) {
        for (KNode<T> child : children)
            child.setParent(this);
        this.children = children;
    }

    public void removeChildren() {
        this.children.clear();
    }


    public KNode<T> removeChildAt(int index) {
        return children.remove(index);
    }


    public boolean removeChild(KNode<T> childToDelete) {
        List<KNode<T>> list = getChildren();
        return list.remove(childToDelete);
    }

    public T getValue() {
        return this.value;
    }


    public void setValue(T value) {
        this.value = value;
    }

    public void setStringValue(String value) {
        this.value = (T) value;
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
    public int getNumberOfChildren() {
        return getChildren().size();
    }

    public KNode<T> getChildAt(int index) {
        return children.get(index);
    }


    @Override
    public String toString() {
        return value + " ";
    }
}
