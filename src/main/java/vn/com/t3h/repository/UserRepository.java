package vn.com.t3h.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.com.t3h.Entity.UserEntity;

/**là interface được kế thừa từ jpaReposiry
 -khi khai báo userReposiry và cho kế thừa từ jpaRepository<UserEntity,Long>
 thì tương tương interface này đóng vai trò là một interface cung cấp các method xử lí
 và kết nối với database
 - interface jpaRepository đã cung cấp sẵn tất cả các hàm cơ bản như
 +getOne:lấy ra data trong Id
 +getById: lấy ra data trong database theo Id
 +findAll: lấy ra tất cả dữ liệu trong table
 +saveAll: lưu ất cả list vào database
 +save: lưu dữ liệu vào database
 ... và nhiều hàm khác
 mà UserRepository đang kế thừa jpaRepository => UserRepository sẽ tự động có tất cả các
 interface cha
 mục tiêu cuối cùng nhận được dữ lệu từ database mà k cần các bước truy vấn

 */
@Repository//để spring boot hiểu đây là interface repository và tự động tạo và quản lí bean
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
