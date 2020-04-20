package ru.otus.arch.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import ru.otus.arch.domain.Users;
import ru.otus.arch.repostory.UsersRepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDetailServiceImpl implements UserDetailService {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String name) {
        List<GrantedAuthority> ga = new ArrayList();
        ga.add(new GrantedAuthority() {
            @Override
            public String getAuthority() {
                return "best man forever";
            }
        });
        Users user = usersRepository.findByFirstName(name);
        UserDetails userDetails = new User(user.getFirstName(),user.getFirstName(),true,true,true,true,ga);
        return userDetails;
    }
}
