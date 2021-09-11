package ru.zateev.springsecuritytest.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.zateev.springsecuritytest.model.Authority;
import ru.zateev.springsecuritytest.model.Customer;
import ru.zateev.springsecuritytest.repository.CustomerRepository;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* ProviderManager имеет список AuthenticationProviders которые проверяют пользователя */
@Component
public class UsernamePwdConsumersAuthenticate implements AuthenticationProvider {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        //логин
        String username = authentication.getName();
        //пароль
        String pwd = authentication.getCredentials().toString();
        List<Customer> customersList = customerRepository.findByEmail(username);
        if (customersList.size() > 0) {
            if (passwordEncoder.matches(pwd, customersList.get(0).getPwd())) {
                //если отпечаток пальца или скан лица, то UsernamePasswordAuthenticationToken не используется
                return new UsernamePasswordAuthenticationToken(username, pwd, getGrantedAuthorities(customersList.get(0).getAuthorities()));
            } else {
                throw new BadCredentialsException("Invalid password");
            }
        } else {
            throw new BadCredentialsException("No user registred with this details");
        }
    }
    // трансфорМируем Set<Authority> authoritySet в List<GrantedAuthority>
    private List<GrantedAuthority> getGrantedAuthorities(Set<Authority> authoritySet) {
        List<GrantedAuthority> authorityList = new ArrayList<>();
        for (Authority g : authoritySet) {
            authorityList.add(new SimpleGrantedAuthority(g.getAuthority()));
        }
        return authorityList;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}
