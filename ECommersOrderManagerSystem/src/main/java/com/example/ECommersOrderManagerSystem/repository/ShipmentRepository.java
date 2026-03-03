package com.example.ECommersOrderManagerSystem.repository;

import com.example.ECommersOrderManagerSystem.entity.Shipment;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {

    // Native Query: filter by status + warehouse
    @Query(value =
            "SELECT * FROM shipment s JOIN warehouse w ON s.warehouse_id = w.id " +
                    "WHERE s.status = ?1 AND w.name LIKE %?2%",
            nativeQuery = true)
    List<Shipment> findByStatusAndWarehouse(String status, String warehouseName);


    // Aggregate Query
    @Query(value =
            "SELECT w.name, COUNT(s.id) FROM shipment s " +
                    "JOIN warehouse w ON s.warehouse_id = w.id GROUP BY w.id",
            nativeQuery = true)
    List<Object[]> countShipmentsPerWarehouse();


    // JPQL Query (latest tracking event)
    @Query("""
            SELECT s FROM Shipment s
            JOIN FETCH s.trackingEvents te
            WHERE te.timestamp =
              (SELECT MAX(t.timestamp)
               FROM TrackingEvent t
               WHERE t.shipment.id = s.id)
           """)
    List<Shipment> findShipmentsWithLatestEvent();
}
