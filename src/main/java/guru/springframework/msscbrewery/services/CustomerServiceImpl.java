package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(final UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("JohnDoe")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(final CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(final UUID customerId, final CustomerDto customerDto) {
        // todo impl - would add a real impl to update customer
    }

    @Override
    public void deleteById(final UUID customerId) {
        log.debug("Deleting a customer...");
    }
}
