# Docker commands
docker volume create ms_pg_data -d local 
docker compose -f local_setup/postgres/docker-compose-postgres.yaml up

# Hibernate ID GenerationType
	GenerationType.IDENTITY-> Database take care of it. Id is inserted by Database - insert into saving_account (balance,full_name) values (?,?)
	enerationType.SEQUENCE/AUTO Expects current_account_seq, hibernates fetches id value first - using select nextval('current_account_seq')
