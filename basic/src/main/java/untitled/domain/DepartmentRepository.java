package untitled.domain;

import java.util.List;

import untitled.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="departments", path="departments")
public interface DepartmentRepository extends PagingAndSortingRepository<Department, Long>{
  List<Department> ();
}
