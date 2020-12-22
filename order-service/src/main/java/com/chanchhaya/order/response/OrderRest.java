package com.chanchhaya.order.response;

import java.sql.Timestamp;

public class OrderRest {
    
    private Long productId;
    private Timestamp date;
    private Double total;


    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Timestamp getDate() {
        return this.date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Double getTotal() {
        return this.total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "{" +
            " productId='" + productId + "'" +
            ", date='" + date + "'" +
            ", total='" + total + "'" +
            "}";
    }

}
