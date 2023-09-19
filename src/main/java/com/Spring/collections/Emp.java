package com.Spring.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
    private String name;
    private List<String> phone;
    private Set<String> address;
    private Map<String, String> courses;

    private Properties props;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Emp(String name, List<String> phone, Set<String> address, Map<String, String> courses) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.courses = courses;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public Emp(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", address=" + address +
                ", courses=" + courses +
                ", props=" + props +
                '}';
    }

    public Emp(){
        super();
    }
}
