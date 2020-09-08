package com.lambdaschool.javaorders.models;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(nullable = false)
  private long ordnum;

  private double ordamount;
  private double advanceamount;
  private String orderdescription;

  //connect orders to customer (many orders to one customer)
  @ManyToOne
  @JoinColumn(name = "custcode", nullable = false)
  private Customer customer;

  public Order() {
  }

//  public Order(long ordnum, double ordamount, double advanceamount, String orderdescription) {
//    this.ordnum = ordnum;
//    this.ordamount = ordamount;
//    this.advanceamount = advanceamount;
//    this.orderdescription = orderdescription;
//  }

  public Order(double ordamount, double advanceamount, Customer customer, String orderdescription) {
    this.ordamount = ordamount;
    this.advanceamount = advanceamount;
    this.customer = customer;
    this.orderdescription = orderdescription;
  }

  public long getOrdnum() {
    return ordnum;
  }

  public void setOrdnum(long ordnum) {
    this.ordnum = ordnum;
  }

  public double getOrdamount() {
    return ordamount;
  }

  public void setOrdamount(double ordamount) {
    this.ordamount = ordamount;
  }

  public double getAdvanceamount() {
    return advanceamount;
  }

  public void setAdvanceamount(double advanceamount) {
    this.advanceamount = advanceamount;
  }

  public String getOrderdescription() {
    return orderdescription;
  }

  public void setOrderdescription(String orderdescription) {
    this.orderdescription = orderdescription;
  }

}
