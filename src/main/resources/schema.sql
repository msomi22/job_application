

create table jobapplicant
(
   id varchar(100) not null,
   first_name varchar(100) not null,
   last_name varchar(100) not null,
   email varchar(255) not null,
   phone varchar(100) not null,
   education_level varchar(100) not null,
   years_of_experience varchar(100) not null,
   date_created timestamp not null,
   primary key(id)
);


create table job
(
   id varchar(100) not null,
   name varchar(150) not null,
   description varchar(255) not null,
   type varchar(150) not null,
   years_of_experience varchar(100) not null,
   education_level varchar(150) not null,
   status varchar(100) not null,
   interview_date date not null,
   interview_start_time timestamp not null,
   interview_end_time timestamp not null,
   date_created timestamp not null,
   primary key(id)
);

