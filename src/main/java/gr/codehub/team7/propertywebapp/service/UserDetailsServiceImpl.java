package gr.codehub.team7.propertywebapp.service;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.model.LoginResponse;
import gr.codehub.team7.propertywebapp.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Arrays;
import java.util.Optional;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // here we would search into the repo for the user.
        // for not we are just going to send always a successful response.
        Optional<Owner> user = ownerRepository.findOwnerByEmail(username);

        if (!user.isPresent()) {
            throw new UsernameNotFoundException(username);
        }

        /*        List<SimpleGrantedAuthority> authorization = Collections.singletonList(new SimpleGrantedAuthority("ADMIN"));
        CharSequence password = "password";*/

        return new LoginResponse(user.get().getEmail(), user.get().getPassword(), Arrays.asList(new SimpleGrantedAuthority(user.get().getRole().name())));
    }
}
