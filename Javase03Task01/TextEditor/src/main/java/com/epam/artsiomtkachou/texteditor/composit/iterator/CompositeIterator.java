package com.epam.artsiomtkachou.texteditor.composit.iterator;

import com.epam.artsiomtkachou.texteditor.composit.Component;
import com.epam.artsiomtkachou.texteditor.composit.Composite;
import com.epam.artsiomtkachou.texteditor.composit.Leaf;

import java.util.Iterator;
import java.util.Stack;
import java.util.function.Consumer;

public class CompositeIterator implements Iterator {
    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        this.stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()){
            return false;
        } else {
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()){
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()){
            Iterator iterator = (Iterator) stack.peek();
            Component component = (Component) iterator.next();
            if(component instanceof Composite){
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void forEachRemaining(Consumer action) {
        throw new UnsupportedOperationException();
    }
}
