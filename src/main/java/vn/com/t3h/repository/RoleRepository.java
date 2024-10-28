package vn.com.t3h.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.com.t3h.Entity.RoleEntity;
@Repository//để spring boot hiểu đây là interface repository và tự động tạo và quản lí bean
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
}
