create table public.employee_table (
        employee_id SERIAL,
        email varchar(255),
        employee_name varchar(255),
        salary double precision,
        primary key (employee_id)
    );