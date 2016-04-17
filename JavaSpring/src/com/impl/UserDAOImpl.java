package com.impl;

import com.dao.UserDAO;
import com.model.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserDAOImpl implements UserDAO {
	private List<String> lists;
    private Set<String> sets;
    private Map<String, String> maps;

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void save(User user) {
		System.out.println("user saved!");
	}

    @Override
    public String toString() {
        return "UserDAOImpl{" +
                "lists=" + lists +
                ", sets=" + sets +
                ", maps=" + maps +
                '}';
    }
}
