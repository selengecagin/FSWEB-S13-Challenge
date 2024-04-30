package org.example;


import org.example.enums.Plan;

public class HealthPlan {
    private long id;
    private String name;
    private Plan plan;

    public HealthPlan(long id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "HealthPlan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", plan=" + plan +
                '}';
    }
}
