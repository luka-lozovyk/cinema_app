package cinema.util;

import cinema.model.Role;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Set;

import static cinema.model.Role.RoleName.ADMIN;
import static cinema.model.Role.RoleName.USER;

@Component
public class DataInitializer {
    private final UserService userService;
    private final RoleService roleService;

    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(ADMIN);
        roleService.add(adminRole);

        Role userRole = new Role();
        userRole.setRoleName(USER);
        roleService.add(userRole);

        User user = new User();
        user.setEmail("user@gmail.com");
        user.setPassword("user1234");
        user.setRoles(Set.of(userRole));
        userService.add(user);

        User admin = new User();
        admin.setEmail("admin@gmail.com");
        admin.setPassword("admin1234");
        admin.setRoles(Set.of(adminRole));
        userService.add(admin);
    }
}
