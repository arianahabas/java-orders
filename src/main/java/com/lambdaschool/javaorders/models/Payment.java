package com.lambdaschool.javaorders.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "payments")

public class Payment {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(nullable = false)
  private long paymentid;

  @Column(nullable = false)
  private String type;

  //connect payments to customer (already setup inside of Agent)
  @ManyToMany(mappedBy = "payments")
  private Set<Agent> agents = new HashSet<>();

  public Payment() {
  }

  public Payment(String type) {
    this.type = type;
  }

  public long getPaymentid() {
    return paymentid;
  }

  public void setPaymentid(long paymentid) {
    this.paymentid = paymentid;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Set<Agent> getAgents() {
    return agents;
  }

  public void setAgents(Set<Agent> agents) {
    this.agents = agents;
  }

}
