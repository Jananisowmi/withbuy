package com.hcl.stock;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlacedOrderRepository  extends CrudRepository<PlacedOrder,Integer>{

}
