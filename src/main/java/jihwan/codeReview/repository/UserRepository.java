package jihwan.codeReview.repository;

import jihwan.codeReview.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
