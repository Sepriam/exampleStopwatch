package com.example.matt.example_of_checkbox_in_listview;

/**
 * Created by Matt on 10/08/2017.
 */

public class States
{

    String code = null;
    String name = null;
    boolean selected = false;

    public States(String code, String name, boolean selected)
    {
        super();
        this.code = code;
        this.name = name;
        this.selected = selected;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean isSelected()
    {
        return selected;
    }

    public void setSelected(boolean selected)
    {
        this.selected = selected;
    }

}
