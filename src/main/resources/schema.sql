create table jobapplicant
(
   id varchar(100) not null,
   first_name varchar(100) not null,
   last_name varchar(100) not null,
   email varchar(255) not null,
   phone varchar(50) not null,
   education_level varchar(100) not null,
   years_of_experience varchar(10) not null,
   date_created varchar(150) not null,
   primary key(id)
);


create table job
(
   id varchar(100) not null,
   name varchar(150) not null,
   description varchar(255) not null,
   type varchar(150) not null,
   years_of_experience varchar(50) not null,
   education_level varchar(150) not null
   status varchar(50) not null,
   interview_date varchar(150) not null,
   interview_start_time varchar(150) not null,
   interview_end_time varchar(150) not null,
   primary key(id)
);

