package com.educative.ecommerce.repository;

import com.educative.ecommerce.model.Order;
import com.educative.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository  extends JpaRepository<Order, Integer> {
    //get all orders for a user sorted by createdDate.
    /*Method syntax to generate query goes like this [MethodPrefixes][PropertyExpression][Conditions].
    * In order to ensure that method is identified as a query method, it must have predefined prefixes.
    * The supported prefixes are findBy, find, readBy, read, getBy, and get.
    *
    * Property expressions are used to refer either to a direct property or nested property of a JPA entity.
    *
    *
    * We can create a constraint by adding a keyword after property expression.
        We can combine constraints by adding either the And or Or keywords between them
    *
    * */
    List<Order> findAllByUserOrderByCreatedDateDesc(User user);

}