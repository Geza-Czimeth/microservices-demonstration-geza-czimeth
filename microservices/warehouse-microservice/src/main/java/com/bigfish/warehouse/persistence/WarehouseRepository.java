package com.bigfish.warehouse.persistence;

import com.bigfish.warehouse.enity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseRepository extends JpaRepository<Order, Long> {
}
