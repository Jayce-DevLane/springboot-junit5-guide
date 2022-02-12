package io.ensueno.repository;

import io.ensueno.model.Point;
import org.springframework.data.repository.CrudRepository;

public interface PointRedisRepository extends CrudRepository<Point, String> {
}
