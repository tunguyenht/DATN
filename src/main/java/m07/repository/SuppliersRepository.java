package m07.repository;


import m07.entity.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface SuppliersRepository extends CrudRepository<Supplier, Integer> {
}
