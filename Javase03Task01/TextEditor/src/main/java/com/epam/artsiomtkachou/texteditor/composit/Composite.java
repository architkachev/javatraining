package com.epam.artsiomtkachou.texteditor.composit;

import com.epam.artsiomtkachou.texteditor.composit.iterator.CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Composite extends Component {
    private ArrayList<Component> componentArrayList = new ArrayList<Component>();
    private Iterator iterator = null;

    public ArrayList<Component> getComponentArrayList() {
        return componentArrayList;
    }

    public void setComponentArrayList(ArrayList<Component> componentArrayList) {
        this.componentArrayList = componentArrayList;
    }

    @Override
    public String getStringComponent() {
        StringBuffer stringBuffer = new StringBuffer();
        for (Component component: this.componentArrayList){
            stringBuffer.append(component.getStringComponent());
        }
        return stringBuffer.toString();
    }

    @Override
    public Iterator createIterator() {
        if ((iterator == null)||(!iterator.hasNext())){
            iterator = new CompositeIterator(componentArrayList.iterator());
        }
        return iterator;
    }

}
