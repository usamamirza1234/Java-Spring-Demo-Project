Tools required https://www.jetbrains.com/idea/download/?section=windows
Download Java https://www.oracle.com/java/technologies/downloads/#java11-windows
Download Maven https://maven.apache.org/download.cgi


1.You need to change DB to MySQL by (src > main > application.properties) add this lines ( I didnot verified as i donot have MySql setup, I tested on PSQL)
spring.application.name=fhdortmund
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


2. You can do the styling and other functionalities I added basic crud for this project
