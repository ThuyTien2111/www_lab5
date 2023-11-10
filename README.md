# Spring Boot Project - Lab5

Lab5 là một dự án Spring Boot tích hợp cung cấp các chức năng quản lý thông tin liên quan đến ứng viên, công ty, kinh nghiệm làm việc, công việc, và kỹ năng. Ứng dụng này sử dụng cơ sở dữ liệu MariaDB và cung cấp các chức năng thông qua các DAO và Controllers.

## Các Package

1. **entity**: Chứa các class đại diện cho các thực thể như Address, Candidate, CandidateSkill, Company, Experience, Job, JobSkill, Skill.
2. **dao**: Bao gồm các DAO (Data Access Object) chứa các phương thức để truy cập và thao tác dữ liệu trong cơ sở dữ liệu.
    - CandidateDao: chứa các hàm logIn, getCandByYearBorn, getTotalSkillByCand, getTotalJobSkillByCand.
    - CandidateSkillDao: chứa các hàm getJobForCandidateOrderBySkill, getSkillNotHaveToLearn, getCandidateOrderBySkill.
    - CompanyDao: chứa hàm logIn.
    - ExperienceDao: chứa các hàm getMaxExpYearCandidate, getNotHaveExpCandidate.
    - JobDao: chứa các hàm getAllJobList, getAll.
    - JobSkillDao: chứa các hàm addJobSkill, calcProposedSalary.
3. **Controllers**: Chứa các controllers cho các thực thể như CandidateControll, CandidateSkillControll, SkillControll, CompanyControll, ExpControll, JobControll, JobSkillControll.
4. **Convert**: Chứa các class để chuyển đổi dữ liệu như JobForm, SkillForm.

## Lab5Application

File chính của ứng dụng là Lab5Application, nơi khởi tạo ứng dụng Spring Boot và thực hiện các demo cho các DAO.

## Cấu hình Ứng Dụng


Trong thư mục `resources` của dự án, có một file `application.properties` chứa cấu hình kết nối đến cơ sở dữ liệu MariaDB. Dưới đây là một số cấu hình quan trọng:

```properties
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.datasource.url=jdbc:mariadb://localhost:3306/week5
spring.datasource.username=root
spring.datasource.password=sapass
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8080

spring.jpa.hibernate.naming.implicit-strategy=org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyJpaImpl
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
```
## Thư Viện và Công Nghệ Sử Dụng

- Spring Boot
- MariaDB
- Maven

## Đóng góp

Nếu bạn muốn đóng góp vào dự án Lab 4 Spring Boot, bạn có thể thực hiện các bước sau:

1. Fork dự án trên [GitHub](https://github.com/ThuyTien2111/www_lab5).
2. Tạo một nhánh mới cho các tính năng hoặc sửa đổi bạn muốn thêm vào.
3. Thực hiện các thay đổi và thêm các testcase liên quan.
4. Tạo một pull request để xem xét và hợp nhất thay đổi của bạn vào dự án gốc.

Tôi hoan nghênh sự đóng góp từ cộng đồng để cải thiện dự án này.

## Tác giả

- [Thuy Tien](https://github.com/ThuyTien2111): Sinh viên năm cuối đang học tập tại IUH (Đại học Công nghiệp TPHCM).

## Một Số Hình Ảnh Của Sản Phẩm

![Ảnh mô tả sản phẩm](https://i.imgur.com/Cn2fDAE.png)
![Ảnh mô tả sản phẩm](https://i.imgur.com/12aAfAp.png)
![Ảnh mô tả sản phẩm](https://i.imgur.com/8L3NKbv.png)
![Ảnh mô tả sản phẩm](https://i.imgur.com/jlZvCyU.png)
![Ảnh mô tả sản phẩm](https://i.imgur.com/Wg8CLML.png)
![Ảnh mô tả sản phẩm](https://i.imgur.com/Ly9tglk.png)
![Ảnh mô tả sản phẩm](https://i.imgur.com/SoY1TpH.png)
![Ảnh mô tả sản phẩm](https://i.imgur.com/vZP1P6e.png)
![Ảnh mô tả sản phẩm](https://i.imgur.com/WGvQQOh.png)
![Ảnh mô tả sản phẩm](https://i.imgur.com/4TOLdpi.png)




Để biết thêm chi tiết và xem các chức năng khác của ứng dụng, vui lòng kiểm tra từng package và class tương ứng.

