package academy.devdojo.springwebflux.service;

import academy.devdojo.springwebflux.repository.DevDojoUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Service
public class DevDojoUserDetailsService implements ReactiveUserDetailsService {

    private final DevDojoUserRepository devDojoUserRepository;

    @Override
    public Mono<UserDetails> findByUsername(String username) {
        return devDojoUserRepository.findByUsername(username)
                .cast(UserDetails.class);
    }
}
