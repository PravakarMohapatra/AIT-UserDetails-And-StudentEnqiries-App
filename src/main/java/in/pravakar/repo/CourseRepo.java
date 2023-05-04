package in.pravakar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pravakar.entity.CourseEntity;

public interface CourseRepo extends JpaRepository<CourseEntity, Integer> {

}
