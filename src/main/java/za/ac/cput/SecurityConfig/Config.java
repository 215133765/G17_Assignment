package za.ac.cput.SecurityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
//import sun.security.util.Password;

@EnableWebSecurity
 class Config extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("P@ssw0rd")
                .roles("admin")
                .and()
                .withUser("client")
                .password("12345")
                .roles("user");

    }

    @Override
    protected  void configure(HttpSecurity http) throws  Exception{
//        super.configure(http);

        http.httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST,"**/create").hasRole("admin")
                .antMatchers(HttpMethod.DELETE,"**/delete").hasRole("admin")
                .antMatchers(HttpMethod.POST, "**/update").hasRole("user")
                .antMatchers(HttpMethod.GET, "**/getAll").hasAnyRole("admin","user")
                .and()
                .csrf().disable()
                .formLogin().disable();


    }
//    @Bean
//    public PasswordEncoder encoder(){
//        return new BCryptPasswordEncoder();
//    }

}
