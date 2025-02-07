package ec.com.sofka.config;

import ec.com.sofka.data.AccountEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface AccountMongoRepository extends ReactiveMongoRepository<AccountEntity, String> {
    Mono<AccountEntity> findByAccountNumber(String accountNumber);
}
