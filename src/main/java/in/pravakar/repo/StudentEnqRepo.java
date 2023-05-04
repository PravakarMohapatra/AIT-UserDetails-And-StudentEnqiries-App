package in.pravakar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pravakar.entity.StudentEnqEntity;

public interface StudentEnqRepo extends JpaRepository<StudentEnqEntity, Integer> {

}
