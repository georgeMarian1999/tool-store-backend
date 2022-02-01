package com.project.model;

import com.project.model.enums.OrderStatus;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @OneToMany(mappedBy = "order")
    Set<OrderDetail> orderDetails;

    public Set<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Set<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    private String phone;
    private String street;
    private String apartment;
    private String city;
    private String country;
    private Long postcode;
    private Float subtotal;
    private Float taxes;
    private Float total;
    private OrderStatus orderStatus;
    private Date date;
    private Float shipping;

    public Order(Integer id, User user, String phone, String street, String apartment, String city, String country, Long postcode, Float subtotal, Float taxes, Float total, OrderStatus orderStatus, Date date, Float shipping) {
        this.id = id;
        this.user = user;
        this.phone = phone;
        this.street = street;
        this.apartment = apartment;
        this.city = city;
        this.country = country;
        this.postcode = postcode;
        this.subtotal = subtotal;
        this.taxes = taxes;
        this.total = total;
        this.orderStatus = orderStatus;
        this.date = date;
        this.shipping = shipping;
    }

    public Order() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getPostcode() {
        return postcode;
    }

    public void setPostcode(Long postcode) {
        this.postcode = postcode;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public Float getTaxes() {
        return taxes;
    }

    public void setTaxes(Float taxes) {
        this.taxes = taxes;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getShipping() {
        return shipping;
    }

    public void setShipping(Float shipping) {
        this.shipping = shipping;
    }
}