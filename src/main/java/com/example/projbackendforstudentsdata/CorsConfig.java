package com.example.projbackendforstudentsdata;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedOrigins("https://arjunportal-2evxhp6kr-niranjan-anr.vercel.app/")
                    .allowedMethods("GET", "POST", "PUT", "DELETE")
                    .allowCredentials(true);
}
}
