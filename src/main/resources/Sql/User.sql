create database Facebook;
use Facebook;
create table SignUp_User(
id bigint not null auto_increment primary key,
First_Name varchar(40) not null,
Last_Name varchar(40) not null,
Email varchar(100) not null,
Phone_No varchar(20),
Gender varchar(10),
Date_of_Birth date not null
);

create table Log_In(
id bigint not null auto_increment primary key,
UserName varchar(100) not null,
Password varchar(100) not null,
Last_SignIn datetime,
SignUp_Id bigint,
foreign key(SignUp_Id) references SignUp_User(id)
);

create table Post(
id bigint not null auto_increment primary key,
Activity varchar(500),
Post_Description varchar(1000),
SignUp_Id bigint,
Taged_Id bigint,
foreign key(SignUp_Id) references SignUp_User(id),
foreign key(Taged_Id) references SignUp_User(id)
);

create table Comment(
id bigint not null auto_increment primary key,
Comment_Description varchar(1000),
Post_Id bigint,
Commented_By bigint,
foreign key(Post_Id) references Post(id),
foreign key(Commented_By) references SignUp_User(id)
);