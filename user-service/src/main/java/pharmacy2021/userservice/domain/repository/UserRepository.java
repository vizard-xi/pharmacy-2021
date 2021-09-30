package pharmacy2021.userservice.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pharmacy2021.userservice.domain.model.rows.UserRow;

@Repository
public interface UserRepository extends JpaRepository<UserRow, Long> {

}
