package com.sachin.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "host")
public class Host {

    @Id
    @Column(name = "host_id")
    private Integer host_id;

    @Column(name = "host_name")
    private String host_name;

//    @OneToMany(mappedBy = "host",cascade = CascadeType.ALL,fetch = FetchType.EAGER, orphanRemoval = true)

    @OneToMany(targetEntity = Container.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "host_id", referencedColumnName = "host_id")
    private List<Container> containers = new ArrayList<>();

    public Host(){

    }
    public Host(Integer host_id, String host_name) {
        super();
        this.host_id = host_id;
        this.host_name = host_name;
    }

    public Integer getHost_id() {
        return host_id;
    }

    public void setHost_id(int host_id) {
        this.host_id = host_id;
    }

    public String getHost_name() {
        return host_name;
    }

    public void setHost_name(String host_name) {
        this.host_name = host_name;
    }

    public void setHost_id(Integer host_id) {
        this.host_id = host_id;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public void setContainers(List<Container> containers) {
        this.containers = containers;
    }

    @Override
    public String toString() {
        return "Host{" +
                ", host_id=" + host_id +
                ", host_name='" + host_name + '\'' +
                '}';
    }
}

