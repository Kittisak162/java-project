# --- Sample dataset

# --- !Ups


insert into car (id,type,path,brandth,branden,name,typecar,color,year,price,desc,vote) values (1,'รถเก๋ง 4 ประตู','/assets/images/path/nissan/1.jpg','นิสสัน','Nissan','Almera E CVT Nismo Aero Package','เกียร์อัตโนมัติ','ขาว',2016,538000.00,'5555',0);
insert into car (id,type,path,brandth,branden,name,typecar,color,year,price,desc,vote) values (2,'รถเก๋ง 4 ประตู','/assets/images/path/nissan/2.jpg','นิสสัน','Nissan','Sylphy 1.6 SV CVT E85','เกียร์อัตโนมัติ','ขาว',2016,870000.00,'5555',100);

# --- !Downs

delete from computer;
delete from company;
delete from car;
