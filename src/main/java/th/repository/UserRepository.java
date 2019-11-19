package th.repository;

import org.springframework.data.repository.CrudRepository;

import th.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	User findByEmail(String email);
	
}
