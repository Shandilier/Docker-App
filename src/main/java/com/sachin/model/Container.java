package com.sachin.model;

import javax.persistence.*;
import java.util.Optional;

@Entity
@Table(name = "container")
public class Container {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Integer container_id;


    @Column(name = "container_name")
    private String container_name;

    @Column(name = "image_name")
    private String image_name;


    @Column(name="host_id")
    private Integer host_id;

    public Container(){

    }


    public Container(String image_name, Integer host_id) {
        this.image_name = image_name;
        this.host_id = host_id;
    }

    public Integer getContainer_id() {
        return container_id;
    }

    public void setContainer_id(Integer container_id) {
        this.container_id = container_id;
    }

    public String getContainer_name() {
        return container_name;
    }

    public void setContainer_name(String container_name) {
        this.container_name = container_name;
    }

    public String getImage_name() {
        return image_name;
    }

    public void setImage_name(String image_name) {
        this.image_name = image_name;
    }

//    public Host getHost() {
//        return host;
//    }
//
//    public void setHost(Host host) {
//        this.host = host;
//    }


    public Integer getHost_id() {
        return host_id;
    }

    public void setHost_id(Integer host_id) {
        this.host_id = host_id;
    }

//    @Override
//    public String toString() {
//        return "Container{" +
//                "container_id=" + container_id +
//                ", container_name='" + container_name + '\'' +
//                ", image_name='" + image_name + '\'' +
//                ", host=" + host +
//                '}';
//    }

    @Override
    public String toString() {
        return "Container{" +
                "container_id=" + container_id +
                ", container_name='" + container_name + '\'' +
                ", image_name='" + image_name + '\'' +
                ", host_id=" + host_id +
                '}';
    }
}