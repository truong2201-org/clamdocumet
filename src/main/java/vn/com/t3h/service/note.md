ý nghĩa và cấu trúc của tầng service

ý nghĩa : tầng được sử dụng để xử lí logic luồng 
 - request được tiếp nhận bơởi controller
 - controller chuyển request tới tầng  service
 - service xử lí logic nghiệp vụ
     vd: nghiệp vụ lấy ra dữ liệu user trong databse thông qua tầng repository
       b1: service phải thực hiện lấy ra dữ liệu từ trong  database dạng entity
        b2: chuyển dữ liệu từ dang entity sang dạng dto
       b3: trả dữ liệu dang dto cho controller
 - controller nhận được dữ liệu duưới dang dto và được trả client (user.postman,view...)