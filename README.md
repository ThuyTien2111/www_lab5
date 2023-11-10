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

Trong thư mục `resources` của dự án, có một file `application.properties` chứa cấu hình kết nối đến cơ sở dữ lsản Phẩm

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

