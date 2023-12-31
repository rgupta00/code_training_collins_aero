package com.session5.immutablity_demo;

import java.util.Date;

class Emp implements Cloneable{
    private int id;
    private String name;

    private Date dob;

    public Emp(int id, String name, Date dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emp{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", dob=").append(dob);
        sb.append('}');
        return sb.toString();
    }

    //Seriliaztion
    @Override
    protected Emp clone() throws CloneNotSupportedException {
        Emp empClonned= (Emp) super.clone();
        empClonned.dob=(Date) dob.clone();
        return empClonned;
    }
}

public class DeepCopyVsShallowCopy  {
    public static void main(String[] args) throws Exception{
       
    }

}
