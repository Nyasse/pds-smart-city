package pds.v1.server.smartcity.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Building {
    private Long id;
    private String name;
    private String address;
    private Company company;

    private List<Window> windows;

    public Building() {
    }

    public Building(Long id, String name, String address, Company company) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.company = company;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Window> getWindows() {
        return this.windows;
    }

    public void setWindows(List<Window> windows) {
        this.windows = new ArrayList(windows.size());
        Collections.copy(windows, this.windows);
    }
}
