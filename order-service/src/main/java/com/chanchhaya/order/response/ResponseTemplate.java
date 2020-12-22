package com.chanchhaya.order.response;

import com.chanchhaya.order.entity.Order;

public class ResponseTemplate {

    private Order order;
    private ProductRest product;

    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public ProductRest getProduct() {
        return this.product;
    }

    public void setProduct(ProductRest product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "{" +
            " order='" + order + "'" +
            ", product='" + product + "'" +
            "}";
    }

}
