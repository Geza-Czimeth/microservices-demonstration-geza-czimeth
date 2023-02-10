package com.bigfish.warehouse.persistence;

import com.bigfish.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseRepository extends JpaRepository<Order, Long> {
}
