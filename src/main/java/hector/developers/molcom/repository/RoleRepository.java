package hector.developers.molcom.repository;

import hector.developers.molcom.enums.RoleName;
import hector.developers.molcom.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
//	Optional<Role> findByName(RoleName name);
	Optional<Role> findByRoleName(RoleName name);
}
