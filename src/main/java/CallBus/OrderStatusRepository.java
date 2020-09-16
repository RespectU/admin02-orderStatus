package CallBus;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderStatusRepository extends CrudRepository<OrderStatus, Long> {

    List<OrderStatus> findByOrderId(Long orderId);

}