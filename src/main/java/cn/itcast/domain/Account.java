package cn.itcast.domain;


import java.io.InputStream;
import java.io.Serializable;

//账户信息
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Double maoney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMaoney() {
        return maoney;
    }

    public void setMaoney(Double maoney) {
        this.maoney = maoney;
    }
}
