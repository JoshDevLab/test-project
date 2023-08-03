package com.example.testproject.exercise.transaction;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Service
public class OrderTxService {

    private final OrderRepository orderRepository;

    @Transactional
    public Order saveOrder(Member member) {

        if (member.getId() == 1) {
            throw new RuntimeException("의도적으로 익셉션 발생");
        }

        Order order = Order.builder()
                .member(member)
                .product_name("prd_name")
                .total_price(10000)
                .build();

        return orderRepository.save(order);
    }

}
