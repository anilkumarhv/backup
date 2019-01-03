package in.anil.springboot.microservice.example.forex.springbootmicroserviceforexservice.dao;

import in.anil.springboot.microservice.example.forex.springbootmicroserviceforexservice.model.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Anil
 * Created by AH00554631 on 8/9/2018.
 */
@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
    ExchangeValue findByFromAndTo(String from, String to);
}
